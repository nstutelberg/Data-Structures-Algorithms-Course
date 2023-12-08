package Week14;

/**
 * Hash table vs binary search tree
 *      Binary search trees need comparable keys to work like Integer or String or Double (but double isn't great to use for the comparable function).
 *      Whereas hash tables can have any keys, they just have to be able to be hashed
 *
 *      You can insert into a hash table in O(1) time but inserting in a binary search tree is O(logN) because if it's balanced you can find where you need to
 *      insert by a divide and conquer method of cutting the tree in half until you find what numbers your target number is between in the BST
 *
 *      Hash tables are represented as arrays that have indices that are created by hashing the key, whereas BSTs have to be trees
 *
 *      BST uses a little more memory than hash table because the nodes are spread around memory
 *
 *      Both hash tables and BSTs need to have immutable keys because they shouldn't ever be found. For a BST, because you could break the BST properties, and for
 *      hash table you may end up changing the hash code to an index and lose that item forever
 *
 *      Iterating over a hash table, things are returned semi-randomly, but iterating over a BST gives ordered results since the BST property by default
 *      gives you ordered numbers
 *
 * How long will it take to divide any number down to 1 using integer division? Answer: LogN
 *
 * Linked lists are inefficient on space and they do not scale since you need to use the node class to create the nodes and there is a lot of unused space. Arrays
 * have their elements stored near to each other in memory and linked lists are stored across memory and uses pointers to point to the locations.
 *
 * Heaps are represented in arrays since the tree is always filled left to right like a book so there will not be any empty spaces. Whereas binary search trees can be more
 * unbalanced and have one side of the tree be longer, meaning there would be a lot of empty spaces in the array if you tried to convert the BST to an array
 *
 * Merge sort is the only sorting method that is guaranteed to be NlogN and stable. This is the go-to sort for most cases
 *
 * For python maps/dicts, data is returned in the order in which it was added because python uses a hash table AS WELL AS a separate array that maintains the order of insertions.
 * When a new item is added to the dict, it is appended to the end of this separate array. The array just stores the indices in the hash table for the order of things that were added
 *
 * Quicksort and heapsort are not stable because elements are shifted around a lot so their ordering isn't preserved. merge sort is one where the ordering is maintained
 *
 * An issue with linked list is that it is really hard to delete something from the middle of the list. If you want to delete out of a linked list, use a doubly linked list where
 * every node has 2 pointers/references, where you have reference to the previous node AND the next node. This way, you can easily update the pointers because you can just use the pointers
 * to the previous and the next elements, and have them connect to each other and skip over the node you just deleted
 *
 */
public class FinalReview {
}







