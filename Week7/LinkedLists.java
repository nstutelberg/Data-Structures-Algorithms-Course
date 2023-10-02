package Week7;

/**
 * These are dynamic data structures that you can add and remove from as you need to. Operations are all O(1) time. Linked lists are stored as nodes that have references to the following nodes.
 * The actual data of the node is stored as well as the pointer that is used as a reference for other nodes to connect to. The final node should have a null pointer to indicate the end of the list
 * Linked lists vs Arrays:
 *      Linked lists can actually be slower for removing and adding elements than arrays because it takes a long time for your computer to search in memory for the pointers
 *      You can use indices to search arrays in O(1) time, but for linked list you have to traverse every preceding node in the list to find the one you want, which is O(n)
 *      Arrays are stored in contiguous memory, whereas linked lists can have their references scattered
 * You want to track the number of items in the linked list so that it is O(1) and not O(n), since you don't have to search through all the nodes
 * Inserting a new node, you have to adjust the refernece of the previous node and set the reference of the current node to the next node
 *
 * Time complexity: O(1) for every single operation. first element, last element, insert, remove
 * Space complexity: O(n) where n is the number of total elements in the list
 */
// Define the Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Define the LinkedList class
class LinkedList {
    Node head;

    // Method to add a node at the end of the list
    void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    // Method to remove the first occurrence of a node with a specific value
    void remove(int data) {
        if (head == null) return;  // Empty list, nothing to remove
        if (head.data == data) {
            head = head.next;  // Remove head
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;  // Bypass the node to remove it
        }
    }

    // Method to print the list
    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(10);
        list.append(20);
        list.append(30);
        list.printList();  // Output: 10 20 30
        list.remove(20);
        list.printList();  // Output: 10 30
    }
}

