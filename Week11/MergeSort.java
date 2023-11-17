package Week11;

/**
 * Overview:
 * Take the entire array, split it in half, and sort the two halves separately, which means splitting each half into more halves until you get all the way down to single element arrays. Then
 * you start at the far left and compare 2 elements together, sort them and then place them in a new array and then move to the next 2 independent items and sort, then merge them into an array.
 * Keep doing this recursively
 *
 * How to Handle odd Number of Elements in the Array:
 * When there are odd number of elements, nothing major changes.  Each subarray has the recursive function called on it separately and the function splits all subarrays until it pares everything
 * down to one element. So if one subarray goes down to one element while other subarrays have 2 elements, then the single element subarray isn't touched and the other subarrays will split one
 * more time until they, too, have one element. Then with the merging, in the first merge step, there will result in arrays with 2 elements, but there will be one array with one element still.
 * It doesn't matter what element isn't merged on the first step, but this element will be merged in the next step to create a 3 element size array, then the process will continue until there
 * is a fully sorted array
 *
 * How are Elements Sorted During the Merge Process:
 * Since after the first merge, all the arrays you are comparing and merging together are already sorted. So the method below works.
 * Say you have the numbers [4,16,39,91] and [20,50,65,74]. You take the 0 index value from left array and 0 index value from right array and compare them and place the results in a new array.
 * Whatever value is smaller is placed in the new sorted array. So with the arrays above, you would compare 4 | 20. 4 is less so the sorted array is [4]. Then compare 16 | 20, and 16 is smaller
 * so the sorted array becomes [4,16]. Then compare 39 | 20 and 20 is smaller, so sorted array becomes [4,16,20]. Then 91 | 50 and 50 is smaller so [4,16,20,50]. Then 91 | 65 and 65 is smaller so
 * [4,16,20,50,65]. Then 91 | 74 and 74 is smaller so [4,16,20,60,65]. And 91 is the last element so [4,16,20,50,65,91]
 *
 *
 * Efficiency:
 * Merge sort is NOT done in-place. You need new arrays to move things around in. So it is not as space-efficient as other algorithms like insertion sort which is in-place. It is also a stable
 * sorting algorithm, so even when there are duplicate records, their initial relative order is preserved.
 * The algorithm is O(NlogN) because it is O(N) to move up the layers and merge them and sort them. Each layer of merging and sorting is O(N), so O(N) + O(N) + O(N) etc is just O(N). But
 * it is NlogN because although you have O(N) work at each level, there are O(logN) total levels because it's a divide and conquer algorithm like binary search
 *
 *
 */

/*
Merge Sort Process Even Number Elements:

    Initial Array:
    [9, 3, 7, 5, 6, 4, 8, 2]

    Splitting:
    [9, 3, 7, 5] [6, 4, 8, 2]
    [9, 3] [7, 5] [6, 4] [8, 2]
    [9] [3] [7] [5] [6] [4] [8] [2]

    Merging:
    [3, 9] [5, 7] [4, 6] [2, 8]
    [3, 5, 7, 9] [2, 4, 6, 8]

    Final Sorted Array:
    [2, 3, 4, 5, 6, 7, 8, 9]

Merge Sort Process Odd Number Elements:

    Initial Array:
    [15, 3, 9, 8, 5, 2, 4]

    Splitting:
    [15, 3, 9] [8, 5, 2, 4]
    [15] [3, 9] [8, 5] [2, 4]
    [15] [3] [9] [8] [5] [2] [4]

    Merging:
    [3, 15] [9] [5, 8] [2, 4]
    [3, 9, 15] [2, 4, 5, 8]

    Final Sorted Array:
    [2, 3, 4, 5, 8, 9, 15]

 */
public class MergeSort {
}
