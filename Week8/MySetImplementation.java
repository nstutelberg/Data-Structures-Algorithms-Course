package Week8;

import java.util.ArrayList;


public class MySetImplementation<E> implements MySetInterface<E> {

    // Use an ArrayList to store elements. Note: This is not the most efficient
    // implementation for a set, but it keeps things simple for learning. It is just using the array functions and applying them to a set
    // Making the array private since the operations should be contained from within this file
    private ArrayList<E> elements;

    public MySetImplementation() {
        this.elements = new ArrayList<>();
    }

    @Override
    public void add(E e) {
        // Only add the element if it doesn't exist to maintain set's unique property
        if (!elements.contains(e)) {
            elements.add(e);
        }
    }

    @Override
    public void remove(E e) {
        elements.remove(e);
    }

    @Override
    public boolean contains(E e) {
        return elements.contains(e);
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }
}
