package Week1;

import java.util.Scanner;

// Goal here is to do a loop to read a number, and then go through each number and sum all of the individual numbers to get one total summed number
public class Loops {
    public static void main(String[] args) {

        // have to allow for importing of user input and then save that input as the number to iterate over
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int amountNumsToAdd = sc.nextInt();

        // Index starts at zero, then say that you will do the loop for all `i` that are smaller than the length of the integer first given as input, then `i++` increments the index every time
        for (int i = 0; i < amountNumsToAdd; i++) {
            int numToAdd = sc.nextInt();
            sum += numToAdd;
        }

        // Close the scanner to save resources. Just good practice
        sc.close();
        System.out.println(sum);
    }
}
