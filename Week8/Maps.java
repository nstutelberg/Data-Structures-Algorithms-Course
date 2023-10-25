package Week8;

/**
 * A Map in Java is a part of the java.util package and represents a data structure that
 * allows the storage of pairs of elements, known as keys and values. Each key is mapped to
 * exactly one value, and keys are unique. This means you cannot have duplicate keys in a Map.
 * Maps provide O(1) time complexity for basic operations like get and put, assuming
 * a good hash function.
 *
 * This is the same thing as a dictionary, or a set of key value pairs
 *
 * Example:
 *
 * Map<String, Integer> map = new HashMap<>();
 * map.put("Alice", 25);
 * map.put("Bob", 30);
 * int ageOfAlice = map.get("Alice"); // This will retrieve the value 25.
 */

// Actual code example based on the above comment:
import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);

        // After putting 2 keyval pairs into the map, print the map. And see that if you try to extract a keyval pair, it doesn't remove it from the map like dequeue() or pop() does for
        // queues and stacks respectively
        System.out.println(map);
        int ageOfAlice = map.get("Alice");
        System.out.println(map);

        System.out.println("Alice's age: " + ageOfAlice);
    }
}
