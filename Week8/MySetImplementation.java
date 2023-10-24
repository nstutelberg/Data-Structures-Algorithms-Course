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

    @Override
    public int recomputeHeight() {
        // Not writing this function, but the idea is that you start at any node, and calculate its height. Then you calculate the height of the sibling nodes
        // and take the max of those two values. Then you add 1 to that value and so you know what the height of the parent is
        // n.height = Math.max(height(n.left) + height(n.right)) + 1;  --------> this code is getting the max height of the two sibling nodes and adding one to it to get the
        // height of the parent node. Then whenever you add a node, this recomputeHeight function is called at the end of adding the node so you can recalculate the height
        // of the tree after the node was added
        return 1;
    }


    // Example of using recomputeHeight at the end of adding a node so you can update the new height
    // Code decides where to put the new node, then recomputes height
    /*
    private Node add(Node r, T key) {
        if (r == null) {
            numItems += 1;
            return new Node(key);
         }

         int c = key.compareTo(r.key);
         if (c < 0)
            r.left = add(r.left, key);
         else if (c > 0)
            r.right = add(r.right,key);

         recomputeHeight(r);

         return r;
      }
     */
}

