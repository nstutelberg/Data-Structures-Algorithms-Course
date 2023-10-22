package Week8;

public class MySetTestProgram {
    public static void main(String[] args) {
        MySetInterface<Integer> mySet = new MySetImplementation<>();

        // Add elements
        mySet.add(1);
        mySet.add(2);
        mySet.add(2);  // Duplicate, shouldn't be added
        System.out.println("Size after adding elements: " + mySet.size()); // Should be 2

        // Check contains
        System.out.println("Contains 2? " + mySet.contains(2)); // Should be true

        // Remove element
        mySet.remove(2);
        System.out.println("Contains 2 after removal? " + mySet.contains(2)); // Should be false

        System.out.println("Is my set empty? " + mySet.isEmpty());

    }
}

