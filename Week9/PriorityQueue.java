package Week9;

/**
 * Overview:
 * Priority queue is when you queue and dequeue items according to their priority. So say the priority is based on the number value. In a priority
 * queue, you can insert 50, then insert 100. Then if you dequeue, it will dequeue 100 instead of 50, even though 50 was inserted first and usually
 * it is a first in, first out system.
 *
 * Use Case:
 * This type of queue is useful for responding to traffic on a website for example, where maybe you have higher priority clients and lower
 * priority clients. Like if you are entering for a taylor swift raffle queue and you grab a number from the website. The website wants to respond to
 * people in the order of the number they have, so you would use a MinPQ to return the minimum elements in the queue before the larger ones
 *
 * MinPQ:
 * Meant to find the minimum item of the queue, regardless of what order they arrive in
 * Below is an implementation for a Minimum priority queue. It includes all the functions below
 * `removeMin()` removes then minimum item, and `min()` returns the minimum element without removing it
 * `insert`, `size` and `isEmpty()` are the normal functions we always add to queues, so nothing changes there
 *      void insert (T key)
 *      T min()
 *      T removeMin()
 *      int size()
 *      boolean isEmpty()
 *
 * MaxPQ:
 * Below is an implementation for a Minimum priority queue. It includes all the functions below
 *      void insert (T key)
 *      T max()
 *      T removeMax()
 *      int size()
 *      boolean isEmpty()
 *
 * Time complexity:
 * priority queues when operated properly, have an O(logN) complexity. O(N^2) when used incorrectly.
 *
 * Unordered Array Time Complexity
 * To insert an item, it is O(1) since you just insert it wherever, probably at the end. And no re-sizing takes place.
 * To remove an item, it is O(N) because you have to shift the items over to cover the missing space, or else you have inefficient space complexity
 *
 * Ordered Array Time Complexity
 * Insertion is O(N) because the worst case is that the new number you want to insert is the smallest number and needs to be placed at the front of the
 * array, which would require you to shift all elements of the array over.
 * Removal is O(1) because it is ordered so you know that you can take an element form the end.
 */
public class PriorityQueue {
}


















