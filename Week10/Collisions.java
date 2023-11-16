package Week10;

/**
 * Overview:
 * When there is already an element in the hash table, and another element is trying to replace it in the same spot. Every element should have its own unique position. The problem
 * is when 2 or more different keys produce the same index after hashing
 *
 * Most Common Causes
 * 1) The modulo operator can cause issues because you can have two different hash codes, and when you use the modulo to take the remainder (number after the decimal), you can
 * end up with the same value. For example, 25 and 15 will both have the same index of 5 if you have an array with size 10 (2.5 and 1.5).
 *
 * 2) Pigeonhold principle, which is saying if you have more keys than you have positions in the hash table to hold them, naturally not all of them fit so there will be
 * a collision when an element tries to replace an element that's already in the hash table
 *
 * 3) Having the same hash code. This is extremely rare but the hashCode() method count potentially return the same hash code
 *
 * Ways to Prevent Collisions
 * 1) Separate Chaining: O(1)
 *      Each slot in the hash table contains a pointer to a linked list or a tree that stores all the key value pairs mapping to the same index. If multiple keys hash to the same
 *      index, their entries are added to the end of the list at that index. So if you store a linked list at the index, you can put as many data entries in that linked list
 *      as you want, since it will only occupy one index.
 *
 *      a) Insertion
 *          Compute the hash code and find the index. If the linked list at the index is empty, create a new list with the key value pair. If not, append the key value pair to the
 *          linked list.
 *      b) Search
 *          Compute the hash code for the key to find the index. Then traverse the linked list at the current index to find the key
 *      c) Deletion
 *          Compute the hash code for the key to find the index. Then traverse the linked list at current index, find the key, then remove the corresponding node from the list
 *
 * 2) Linear Probing (Open Hashing)
 *      In this method, you just place the colliding item in the next available slot in the array. It does this by checking all next available indices after the current index
 *      until it finds an empty slot. If there is not an available slot, the hash table is full, and there will be an insertion failure and you need to resize the table.
 *      Remember an efficient way if the hash table is full is to double the size, and then insert at the next open slot.
 *
 *      a) Insertion
 *          Start at current index and look at every following index until an empty slot is there
 *      b) Search
 *          Start the search at the current index and go one by one until you find the element or you reach the end of the hash table
 *      c) Deletion
 *          Deleting is tricky since removing an element can break the searching for other elements. You can mark deleted slots with a special flag indicating that they are
 *          available for future insertions, so the slot is still present but just has a flag in it. It is not completely deleted
 */
public class Collisions {
}
