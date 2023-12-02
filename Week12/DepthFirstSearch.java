package Week12;

/**
 * Overview:
 * It is like exploring a maze and carrying a can of silly string with you that you paint as you explore different paths. You go between nodes through the edges, and when an edge leads you
 * to an unexplored node/edge, you explore that whole path until you reach either a node with no edges off of it, or a node you already visited. If either of these cases are met, you go back
 * one level and explore all the edges that are attached to that node. Once you exhaust those, you go back a level and you keep doing this until you are back at the starting point and all
 * nodes and edges have been visited. Utilizes recursion. This algorithm does not find the shortest path to any node, but it finds ONE path at least to the node. BFS is the one that finds the shortest path
 *
 * Example for the graph shown below:
 * For DFS, you want to start with the first node, and see all the adjacent nodes. Then you pick a path and follow that path, keeping track of all the adjacent nodes on the way. You only want
 * to keep note of unexplored edges, so if an edge is already explored, you don't go down it. As you progress to a node, after you write down all the adjacent nodes to this current nodes, look at all
 * the old traversals, and if you have visited the node before, then cross them off the list of nodes.
 *
 * Data Structure Tie In:
 * This is basically a stack, since you are adding things to this DFS flow, and removing the last thing that we added. So DFS uses a stack with recursion so that you will pop all the nodes you recently
 * visited off the stack first. This is why when we find a fully explored node with all its edges fully explored, we backtrack to a node with unexplored edges and explore those edges. This way, you can
 * keep the call stack small for the recursive calls. If you went all the way back to the first node, your call stack would get too big
 *
 * DFS Flow. Nodes that have already been visited are crossed out and marked by (-):
 * node A, the unexplored edges are -> B/E/F
 * node B, the unexplored edges are -> A/F/C
 * node C, the unexplored edges are -> D/G
 * node D, the unexplored edges are -> G/H
 * node G, the unexplored edges are -> -C/-D/J/K/L
 * node J, the unexplored edges are -> I/K
 * node I, the unexplored edges are -> -J/M/N/E
 * node E, the unexplored edges are -> -A/-I/F
 * node F, the unexplored edges are -> -A/-B/-E        Here we finally reached a node where we have already explored all the nodes that the edges lead to. So we stop here, and go one node back
 *                                                     and explore all the unexplored edges that the node leads to. The order doesn't matter. Note that for each node, I listed the potential edges
 *                                                     we could go down since they were unexplored. However, you choose one path to go down right when you find an unexplored edge. So F is the first
 *                                                     node where all the nodes that are connected by the edges have already been explored
 *                                                     Stack -> [A,B,C,D,G,J,I,E,F] -> [A,B,C,D,G,J,I,E]
 *
 * backtracked to node E, the unexplored edges are -> -A/-I/-F         E can get removed from the stack as F has been fully explored now. Stack -> [A,B,C,D,G,J,I,E] -> [A,B,C,D,G,J,I]
 *
 * backtracked to node I, the unexplored edges are -> -J/M/N/-E
 *
 * node N, the unexplored edges are -> M/O/-I/K
 * node K, the unexplored edges are -> -G/L/-J/-N/O
 * node O, the unexplored edges are -> -N/-K/P
 * node P, the unexplored edges are -> L/-O
 * node L, the unexplored edges are -> H/-K/-P
 * node H, the unexplored edges are -> -D/-L                    H can get removed from the stack as it has been fully explored. Stack -> [A,B,C,D,G,J,I,N,K,O,P,L,H] -> [A,B,C,D,G,J,I,N,K,O,P,L]
 *
 * backtracked to node L, the unexplored edges are -> -H/-K/-P                  L can get removed from the stack as H has been fully explored now. Stack -> [A,B,C,D,G,J,I,N,K,O,P,L] -> [A,B,C,D,G,J,I,N,K,O,P]
 *
 * backtracked to node P, the unexplored edges are -> -L/-O                 P can get removed from the stack as L has been fully explored now. Stack -> [A,B,C,D,G,J,I,N,K,O,P] -> [A,B,C,D,G,J,I,N,K,O]
 *
 * backtracked to node O, the unexplored edges are -> -N/-K/-P                  O can get removed from the stack as P has been fully explored now. Stack -> [A,B,C,D,G,J,I,N,K,O] -> [A,B,C,D,G,J,I,N,K]
 *
 * backtracked to node K, the unexplored edges are -> -G/-L/-J/-N/-O                K can get removed from the stack as O/L have been fully explored now. Stack -> [A,B,C,D,G,J,I,N,K] -> [A,B,C,D,G,J,I,N]
 *
 * backtracked to node N, the unexplored edges are -> M/-O/-I/-K
 * node M, the unexplored edges are -> -I/-N                                    M can get removed from the stack as it has been fully explored. Stack -> [A,B,C,D,G,J,I,N,M] -> [A,B,C,D,G,J,I,N]
 *
 * backtracked to node N, the unexplored edges are -> -M/-O/-I/-K             N can get removed from the stack as M has been fully explored now. Stack -> [A,B,C,D,G,J,I,N] -> [A,B,C,D,G,J,I]
 *
 * backtracked to node I, the unexplored edges are -> -J/-M/-N/-E             I can get removed from the stack as M/N have been fully explored now. Stack -> [A,B,C,D,G,J,I]  -> [A,B,C,D,G,J]
 *
 * backtracked to node J, the unexplored edges are -> -I/-K             J can get removed from the stack as I/K have been fully explored now. Stack -> [A,B,C,D,G,J]  -> [A,B,C,D,G]
 *
 * backtracked to node G, the unexplored edges are -> -C/-D/-J/-K/-L             G can get removed from the stack as J/K/L have been fully explored now. Stack -> [A,B,C,D,G]  -> [A,B,C,D]
 *
 * backtracked to node D, the unexplored edges are -> -G/-H             D can get removed from the stack as G/H have been fully explored now. Stack -> [A,B,C,D]  -> [A,B,C]
 *
 * backtracked to node C, the unexplored edges are -> -D/-G             C can get removed from the stack as D/G have been fully explored now. Stack -> [A,B,C]  -> [A,B]
 *
 * backtracked to node B, the unexplored edges are -> -A/-F/-C             B can get removed from the stack as A/F/C have been fully explored now. Stack -> [A,B]  -> [A]
 *
 * backtracked to node A, the unexplored edges are -> -B/-E/-F             A can get removed from the stack as B/E/F have been fully explored now. Stack -> [A]  -> []
 */
/*
Graph example for above
  A---B---C---D
  | \ |   | / |
  E---F   G   H
  |     / | \ |
  I---J---K---L
  | \   / |   |
  M---N---O---P
 */
public class DepthFirstSearch {
}
