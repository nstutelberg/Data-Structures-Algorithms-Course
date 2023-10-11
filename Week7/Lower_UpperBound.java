package Week7;

/**
 * Finding the upper and lower bound is used to find the index of the first element that is lower/greater than the element you are looking for
 * Example is if 3 is the target value in the below array, lowerBound will return the index of the first element that is less than the value of 3, which is 2 (because index 2 has the value 2)
 * If you do upperBound, then the index would be 4 (because index 4 has the value 4), which is the next largest value than 3
 * Note that the array has to be sorted befeore you can do this
 * {1,2,2,3,4,5,5,6}
 *
 * Generics: generics are used in the below code and in the function definitions because generics allow you to use various types for just one function. The alternative to generics would be to
 * overload the function, which is basically making a copy of the function . Overloading is when you define two or more functions in the same scope with the same name but with different parameters.
 * The parameters must differ in type, number, or both. The compiler or interpreter determines which function to use based on the function call.
 */

public class Lower_UpperBound {
    public static void main(String[] args) {

        // Manually declare an array and use `Integer` instead of int. This is because we are using GENERICS. `Integer` is a reference type, while `int` is a primitive type.
        // Reference type is needed here because you want to reference the piece of memory that has the integer. `Integer` is a class that encapsulates the primitive `int` type within it.
        // This is important because with generics you cannot use primitive types, so you have to use the reference type of an integer with `Integer`.
        Integer[] sortedArray = {1,1,1,1,3,3,4,4,4,4,5,6,7,7,7,9,9,10};

        int upperBoundResult = upperBound(3, sortedArray);
        int lowerBoundResult = lowerBound(3, sortedArray);

        System.out.println("The upper bound algorithm for a target value of 3 returned: " + upperBoundResult + "\nAnd the lower bound algorithm for target val of 3 returned: " + lowerBoundResult);

        // Below is a small example of why generics are so helpful. Now you can call the methods on arrays of different types without using overloading.
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        String[] stringArray = {"Apple", "Banana", "Cherry"};
        System.out.println(upperBound(4, intArray));
        System.out.println(upperBound(2.2, doubleArray));
        System.out.println(upperBound("Apple", stringArray));

    }

    // The generic functions below are generics that accept a type parameter, and this parameter has to extend `Comparable<T>` so we can compare the parameters. `T` is an object, so that means
    // when you call these functions, you pass through objects into them.
    // Wrapper Classes: Instead of using primitive types (like int, char, boolean, etc.), you use their corresponding wrapper classes (Integer, Character, Boolean, etc.) when working with generics.
    // these implementations are the same as binary search except for a small change, because instead of setting mid
    public static <T extends Comparable<T>> int upperBound(T targetVal, T[] inputArray) {
        int left = 0;
        // The length is not length-1 because you want to handle the case where the insertion point is the last element
        int right = inputArray.length;

        while (left < right) {
            int mid = ((right - left) / 2) + left;;

            // Checking whether the element at the mid index is less than or equal to the target value. If target val is less than or equal to the mid element, then the upper bound must be
            // to the right of mid. So left is set to mid + 1. This is the case where the target value is here |------mid---x---|
            // Basically saying `if (inputArray[mid] <= targetVal)`
            if (inputArray[mid].compareTo(targetVal) <= 0) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return right; // returns the index where targetVal can be inserted while maintaining order
    }

    public static <T extends Comparable<T>> int lowerBound(T targetVal, T[] inputArray) {
        int left = 0;
        int right = inputArray.length; // adjust right bound for accurate lower bound

        // Keep looping until left is equal to right, meaning
        while (left < right) {
            int mid = ((right - left) / 2) + left;;

            // Basically saying ` if (inputArray[mid] < targetVal)`
            if (inputArray[mid].compareTo(targetVal) < 0) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return right; // returns the index where targetVal can be inserted while maintaining order
    }
}
