package Week7;

/**
 *
 * We will mostly be using binary search trees, so that each parent can have at most 2 children. These are important because they run in O(logn) because every node traversed
 * cuts the data in half.
 * For binary search trees, you always start at the root, and smaller keys go to the left, and larger keys go to the right. If you are thinking about where to place a new node and you want an
 *      ordered binary tree, you follow the branch of numbers most closely aligned to it, and if it is smaller than the leaf node, put the new value to the left. and if it's not, place to the right
 *      Think of it like this. Every time you put a new value into a binary search tree, compare if it is less than or greater than each node and if less, place to left, and if greater, place to right
 *      And keep going until you reach a node where you can place a new node, but make sure there are no more than 2 children. And if you have to pick between placing a node to the left or to the right,
 *      remember that smaller values always go to the left node
 *
 * How to keep a tree balanced: Use AVL trees, or can use recursion to go down the tree and restructure it, or can use Red/Black trees
 * AVL Tree: Trees where the height of each branch is within 1 unit of each other. Meaning the tree has to have very similar structure throughout
 * Red Black Trees:
 *
 *
 * Internal Nodes: Nodes that have children. So if a node has anything under it, it is an internal node.
 * External Nodes: Nodes that have no children. If nothing branches off of the node in question, it is external
 *
 * Complexity: Finding the height of the tree is an O(n) operation, because you visit each node once only. You use recursion to go down a certain path and get the height,
 *      then once you reach a leaf node (null node / end node), you move one node to the right and see the height of that one and if it has any children. Once you get the height of one
 *      path, you save the value and keep checking other paths. You don't climb back up the same path, you just jump one node to the right and then calculate the height of that path
 *      If the tree is unbalanced and only has one path branching off the root, it will take O(n) to traverse the tree. If the tree is balanced, it is O(logn)
 *
 * Height of trees: Height is 1 if there is only the root. Every extra layer after that adds an extra level of height
 *
 * Balance of trees: Take a node, then look at its two children. Get the difference of the heights of the children nodes, and if that difference is in (-1,0,1) for every single node,
 *      then the tree is balanced. If you look at the below example, x has a height of 2 and C has a height of 1. 2-1 = 1 so that's good. Now look at the children of x. A and B both have heights
 *      of 1, so 1-1=0 so that's good. So in this case the tree below is balanced
 *
 *  Basic idea of Right Rotation (RR) and Left Rotation (LR) on binary tree:
 *  Right Rotation (used when the left subtree is heavier):
 *
 *       y                               x
 *      / \     Right Rotation         / \
 *     x   C   – – – – – – – >        A   y
 *    / \                                 / \
 *   A   B                               B   C
 *
 *  Left Rotation (used when the right subtree is heavier):
 *     x                               y
 *    / \     Left Rotation           / \
 *   A   y   – – – – – – – >         x   C
 *      / \                         / \
 *     B   C                       A   B
 *
 *
 *      * Right Rotation:
 *      *
 *      *         z                              y
 *      *        / \        ---->               /  \
 *      *       y   D                          x    z
 *      *      / \                            / \   / \
 *      *     x   C                          A  B  C   D
 *      *    / \
 *      *   A   B
 *      *
 *      * Explanation:
 *      * The tree is rotated around the node 'z'. 'y' becomes the new root, 'z' becomes the right child of 'y',
 *      * and 'C', previously the right child of 'y', becomes the left child of 'z'.
 *      *
 *      * Left Rotation:
 *      *
 *      *         x                              y
 *      *        / \        ---->              /  \
 *      *       A   y                         x    z
 *      *          / \                       / \  / \
 *      *         B   z                     A  B  C  D
 *      *            / \
 *      *           C   D
 *      *
 *      * Explanation:
 *      * The tree is rotated around the node 'x'. 'y' becomes the new root, 'x' becomes the left child of 'y',
 *      * and 'B', previously the left child of 'y', becomes the right child of 'x'.

 *  Note that after rotation, the tree must still be a valid binary search tree!
 *  In a rotation, note that they are local, and the branches further down in the tree after the rotator link are left alone.
 *  */

public class SearchTrees {

}
