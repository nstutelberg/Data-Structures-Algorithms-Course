package Week12;

/**
 * Overview:
 * There are a lot of things that actually use graphs, and one such example is a linked list. Another is a social media network where every profile is a vertex and the connections between
 * them are the edges. Or Google Maps, every intersection is a vertex and the roads connecting them are the edges. Google maps use graph theory and Djikstra's algorithm to determine the shortest
 * path between two places. Or chess, where each board square is a vertex and the movements are the edges.
 *
 * How to Represent Graphs:
 * Use an adjacency list, which has a list of incident vertices for every given vertex. Example, if there is an undirected graph with A,B,C... then the array is [[1,2], [0,2], [0,1]], because the starting
 * array is basically [0,1,2], and the adjacency list is listing all vertices that are connected to the given vertex. So note how 0 is adjacent to 1 and 2, and 1 is adjacent to 0 and 2 etc
 * 0
 * | \
 * |  1
 * 2 /
 * To find the list of all adjacent vertices to a given vertex, it is an O(1) operation since once you create that adjacency list, all the data is there for you. So if you wanted to find all adjacent vertices
 * to 2, then you would just check index 2 in the adjacency list ([[1,2], [0,2], [0,1]]), and you would see that [0,1] is the answer. The adjacency list takes up O(V+E) space, which is just the addition
 * of all edges and vertices together since the adjacency list stores all edges and vertices in it
 *
 * How to Represent an Adjacency list:
 * Make a map + set so you can map a vertex to all its adjacent vertices -> Map<V, Set<V>> . You are use a vertex as the key, and a set of vertices ad the values since there should be no duplicates
 *
 * Time Complexity to traverse a graph:
 * To traverse a graph and explore all edges, it is O(N^2) because every vertex can connect to every other edge. Technically the complexity is O(E), but E = O(N^2)
 *
 * Time Complexity to find all edges tied to a given vertex:
 * O(v) which is how many vertices there are
 */

/*
    A directed graph representation:

    A --> B     E
     \         ^
      v       /
       C <-- D

    Description:
    - Vertices: A, B, C, D, E
    - Edges: A -> B, A -> C, D -> C, E -> D
    - The arrow (->) indicates the direction of the edge from one vertex to another.

*/
/*
    An undirected graph representation:

    A ----- B
    |     / |
    |   /   |
    | /     |
    C ----- D
    | \
    |   \
    E --- F

    Description:
    - Vertices: A, B, C, D, E, F
    - Edges: A-B, A-C, B-C, B-D, C-D, C-E, C-F, E-F
*/

public class Graphs {
}
