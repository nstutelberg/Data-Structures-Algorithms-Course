package Week2;

/**
 * Inserting 1 element at a time
 *      when you store data into an array, in java you are setting up a fixed memory location for this array to be stored. So you cannot exceed the length of the array since it is already blocked in memory
 *      indexes are also faster since java knows where all elements in the array are stored, and they are stored right next to each other
 *      Ex: if you were to create a new array every time you wanted to add an element and you got up to a 1,000 element array (1000 units of space),
 *              you would have 500,000 total insertions since you need to recreate every time. But what happens when you want to have an array where you can add extra elements?
 * ->
 * ->
 * Inserting 8 elements at a time
 *      - These are arrays where you can add extra elements to it. Instead of creating a new array each time you want to add another element, there is another way to do it
 *      - We need to reduce the amount of insertions
 *      - A way to do this is to increase the size of the array by 8 spaces for every time you insert an element. So then when you do an insertion, you can do multiple insertions at once
 *      - So if you inserted an element 1000 times and had 1000 units of space, you would have inserted 63,000 total times. Because you can insert 8 elements at a time when the array has space for it
 *      - You still have to create a new array sometimes, but 8 times less than the first method
 *
 * Conclusion
 *      - Actually, BOTH the above methods, (1st method adding one space to the array each time, 2nd method adding 8 spaces to the array each time) have the same time and space complexity
 *      - This is because 8 is an arbitrary number, and the time still increases exponentially the more elements you add.
 *
 * Space complexity = O(N) because you will have as much space allocated as what n you are on. if n is 100, that means you need to create 100 new spaces
 * Time complexity = O(N^2) because you have to reprocess elements in the array, and that number is increased exponentially as n gets bigger. ex: 10 elements have to insert 55 times. 20 elements 190 times.
 *
 *
 * How programming languages deal with this issue -> dynamic arrays
 *      - Instead of resizing the array by n elements each time, like by 1 or by 8, you would resize it by n^2. So if you inserted 1 element, you would resize by 2. insert 2, resize by 4. insert 4, resize 8
 *      - This makes the run time for inserting elements into an array now O(N), because the growth isn't exponential, it's linear.
 *      - If you insert 1000 times and have 1000 space allocated, then the array would have 2000 TOTAL insertions
 *
 *      - New space complexity = O(N) because if you insert N elements, you will have equal to or less than 2N units of space taken up
 *      - New time complexity = O(N) because both the space taken up and the total insertions happening are linearly related. resize by 100, total insert 200 elements. resize 1000, insert 2000. linear relationship
 *
 * Other runtimes for array operations
 *      - Inserting a new record at the end = O(1) usually, but can be O(N) worst case since if there is space available, its O(1), but if you have to resize by that factor of 2N, it takes O(N) time
 *      - Removing a record at the end = O(1) usually, but can be O(N) worst case, for the same reason as above. Except now if the array becomes more than half empty, it is reduced in size in half, which is O(N)
 *      - Inserting/Removing in the middle of the array =  O(N) if you insert at the middle of the array since you have to shift all the elements over
 *      - Indexing an element = O(1) since you can index any element in the same time since all the elements and indexes are stored in memory already
 */
public class DynamicArrays {
}
