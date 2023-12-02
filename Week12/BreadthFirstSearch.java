package Week12;

import java.util.LinkedList;
import java.util.Queue;
/**
 * Overview:
 * Instead of recursion like Depth First Search, this algorithm defines a spanning tree. It proceeds in rounds and subdivides the vertices/nodes into levels. It starts with an anchor
 * vertex which is the starting point, and looks at all the nodes/vertices that are connected to the anchor vertex through edges. Then it goes another layer down. You keep track of the
 * vertices waiting to be visited in a queue. And keep track of the distance of the edges, and keep track of the path we came from. Since you go through the algorithm level-by-level, you will
 * find the shortest distance to each vertex. However it only works when weights are all equal between the nodes. In real life cases like google maps there will be weights, so you
 * will need to use Djikstra's algorithm to solve problems where there can be different distances or weights on the edges
 *
 * Pseudocode:
 * Initialization
 *      S = starting vector of what node to start at
 *      Q = queue of vertices that are waiting to be checked
 *      S.marked = True... since you need a way to mark a vertex whether it has been visited
 *      S.distance = 0...since you need to measure the distance of the edge that led you to this vertex
 *      S.from = null...since you need to keep track of the vertex you came from
 * Code
 *      // Queue the first vertex into the queue.
 *      Q.enqueue(S)
 *      while Q is not empty (!Q.empty) {
 *         // take the next vertex off the queue. This below code is talking about moving from one vertex to another where v is the first vertex and you move to w
 *         v = Q.dequeue()
 *
 *         for (every adjacent vertex) {
 *              // if v hasn't been visited, then the distance of w (the next node in the sequence), is the distance of v + 1. And w.from is v so you can keep track of the vertex before you visited w
 *             if (!v.marked) {
 *                 w.distance = v.distance + 1
 *                 w.from = v
 *                 w.marked = true
 *
 *                 // Add the recently visited vertex to the queue since it is now marked/visited
 *                 Q.enqueue(w)
 *             }
 *         }
 *      }
 * More info on the process:
 * For every vertex, you keep track of whether it was marked/visited, the distance between the previous vertex and the current vertex, and what vertex you came from. An easier way to implement
 * this in java is to make a class for the functions to check marked, distance, and from..and then you can use a main method to call this constructor and these methods.
 *      Marked method -> use a map {vertex, T/F Boolean} or use a Set<vertex> since you can use .contains() to see if something is marked vs using the T/F Boolean value marker
 *      Distance method -> just return the distance counter that is tied to every vertex
 *      Path/previous node method -> use a stack so you can add all the previously visisted vertices to the stack and then pop them off since you want the most recently visited vertex
 *
 * Using the graph below:
 * Starting from A, you enqueue A into the queue, then go into the while loop and dequeue A since the queue is not empty. A is assigned to v and you then look at all adjacent vertices to A
 * You can set S.marked = true, S.distance = 0, and S.from = null since this is the first node. Now calculate all adjacent vertices
 *      B -> S.marked = true, S.distance = 0 + 1 (v+1) = 1, and S.from = A. Add B to queue with B.enqueue()
 *      E -> S.marked = true, S.distance = 0 + 1 (v+1) = 1, and S.from = A. Add E to queue with B.enqueue()
 *      F -> S.marked = true, S.distance = 0 + 1 (v+1) = 1, and S.from = A. Add F to queue with B.enqueue()
 * Now all adjacent vertices to A have been visited so the while loop restarts, and first step of the while loop is to remove the first element off the queue [B,E,F], so remove B and now B->v
 * Starting from B...
 *      A -> since A is already marked `if (!v.marked)`, you ignore the remaining code for A. The above assignments for A are the same
 *      F -> since F is already marked `if (!v.marked)`, you ignore the remaining code for A. The above assignments for F are the same
 *      C -> S.marked = true, S.distance = 1 + 1 (v+1) = 2, and S.from = B. Add B to queue with B.enqueue()
 * All Adjacent vertices to B have been visited so while loop restarts. First step of while loop is to remove first element from queue [E,F,C], so remove E and now E->v
 * Starting from E...
 *      A -> code ignored since A is marked. S.marked = true, S.distance = 1, S.from = A
 *      F -> code ignored since F is marked. S.marked = true, S.distance = 1, S.from = A
 *      I -> S.marked = true, S.distance = 1 + 1 (v+1) = 2, and S.from = E. Add E to queue with E.enqueue()
 * All adjacents have been visited so loop restarts. Take [F,C,I] and remove F. Now F->v and start from F
 *
 * If you have a v vertex that you have already marked and visited all the adjacent vertices for, then just remove the next element from the queue and go down that path.
 * Eventually you will have all the distances of all the vertices in relation to your starting vertex, which in this case is A. From the example above, you see that the distance to B is 1
 * because B is right next to A. But the distance to C is 2 because B was 1, and C is 1 more than B since it is adjacent to B. So this process will have all the distances attached to each vertex
 * in relation to how far away from A it is
 *
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
public class BreadthFirstSearch {
}
