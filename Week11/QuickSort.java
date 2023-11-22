package Week11;

/**
 * Overview:
 * Recursive Method:
 *      Start with an array and choose one pivot value. The value you choose doesn't actually matter, but using the first element
 *      is the easiest. Take this pivot value, and then place all values in the array that are smaller than it in a subarray to the
 *      left. Place all values larger than the pivot into the right subarray. Then with these 2 subarrays, recursively call the
 *      function to do the process again, choosing a new pivot value and separating the values of those subarrays into further subarrays,
 *      which would lead to 4 subarrays at this point. Once you get down to subarrays with either 1 element or no elements, then you
 *      can join them back together and combine them back up until you have the final sorted array
 * Iterative Method:
 *      In this case, to implement the algorithm you need a `partition` method for splitting up the arrays into subarrays, and you need the `quicksort` method for managing the subarrays and recombining them
 *      together and doing the final sort. The iterative way
 *
 * How to Handle case Where Value is Equal to the Pivot:
 * You can implement the algorithm as placing numbers equal to the pivot in the left subarray or the right subarray. Placing
 * them in the left subarray is more straightforward so you can do that
 *
 * Decision on Which Element to Choose:
 * Picking the first or last element is the easiest, but people like to choose th middle element since you ideally want
 * the data to be split equally in the two subarrays around the pivot number. But you don't really know what value is going
 * to be the median. Choosing the middle element is technically better than first or last because in the case where the array
 * is already sorted, if you chose the first or last element all the sorted numbers would be greater than or less than the
 * value you pick, so one subaray will be much heavier. You can also shuffle and randomize the entire array before you select the pivot item
 *
 * Time Complexity:
 * Worst case of quicksort is O(N^2) when you are given an array that is already sorted, but it has an average case and best case of O(NlogN). You are less likely to run into O(N^2) behavior
 * if you randomize the array before selecting a pivot so you never try to sort a fully sorted array. With proper randomization, it's like a one in a billion change that it will be O(N^2), so it's
 * basically O(NlogN)
 *
 *
 */

/*
Initial Array:
[7, 2, 1, 6, 8, 5, 3, 4]

1st Pass (Pivot = 7):
[2, 1, 6, 5, 3, 4] [7] [8]

2nd Pass (Pivot = 2 for the first sub-array):
[1] [2] [6, 5, 3, 4] [7] [8]

3rd Pass (Pivot = 6 for the remaining sub-array):
[1] [2] [5, 3, 4] [6] [7] [8]

4th Pass (Pivot = 5):
[1] [2] [3, 4] [5] [6] [7] [8]

5th Pass (Pivot = 3):
[1] [2] [3] [4] [5] [6] [7] [8]

Final Sorted Array:
[1, 2, 3, 4, 5, 6, 7, 8]
 */
public class QuickSort {
}
