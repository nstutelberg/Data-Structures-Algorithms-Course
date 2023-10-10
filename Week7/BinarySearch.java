package Week7;

/**
 *
 */
public class BinarySearch {
    public static void main(String[] args) {

        // First create and populate the array with some numbers
        int[] searchArray = new int[10];
        for (int i = 0; i < searchArray.length; i++) {
            searchArray[i] = i + 1;
        }
        System.out.print("Array contents: ");
        for (int number : searchArray) {
            System.out.print(number + " ");
        }

        // Call binary search and save value into variable and print the result
        int binarySearchResult = binarySearch(4, searchArray);
        System.out.println("\nPosition of the target value in the array: " + binarySearchResult);

        int binarySearchResult2 = binarySearch(11, searchArray);
        System.out.println("\nPosition of the target value in the array: " + binarySearchResult2);

    }

    public static int binarySearch(int targetVal, int[] inputArray) {
        // Need to first initialize the length of the array
        int left = 0;
        int right = inputArray.length - 1;

        // Keep looping while there is a valid subarray to loop through. Left is always going to be less than or equal to right if there are values to search. Once this is not the case, the
        // while loop is exited, and -1 is returned if nothing is found
        while (left <= right) {

            // Have to make sure that you are updating mid while in the loop since the search subarray should change for every loop
            int mid = ((right - left) / 2) + left;
            System.out.println("\nthe middle value is " + mid);

            // Conditions to check. First, if the value at the current index matches the target value, then return the index and exit loop
            // If value is not at current index, then do conditions to cut search array in half.
            if (inputArray[mid] == targetVal) {
                return mid;
            }
            else if (targetVal < inputArray[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
