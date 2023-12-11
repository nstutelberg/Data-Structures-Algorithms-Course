package Week13;

/**
 *Overview:
 * 1) Choose one element as the starter vertex, and first initialize all their distances to infinity so that the actual distance will be smaller than that value.
 * 2) Set the distance of the starter vertex to 0.
 * 3) Add all vertices other than the starter node into a priority queue so you can see the min distances from the starter vertex. The priority queue will be a min-heap PQ to hold vertices
 * and their shortest distances.
 * 4) In the priority queue, look at all adjacent vertices to the starter node and populate their distances in the priority queue
 * 5) Remove the min element from the priority queue and use this at the starter node in the next iteration
 * 6) Look at all adjacent vertices to this new vertex (the min element removed in step 5), and add them into the priority queue. If you still have a vertex in the priority queue with a distance from the
 * starter node attached to it, and through looking at this new vertex, find a shorter path, then UPDATE the distance value of that vertex in the priority queue.
 *      Ex: Say A is the starter node. And A -> B is 3 and A- > C is 10. When you look at B, you find that B -> C is 2. So now you know that you can add 2 and 3 and get 5, which is a shorter distance
 *      than the original 10 that was populated for node C in the priority queue
 *
 *
 */
/*
       B
     /   \
    3     2
   /       \
  A --10--- C
   \       /
    5     8
     \   /
       D

 */
/*
function dijkstra(graph, startVertex):
    initialize distance map, set all distances to infinity, except startVertex to 0
    initialize a priority queue and add all vertices with their distances
    initialize a processed set (or use other means to track processed vertices)

    while priority queue is not empty:
        currentVertex = vertex in priority queue with minimum distance
        remove currentVertex from priority queue

        if currentVertex is in processed set:
            continue

        for each adjacentVertex of currentVertex:
            newDistance = distance[currentVertex] + weight(currentVertex, adjacentVertex)
            if newDistance < distance[adjacentVertex]:
                distance[adjacentVertex] = newDistance
                update adjacentVertex with newDistance in priority queue

        add currentVertex to processed set

    return distance

 */

public class DijsktrasAlgorithm {
}
