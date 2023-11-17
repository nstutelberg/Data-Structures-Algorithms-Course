package Week10;

/**
 * Overview:
 * Set and Map interfaces can be implemented using either a binary search tree or a hash table. Hence TreeSet and TreeMap vs HashSet and HashMap
 *
 *
 * Tree vs Map Comparison (all info holds the same for both sets and maps):
 * Tree Sets and Tree Maps:
 *      TreeSet <T implements Comparable <T>>
 *      TreeSet <T> treeSet = new TreeSet<>();
 *      TreeMap<K implements Comparable<K>, V>
 *      TreeMap<K, V> treeMap = new TreeMap<>();
 *          Gives access to .compareTo()
 *          T has to implement comparable or else this won't compile since you need to compare nodes in the tree.
 *          You will iterate over the items over the items (set) or keys (map) in order
 *
 * Hash Sets and Hash Maps:
 *      HashSet<T>
 *      HashSet<T> hashSet = new HashSet<>();
 *      HashMap<K, V>
 *      HashMap<K, V> hashMap = new HashMap<>();
 *          Gives access to .equals() and .hashCode()
 *          Allows you to deal with Ts that are not comparable as long as they support .equals(), which every type should/
 *          You will iterate over items or keys in a random order
 *
 *  Summary: Use hash if you don't care about the ordering since they are faster since everything is an O(1) operation. Use tree if you care about the order
 *
 */
public class TreeSetMap___HashSetMap {
}
