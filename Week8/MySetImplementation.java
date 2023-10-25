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

    /*
    First adding the generic function to the Node object
        You start at the root node to add the node, but you will go down through all the subtrees and see where this new value falls in by comparing the new node value to what node you're comparing
        it to. Want to add the node to the root of the current subtree. If the current node `r` is null, it means the key is not present in this location, so the new node will be
        created in this spot. Then increment numItems to keep track of the number of nodes. The next line is seeing if the new node (key) is greater or less than the current node (r).
        If our new node (key) is less than the current node, then it means the new node (key) should be inserted into the left subtree of the current node
        with the add method, which is a recursive method.

        The recursive call starts a new instance of the add method, but now the root of the subtree being examined is r.left or r.right, not just r. So basically, if you
        started at the root node and found that the new node value (key) is less than the value of the root node, then you would set r.left (the child of the root node), as the
        new root node to start at, which would bring you one layer further down in the tree and restart the process again. Then when you start the next run of the `add` method,
        the first check is to see if r == null. If this condition is true, that means there is no child for the current node, and you have found the right spot to insert the new
        node (key).

        The (c < 0) and (c > 0) checks are seeing what child to traverse down, since you are starting at a root node. If c < 0, you traverse down the left child, since key is
        less than the current node. If c > 0, that means the key (node you are wanting to insert), is greater than the current node, so you traverse down the right child subtree.

        `r == null` happens when you decide that you want to move one more level down the left or right child (depending on if your key was greater than or less than that parent
        node). When the recursive `add` method gets called, it moves one layer down and checks the value of the current node. For example, r would be null if the parent node was 10,
        and your key value was 12, so you do `r.right = add(r.right, key);`, since you want to set the right child node as the new root node. So, when you start over with the `add`
        method, you are using this right child node as the new root node. If this right child node does not exist (null), it means that you want to place your key into this position.

            20
           /  \
          10   30
         / \
        3   null

            20
           /  \
          10   30
         / \
        3   12

    In the above example, r 20 in the first run of the `add method`, then you see that 12 is less than 20, so 10 becomes r in the next run (due to recursion). Now you know that
    12 is greater than 10, so you use null as the new r root node. The first if condition tells you that r is null, so that is where you insert your value of 12

    The first if statement is only executed if you are actively creating a new node at the current root. The root updates on every call. Then, inside the next if statement, when the recursive
    method is called, `add(r.left, key);` means that you are calling the add method with r.left being the new root, and key is the node you are trying to insert

    private Node add(Node r, T key) {
    if (r == null) {
        numItems += 1;
        return new Node(key);
        }
    int c = key.compareTo(r.key);
    if (c < 0)
        r.left = add(r.left, key);
    else if (c > 0)
        r.right = add(r.right, key);

    return r;
    }

     */
    @Override
    public void add(E e) {
        // Only add the element if it doesn't exist to maintain set's unique property
        if (!elements.contains(e)) {
            elements.add(e);
            /*
            root = add(root, key);
             */
        }

    }

    @Override
    public void remove(E e) {
        elements.remove(e);
    }

    @Override
    public boolean contains(E e) {
        return elements.contains(e);
        /*
        Below code first sets the first node to be the root node, then loops as long as n is a valid node. c is initialized as this -> if the target value (key) is smaller than the current node
        we are looking at (n.key), c will be a negative number. If our target value (key) is greater than the current node, then c will return a positive number. If our target value is smaller
        than the current node we are looking at, then go to the left of the tree and set n = n.left. If our target value is greater, we want to go down the right side of the tree and do n = n.right

        Node n = root;
        while (n != null) {
            int c = key.compareTo(n.key);
            if (c < 0)
                n = n.left;
            else if (c > 0)
                n = n.right;
            else
                return true;
        }

         */
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

