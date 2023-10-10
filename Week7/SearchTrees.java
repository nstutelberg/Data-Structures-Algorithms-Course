package Week7;

/**
 *
 * We will mostly be using binary search trees, so that each parent can have at most 2 children. These are important because they run in O(logn) because every node traversed
 * cuts the data in half
 *
 * Internal Nodes: Nodes that have children. So if a node has anything under it, it is an internal node.
 * External Nodes: Nodes that have no children. If nothing branches off of the node in question, it is external
 *
 * Complexity: Finding the height of the tree is an O(n) operation, because you visit each node once only. You use recursion to go down a certain path and get the height,
 * then once you reach a leaf node (null node / end node), you move one node to the right and see the height of that one and if it has any children. Once you get the height of one
 * path, you save the value and keep checking other paths. You don't climb back up the same path, you just jump one node to the right and then calculate the height of that path
 */
public class SearchTrees {
}
