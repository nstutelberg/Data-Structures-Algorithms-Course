import java.util.EmptyStackException;

/**
 * An interface is created so that you can reuse more complex functions across the program. In this case, you are creating a stack, so you want to be able to use these functions
 * for all stacks you encounter
 * Used for things like google navigation. When you navigate to pages, it keeps all the previous pages you visited in a stack, and when you go back to the previous page, it pops
 * one element off of the top of the stack and gives you the last site you visited. This is an O(1) operation
 * 
 */


public class AbstractDataTypes {


    public static void main(String[] args) {
        Stack<Integer> stack = new ArrayStack<>();

        // Pushing 3 items in the order 1,2,3. So now 3 will be at the top of the stack and it will be removed first
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack size: " + stack.size()); // Should print 3

        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        System.out.println("Stack size after popping all elements: " + stack.size()); // Should print 0
    }

    public interface Stack<E> {

        // Pushes an element onto the top of the stack.
        void push(E item);

        // Removes and returns the element at the top of the stack.
        E pop();

        // Returns the number of elements in the stack.
        int size();

        // Checks if the stack is empty.
        boolean isEmpty();

        // Removes all elements from the stack.
        void clear();
    }

    public static class ArrayStack<E> implements Stack<E> {
        private Object[] elements;
        private int size;
        private static final int DEFAULT_CAPACITY = 10;

        public ArrayStack() {
            elements = new Object[DEFAULT_CAPACITY];
            size = 0;
        }

        public void push(E item) {
            if (size == elements.length) {
                // If the array is full, double its capacity
                ensureCapacity(size * 2);
            }
            elements[size++] = item;
        }

        @SuppressWarnings("unchecked")
        public E pop() {
            if (isEmpty()) {
                throw new EmptyStackException();
            }
            E item = (E) elements[--size];
            elements[size] = null; // To avoid memory leak
            return item;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }

        public void clear() {
            for (int i = 0; i < size; i++) {
                elements[i] = null;
            }
            size = 0;
        }

        private void ensureCapacity(int capacity) {
            if (capacity < size) {
                return; // Do nothing if requested capacity is smaller
            }
            elements = java.util.Arrays.copyOf(elements, capacity);
        }
    }


}

