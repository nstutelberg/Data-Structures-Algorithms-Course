package Week7;
/*
 * A Set in Java represents a collection of elements (similar to List and Map), but unlike
 * List, it does not allow duplicate elements. This means that every element in a Set must
 * be unique. The Java Collections Framework provides several implementations of the Set
 * interface, each with its own characteristics and use cases.
 *
 * 1. HashSet:
 *    - It uses a hash table for storage, ensuring O(1) complexity for basic operations
 *      (add, remove, contains).
 *    - It does not guarantee any specific order of the elements.
 *
 * 2. LinkedHashSet:
 *    - Extends HashSet but maintains insertion order, which means it iterates in the order
 *      elements were inserted.
 *    - Slightly slower than HashSet due to the additional linked list maintenance.
 *
 * 3. TreeSet:
 *    - Implements a Red-Black Tree providing O(log n) time complexity for most operations.
 *    - Maintains elements in a sorted order (according to natural ordering or via a
 *      provided comparator).
 *
 * Basic Set Operations:
 * ---------------------
 *    a. add(element): Adds the specified element to the set if it is not already present.
 *    b. remove(element): Removes the specified element from the set if it is present.
 *    c. contains(element): Returns true if the set contains the specified element.
 *    d. size(): Returns the number of elements in the set.
 *    e. isEmpty(): Returns true if the set contains no elements.
 *    f. clear(): Removes all of the elements from the set.
 *
 * Iterating through a Set:
 * ------------------------
 * A Set can be iterated using an iterator, for-each loop, or by converting it into an array.
 *
 * Example:
 * ```
 * Set<String> mySet = new HashSet<>();
 * for(String s : mySet){
 *     System.out.println(s);
 * }
 * ```
 *
 * Using Sets to Perform Mathematical Set Operations:
 * --------------------------------------------------
 *    a. Union: Can be performed using the addAll() method.
 *    b. Intersection: Can be performed using the retainAll() method.
 *    c. Difference: Can be performed using the removeAll() method.
 *
 * Note that while a Set restricts duplicate elements, it does not restrict null and allows
 * at most one null element.
 *
 * Use-Cases for Sets:
 * -------------------
 *    - When working with collections of unique elements where duplicates are not allowed.
 *    - When you need to perform set operations like union, intersection, and difference.
 *    - When you need to quickly check if an element is present in a collection (due to the
 *      O(1) access time in HashSet).
 *
 * Be sure to choose the specific Set implementation that best suits the needs of your
 * particular use case, taking into account factors such as ordering, speed, and
 * null-handling capabilities.
 */

public class Sets {
}
