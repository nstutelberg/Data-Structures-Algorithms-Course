package Week9;

/**
 * Removing all Elements Leading to a Sorted Array (HEAP SORT):
 * If you go through the heap and remove items one by one, you will eventually end up with an array sorted from small to large, after all the
 * bubbles/swaps take place. This is just a heap sort. Every time you remove an element from a heap, you place this element in a separate array.
 * Every time you remove another element from the heap, you place it in this new array, and then you do all the swaps to make sure that this
 * array is sorted. So you can remove every item from a heap and end up with a sorted array.
 * NOTE that you can also do replacements in place instead of making a separate array, having better space complexity. So for the in-place
 * sorting, you basically subdivide the array into the sorted array near the end, and the elements still in the heap at the beginning
 *
 *
 * Example of Doing In-Place Sorting with Max Heap:
 *            84
 *          /   \
 *         29     15
 *        /
 *       4
 * Ex: [84,29,15,4,      100,140,200] ... See how this is one array, but the first 4 elements are still part of the heap, and the
 *             29                                         rest of the elements have already been removed and sorted. Every time you remove an element,
 *           /   \                                        then you add another element to the sorted array and take one element from the heap. If you
 *         4     15                                       removed one more element, then it would be [29,4,15,         84,110,140,200].
 *                                                        Since 84 is removed first as the top of the heap, then 4 replaces it. But now 29 bubbles up
 *                                                        to swap with 4 to heapify the heap and make it a max heap again
 *
 * Example of In-Place Sorting with Min Heap:
 *            48
 *          /   \
 *         60     74
 *        /
 *       97
 * Ex: [1,4,9,18,     48,60,74,97] ... Now with a min heap, the sorted stuff is on the left, and the rest of the heap is on the right.
 *            60                       And if you remove 48 from the heap, then 97 would take its place and 48 would be added to the sorted array.
 *          /   \                      Then 97 would swap with 60 and the new array would be [1,4,9,18,48,       60,97,74]. Since you want to swap
 *         97     74                   97 with 60 since 60 is smaller than 74 and for a min heap you want the smallest item at the top
 *
 * You can think of a heap as being an unordered array, and you always start at the last element to begin the sorting, and go reverse through the
 * heap, and eventually you will end up with a sorted array
 *
 * Steps of Heap Sort:
 * 1. Replace the root node with the last element in the heap
 * 2. Delete the last element in the heap, since it is now replaced as the root
 * 3. Heapify the heap (means to do the swaps and bubbling until you have a valid heap again)
 *
 *
 *
 * Time complexity:
 * Heap sort is O(NlogN), because when you bubble up the tree you only use 1 side, so that is logN. But you also might need to go through the whole
 * array to move items which is O(N). So time complexity is O(NlogN).
 *
 *
 * Why is Heap Sort not Commonly Used:
 * Since you jump around the array/heap to swap elements at different indexes when you are doing bubbling, it can lead to cache misses.
 * The time complexity is the same as other sorting algorithms, but heap sort has a higher constant factor. Meaning it has more operations than other sorts.
 *      Two things can be O(NlogN), but one can be faster just because it has less code and arithmetic in its implementation
 * Heap sort also isn't "stable" which means that it doesn't maintain the priority of the elements when the sorted values are equal. Imagine you are sorting
 *      A1, A2, B1, B2. Merge sort would make sure A1 came before A2, but heap sort would just look at A's and B's and not consider the numbers.
 *      So heap sort may sort this as A2, A1, B1, B2.
 */

public class HeapSort {
}
