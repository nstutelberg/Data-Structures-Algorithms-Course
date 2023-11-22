package Week12;

/**
 * Overview:
 * If given a graph with nodes and edges, and you want to find the shortest distance between two vertices, you need to use a weighted graph where the edges are weighted based usually on their lengths.
 * Since you have to take into account how long each edge is (like a road) to determine the shortest distance between two vertices
 *
 * Easiest way to Compute Shortest Path:
 * If all weights are 1, the breadth-first-search traversal algorithm is the fastest way to find the shortest path, because it looks through all available paths.
 * If weights are unequal, greedy method/djikstras algorithm is the best way. These are both teh same thing
 *
 * Greedy Method/ Djiskstra Algorithm:
 * Assume the graph is undirected, and is simple (has no self loops or parallel edges). Perform a weighted BFS starting at one randomly chosen vertex. First create a priority queue that contains every
 * vertex label. So while the vertex label is the key, the distance from the root node will be the value.
 * Think of a cloud expanding from the starting node. You slowly increase the size of this circular cloud, keeping track of which vertices get absorbed by the cloud first. Closer vertices will get
 * absorbed before further vertices do. Once all vertices are absorbed by the cloud, you know the distances of all vertices. When the algorithm terminates, it will have computed the shortest path
 * distance from the root node to every vertex of the graph, so it knows the shortest distance to any given vertex.
 * Every time a new value is obtained for a vertex by the expanding cloud, the value is processed for the vertex key and it is dequeued from the priority queue. The value in most cases is the distance
 *
 * Time Complexity of Djikstra Algorithm:
 * O(mlogn), where m is the number of edges and n is the number of vertices.
 *
 * Shortest Path for Weighted Directed Graphs -> Directed Acyclic Graph:
 * DAGs are faster than Djikstra's algorithm, but the graph has to be directed, so there has to be a flow of the edges that can only flow one way. It runs in O(n+m) time. DAGs involve visiting all vertices
 * of the directed graph according to the topological ordering, basically start at the source and visit all vertices in the order of the flow. The source vertex is the one that only has outgoing arrows out
 * of it. This algorithm calculates the distance it takes as you go through the flow and then picks the shortest combined distance at the end
 */
public class ShortestPaths {
}
