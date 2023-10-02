import java.util.Scanner;

public class RotateLeftRight {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] a = new int[n];
    
        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
    
        System.out.println("Enter the low index range:");
        int lo = sc.nextInt();
        System.out.println("Enter the high index range:");
        int hi = sc.nextInt();
    
        System.out.println("Original Array:");
        printArray(a);
    
        System.out.println("Enter `left` for a left rotation and `right` for a right rotation:");
        if (sc.next().equals("left")) {
        // Perform rotateLeft and print the result
        rotateLeft(a, lo, hi);
        System.out.println("After rotateLeft:");
        printArray(a);
        } else {
    
        // Perform rotateRight and print the result
        rotateRight(a, lo, hi);
        System.out.println("After rotateRight:");
        printArray(a);
        }
    }
    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void rotateLeft(int[] a, int lo, int hi) {
        // input validation is the same for all of these
        // can't be a null array, range has to be positive numbers and hi has to be larger than lo
        // also, there can't only be one element to rotate, which is what the last clause checks
        if (a == null || lo < 0 || hi > a.length || lo >= hi || (hi - lo < 2)) {
            // Handle invalid input
            return;
        }

        // Get the lowest element so it can be replaced at the last index spot
        // since it is rotating left, you need to handle the leftmost element that will be placed at the far other side of the array
        int lowestElement = a[lo];

        // initialize at lo because you want to start at index 0 for replacement. since index 1 will replace index 0
        // use `hi - 1` because the code below needs an element to the right of the current element in order to replace it
        // the index `hi` will be replaed by the lowestElement which was defined above
        for (int i = lo; i < hi - 1; i++) {
            a[i] = a[i + 1];
        }

        // Set the last value (index starts at 0 so hi - 1 is the last value)
        //This makes it so you can handle the first and last elements
        a[hi-1] = lowestElement;

    }

    public static void rotateRight(int[] a, int lo, int hi) {
        // same input validation conditions as above 
        if (a == null || lo < 0 || hi > a.length || lo >= hi || (hi - lo < 2)) {
            // Handle invalid input
            return;
        }

        // Now getting the highest element so it can be replaced at the lowest spot
        // use h-1 because indices start at 0, so you have to use hi-1 or else you will go out of bounds
        int highestElement = a[hi-1];

        // start at hi - 1, which is the last element, and go all the way to i > lo
        // this is because if you did >=, then there would be no more elements to the left to sue in line 43 calculation
        for (int i = hi-1; i > lo; i--) {
            a[i] = a[i - 1];
        }

        // Set the last value (index starts at 0 so hi - 1 is the last value)
        //This makes it so you can handle the first and last elements
        a[lo] = highestElement;

    }

    public static void rotateLeft(String[] a, int lo, int hi) {
        // input validation is the same for all of these
        // can't be a null array, range has to be positive numbers and hi has to be larger than lo
        // also, there can't only be one element to rotate, which is what the last clause checks
        if (a == null || lo < 0 || hi > a.length || lo >= hi || (hi - lo < 2)) {
            // Handle invalid input
            return;
        }

        // Get the lowest element so it can be replaced at the last index spot
        // since it is rotating left, you need to handle the leftmost element that will be placed at the far other side of the array
        String lowestElement = a[lo];

        // initialize at lo because you want to start at index 0 for replacement. since index 1 will replace index 0
        // use `hi - 1` because the code below needs an element to the right of the current element in order to replace it
        // the index `hi` will be replaed by the lowestElement which was defined above
        for (int i = lo; i < hi - 1; i++) {
            a[i] = a[i + 1];
        }

        // Set the last value (index starts at 0 so hi - 1 is the last value)
        //This makes it so you can handle the first and last elements
        a[hi-1] = lowestElement;
    }

    public static void rotateRight(String[] a, int lo, int hi) {
       // same input validation conditions as above 
       if (a == null || lo < 0 || hi > a.length || lo >= hi || (hi - lo < 2)) {
        // Handle invalid input
        return;
    }

    // Now getting the highest element so it can be replaced at the lowest spot
    String highestElement = a[hi-1];

    for (int i = hi-1; i > lo; i--) {
        a[i] = a[i - 1];
    }

    // Set the last value (index starts at 0 so hi - 1 is the last value)
    //This makes it so you can handle the first and last elements
    a[lo] = highestElement;
}
}