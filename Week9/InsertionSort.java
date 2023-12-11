package Week9;

/**
 * Overview:
 * When you add a new element, you run an upperBound() function at the current index element, and that finds the next element that is higher than the current element. Wherever
 * this breakpoint is, that is where you are going to take the new element at the end, and replace it with the index that upperBound() found. Then you will have to shift all elements
 * to the right by one space to make room for this element you just inserted from the last position in the array. This is an in-place sorting algorithm.
 *
 * Sorting an Element in the case of an ASCENDING array:
 * When you have an element that you want to find out how to include it in the sorted portion of the array, you start with the furthest right value of the sorted array, and work
 * backwards one by one. Once you find an element smaller than your current element, you place the current element to the right of that smaller element.
 *
 * Sorting an Element in the case of a DESCENDING array:
 * Get the element you want to put into the sorted list, then work backwards starting at the end of the array and working backwards. You will sequentially go backwards
 * element-by-element until you find a larger element, then you place it to the right of that.
 *
 * Time Complexity:
 * O(N^2), but it is actually N^2/4, whereas selection sort is N^2/2. So although they have the same big O, insertion sort can be twice as fast because of the lower common factor
 * of .25. Also insertion sort is stable because if there are two elements that are the same, their position will stay the same. Selection sort would mix up the 2 equal elements
 * so it is not ideal if you want to order duplicate elements in a specific way (like if the elements have other data tied to them that makes them distinct).
 */

/*
    Insertion Sort Visualization for an ascending array:
    NOTE: Go back sequentially through the array until you find a value SMALLER than the current element, then insert to the right

    Initial array: [5, 2, 4, 6, 1, 3]

    1. First element (5) is considered sorted by default.

    [5], 2, 4, 6, 1, 3

    2. Insert 2 into the sorted portion. You compare the 5 with 2, and since it's greater, you place it to the right:

    [2, 5], 4, 6, 1, 3

    3. Insert 4 into the sorted portion. Compare 4 with 5, and since it is less than 4, keep going. Then compare to 2, and since it's bigger than 2, insert 4 after 2:

    [2, 4, 5], 6, 1, 3

    4. Insert 6 into the sorted portion. Compare 6 with 5, and since 5 is less than 6, insert to the right of 5:

    [2, 4, 5, 6], 1, 3

    5. Insert 1 into the sorted portion. Compare 1 with 6, then 5, then 4, then 2. We never came across a number smaller than 1, so we place 1 at the beginning:

    [1, 2, 4, 5, 6], 3

    6. Insert 3 into the sorted portion. 3 was less than 6 and 5 and 4, but 2 was smaller, so insert to right of 2:

    [1, 2, 3, 4, 5, 6] - Sorted array

    Each step involves taking the next element and inserting it into its correct position in the sorted part of the array.



    DESCENDING order, where you take current element, and go back sequentially until you find a number LARGER than your current value, then place to the right
    Initial array: [5, 2, 4, 6, 1, 3]

    1. start with 5

    [5], 2, 4, 6, 1, 3

    2. Compare 2 with 5. 5 is larger than 2, so place 2 to the right

    [5,2], 4, 6, 1, 3

    3. Compare 4 with the sorted array. Find that 5 is greater than 4, so place 4 to the right of 5

    [5,4,2], 6, 1, 3

    4. Compare 6 with sorted array. You never find a number larger than 6, so place 6 all the way left.

    etc etc etc

*/
public class InsertionSort {
}
