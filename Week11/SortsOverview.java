package Week11;

/**
 * Stable = preserves the original ordering of duplicate elements
 *
 * Sort            |  Worst   |  Avg     |   Best   |
 * __________________________________________________
 * Selection Sort  |  O(N^2)  |  O(N^2)  | O(N^2)   |    In place, not stable, does very few swaps so this is good if swaps are very expensive. Like moving pallets is swap intensive since you need a forklift
 * Insertion Sort  |  O(N^2)  |  O(N^2)  |  O(N)    |    In place, stable, really fast for small arrays due to the small constant factor, good if array is almost already sorted
 * Heap Sort       | O(NlogN) | O(NlogN) | O(NlogN) |    Not recursive,not stable, no extra memory needed, in place, bad cache behavior since you grab things from all over memory and distant parts of array.
 *                                                       Good for embedded systems since you usually don't worry about cache, guaranteed O(NlogN)
 * Merge Sort      | O(NlogN) | O(NlogN) | O(NlogN) |    If it's already sorted, it becomes O(N), recursive, uses extra memory for creating arrays, great cache behavior, stable, guaranteed O(NlogN)
 * Quick Sort      | O(N^2)   | O(NlogN) | O(NlogN) |    Worst case is if it's already sorted since all values will go to one subarray and you have to pare the array down by basically just removing the pivot,
 *                                                       not stable
 */
public class SortsOverview {
}
