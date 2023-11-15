package Week9;

/**
 * Overview:
 * Hashes are codes given that uniquely identify something. They are a 32 bit integer key to represent an object. A way to generate hash codes is to use prime numbers, and
 * multiplying prime numbers by other prime numbers. In java, hash tables are just arrays with hash codes
 *
 * How to Give a Hash Value for any Given Value (Key):
 * key ----> function to generate hash code ----> output integer -----> %M modulo operator to divide the has code to an index value -----> output index value of where key is stored
 *
 * 1) Use the hashCode() method of the String class to generate a hash code for the key. This method returns an int
 *      `int hashCode = keyString.hashCode();`
 *
 * 2) Make sure that there are no negative values for the hash code. It is really rare but it can happen like one in a billion times
 *      `int hash = Math.abs(hashCode);`
 *
 * 3) Convert the hash code into a valid index for the hash table. This is because the hash code is meant to uniquely identify a key and make sure that each key has only ONE
 * spot that it can be at. This avoids the case of collisions. An example is if you have 12345 as the hash value and the array has a size of 10. 12345/10 = 1,234.5, so the
 * modulo operator returns 5 since .5 is the remainder of that division. This method of finding the index to place the key is important because it ensures the index is always
 * within the bounds of the array. For example, if the array has 10 elements, the modulo will only return an index between 0 and 9.
 * Once you have the index, you store the original key there. The hash code is just used to store each key in a unique place in the array
 *      `int index = hash % (myHashTable.length - 1)`
 *

 * Time Complexity:
 * Adding an element and getting an element all run in O(1) time.
 */
public class Hashes {
}
