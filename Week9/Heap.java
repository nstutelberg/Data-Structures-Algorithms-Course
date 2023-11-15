package NYCSchool;

/**
 * Overview:
 * Heaps are binary trees where the parent node has a value that is less than both of its children nodes (in the case of a min heap), or where a
 * parent node has a value that is greater than both of its children nodes (in the case of a max heap)
 *
 * Min Heap:
 *
 *         1              <-- root
 *        / \
 *       3   5
 *      / \ / \
 *     7  8 9  10
 *    / \
 *   12  15
 * array representation = [1,3,5,7,8,9,10,12,15]
 *
 * Max Heap:
 *
 *         15             <-- root
 *        /   \
 *       9     10
 *      / \   / \
 *     7   8 5   3
 *    / \
 *   1   2
 * array representation = [15,9,10,7,8,5,3,1,2]
 *
 * What if the tree is not following the principles of a min heap or max heap?
 * In this case you would want to "bubble up" the value that is out of place. You can move up the tree one-by-one and replace the child node with its
 * parent node, and on and on until the tree is correct. The correct version will make sure all children have values greater than their parent nodes
 *
 * Max Heap example bubble up:
 *
 *          3            4 is not greater than 5, so you have to bubble up 4
 *         /   \
 *        5     15
 *       / \   / \
 *      4   8 20   30
 *     / \
 *   10  40
 *
 *         3              <-- root (after bubble-up)
 *        /   \
 *       4     15
 *      / \   / \
 *     5   8 20   30
 *    / \
 *  10  40
 *
 * Adding elements:
 * As long as the tree is balanced, you can add elements like a book. So in the above example, you would add a new element to the left of `8`
 * regardless of its value. Then the next element would be added to the right of 8. Then the next to the left of 20, then right of 20, then left of 30 etc
 * If the tree is not balanced, you have to balance it first so that it is not left heavy or right heavy.
 *
 *         3              <-- root (after bubble-up)
 *        /   \
 *       4     15
 *      / \   / \
 *     5   8 20   30
 *    / \
 *  10  40
 *      The fix if adding 1 to this tree would be to place it to the left of 8. Then swap 8 with 1, then swap 1 with 4, then swap 1 with 3
 *         1              after adding 1 to the left of 8 and bubbling up to maintain the min heap property
 *        /   \
 *       3     15
 *      / \   / \
 *     5   4 20   30
 *   / \  /
 * 10 40  8
 *
 *
 *  Heaps With Arrays:
 *  Heaps are represented as arrays in actuality. Since you can use each tree node as an index, you can index all the elements of a tree from left
 *  to right like you are reading a book
 *  Ex: The above tree would be this array -> [1,3,15,5,4,20,30,10,40,8]
 *
 * How to Convert Array to a Binary Tree/Heap:
 * leftChild = (2 * parent) + 1
 * rightChild (2 * parent) + 2
 * parent = (child - 1) / 2
 *
 * Try examples from the above tree. Ex: The index of `8` is 9 because using its parent, ((2*4) + 1)) == 9
 *
 *
 *
 * Removing elements:
 * For a MinHeap, when you remove an element, you remove the root element. Then you replace the root element with the last element in the
 * heap/array/binary tree. When doing swaps, in the example of a MinHeap, if the new root is a larger number and you need to do swaps and you don't know
 * what child to swap with, always swap with the smaller child/
 * Ex: if the root is 91, and the two children below are 3 and 15, you want to swap with 3 since it is smaller. Since you want the smallest item at the top
 *      If it were a max heap, you would swap with the larger number since you want the largest number at the top of the heap
 *
 *           1              After removing 1, you place 91 as the new root , then have to bubble up to satisfy the min heap property
 *         /   \
 *        3     15
 *       / \
 *      5   91
 *
 *           91              after removal you can see the value that was removed -> removalArray= [1], and 91 is the new root coming from the last element
 *         /   \
 *        3     15
 *       / \
 *      5
 *
 *           3              Now to satisfy min heap, swap 3 and 91, then need to swap 91 and 5 and now this is a valid heap
 *         /   \
 *        5     15
 *       /
 *      91
 *
 */
public class Heap {
}























