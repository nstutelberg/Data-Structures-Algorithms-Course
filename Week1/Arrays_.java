package Week1;

import java.util.Arrays;
import java.util.Scanner;

// Goal here is to create an array based on first integer I supply, then I will supply n amount of Employee IDs, and then the array will be created
// Then want to sort the array and print out all numbers within the array
public class Arrays_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();

        // This creates an empty array with a limit of `inputNum` elements. First specify the type of the array, then the name of it, then empty brackets for an empty array
        // Have to use `new` constructor to create a new instance of an array, with the int data type, and within the brackets is the length of the array that you can specify
        int numArray[] = new int[inputNum];

        for (int i = 0; i < inputNum; i ++) {
            numArray[i] = sc.nextInt();
            System.out.println("The current array is: " + Arrays.toString(numArray));
        }

        // Uses the built in quicksort algorithm to sort the array, then have to call `Arrays.toString` to convert the array to a string to it can be printed
        Arrays.sort(numArray);
        System.out.println("The final sorted array is: " + Arrays.toString(numArray));

    }
}
