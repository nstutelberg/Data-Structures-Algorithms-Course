package Week14;

public class QuickSortMergeSortHomework {
}
/*
Quicksort

First use the starting array below and then choose the first element as pivot and go through the entire array.
starting at the first element (59, mark the first element greater than 59 starting from index 0. Then at the same time, mark the first element that is less than
59 starting at the last index. Once you get these two values, swap them. Continue this process until the two pointers cross over each other, and then swap the pivot
(value at index 0), with the left-most value you reached when the pointers crossed (from the POV of the right pointer moving left).
59 41 61 73 43 57 50 13 96 88 42 77 27 95 32 89

Step 1: 61<->32, 73<->27, 96<->42, p2 furthest left value after the 96<->42 swap is 42. Swap 42 with 59 and make 69 the middle element, splitting into 2 subarrays
    59 41 32 27 43 57 50 13 42 88 96 77 73 95 61 89
                            p2 p1

    42 41 32 27 43 57 50 13 |59| 88 96 77 73 95 61 89 final from step 1 to be used in step 2

Step2: 43<->13, p2 furthest left value after the last swap is 13. Swap pivot(42) with leftmost (13)
! 42 41 32 27 13 57 50 43 !|59| 88 96 77 73 95 61 89
               p2 p1
13 41 32 27 42 57 50 43 |59| 88 96 77 73 95 61 89 final from step 2 to be used in step 3


Step 3: 96<->61, p2 furthest left value after the last swap is 73. Swap 73 with 88
13 41 32 27 42 57 50 43 |59|! 88 96 77 73 95 61 89 !

13 41 32 27 42 57 50 43 |59| 73 61 77 88 95 96 89 final from step 3

 */
