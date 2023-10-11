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
 * How to structure a tree: Say you have a root node of 50. This means that in no way can any value in the left branching path be larger than 50.
 *      Left Subtree Property: All nodes in the left subtree of a node should have values less than the value of N.
 *      Right Subtree Property: All nodes in the right subtree of a node should have values greater than the value of N.
 *      Binary Search Property: Both the left and right subtrees must also be binary search trees.
 *
 * Balance of trees: Take a node, then look at its two children. Get the difference of the heights of the children nodes, and if that difference is in (-1,0,1) for every single node,
 *      then the tree is balanced. If you look at the below example, x has a height of 2 and C has a height of 1. 2-1 = 1 so that's good. Now look at the children of x. A and B both have heights
 *      of 1, so 1-1=0 so that's good. So in this case the tree below is balanced
 *
 * Adding nodes: This is a recursive process, because as you go down through all the nodes/branches to see where to insert this new node (beacuse you need to sort the binary tree and have the
 *      new inserted node go into its proper place), all the recursive functions will return values all the way up and down the tree, so you can rebalance the tree at the same time as you
 *      insert this new node, since you are vising all the nodes anyway. After you insert the node, then you can either rotate left or rotate right such that from the root, all children are balanced
 *      Remember that a main property of a binary search tree is that elements are in order
 *
 *        N                               N                                             C          heights -> A = 0 - 0 = 0
 *       / \     Insert new node        /   \          rotate right to balance        /  \                    N = 2 - 1 = 1
 *      C   T   – – – – – – – >        C     T         - - - - - - - - - - - >       A     N                  D = 1 - 0 = 1
 *     / \                            / \                                                 / \                 T = 0 - 0 = 0
 *    A   D                          A   D                                               D  T     result -> balanced
 *                                    \                                                 /
 *                                     B                                               B
 *
 * Rotating nodes: Used when one subtree is heavier, and the binary tree is unbalanced. In a rotation, note that they are local,
 *      and the branches further down in the tree after the rotator link are left alone.
 *      IMPORTANT: if you want to do binary search you need binary trees sorted. And a sorted binary tree means that for every parent, it's left child must be less than it, and
 *      it's right child must be more than it
 *
 *
 *
 *       N                               H
 *      / \     Right Rotation          / \
 *     H   T   – – – – – – – >         C   N
 *    / \                                 / \
 *   C   L                               L   T
 *
 *  Left Rotation (used when the right subtree is heavier):
 *     G                               Y
 *    / \     Left Rotation           / \
 *   A   Y   – – – – – – – >         G   Z
 *      / \                         / \
 *     B   Z                       A   B
 *
 *
 *      * Right Rotation:
 *      *
 *      *         31                              17
 *      *        / \        ---->                /  \
 *      *      17   71                         10    31
 *      *      / \                            / \    / \
 *      *    10   27                         9  16  27  71
 *      *   /  \
 *      *   9   16
 *      *
 *      * Left Rotation:
 *      *
 *      *         20                             40
 *      *        /  \        ---->              /  \
 *      *       10   40                        20   60
 *      *           /  \                      / \   / \
 *      *          30   60                   10 30  50 70
 *      *               / \
 *      *               50  70
 *  */

public class SearchTrees {

}
