package Week9;

/**
 * Overview:
 * You take the first element of the array, compare against all other elements of the array. If the smallest element in the array is not at the current index, then you swap the smallest
 * element with what is at the current index. Repeat this process as you go, and you can do this in place because after you do the calculation for the current index, you move on
 * to the next index. And everything to the left of the current index is sorted, everything to the right is not.
 *
 * Time Complexity:
 * O(N^2) because you have to do nested for loops to go through the array to compare the elements with each other over and over again.
 * However, at most you will be doing N swaps, which is good because you only swap elements once and then they are in their final position in the sorted array
 *
 * Usage:
 * Not a lot of people use this because it is slow
 */

/* Selection Sort Algorithm Visualization:
 * Imagine an array of numbers: [29, 10, 14, 37, 13].
 *
 * Initial array: [29, 10, 14, 37, 13]
 *
 * 1st Pass:
 * - Find the smallest number (10) and swap with the first position.
 * - Sorted part: [10, Unsorted part: 29, 14, 37, 13]
 *
 * 2nd Pass:
 * - Find the smallest number (13) in the unsorted part and swap with the 29.
 * - Sorted part: [10, 13, Unsorted part: 14, 37, 29]
 *
 * 3rd Pass:
 * - Find the smallest number (14) in the unsorted part and swap with the 14 (no change).
 * - Sorted part: [10, 13, 14, Unsorted part: 37, 29]
 *
 * 4th Pass:
 * - Find the smallest number (29) in the unsorted part and swap with the 37.
 * - Sorted part: [10, 13, 14, 29, Unsorted part: 37]
 *
 * 5th Pass:
 * - Only one element left, no need to sort.
 * - Final sorted array: [10, 13, 14, 29, 37]
 */
public class SelectionSort {
}
