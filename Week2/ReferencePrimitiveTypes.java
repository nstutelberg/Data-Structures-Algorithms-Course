package Week2;
import java.util.Scanner;

/**
 * Algorithm here is used to find a target value and return its index. This function works for ararys of string and arrays of ints
 *
 * Notice how for findInt, we use the `==` operator but we use `.equals()` for strings. This is because primitive types are treated differently than reference types
 * The primitive types are boolean , byte , char , short , int , long , float and double .
 * All other types are reference types, so classes, which specify the types of objects, are reference types.
 * A primitive-type variable can store exactly one value of its declared type at a time.
 *
 * For reference types like strings, it's almost like a pointer. Java stores not the string, but the reference to where the string is stored. So when you compare two strings with `==`, what is actually
 * being compared is the reference number of the two strings. Sometimes the underlying values can be stored in the same reference area in memory, but not usually. That is why sometimes you can use `==` and
 * it will actually work if you get lucky enough. But generally, if you want to compare the actual string value and not the reference ID of where the strings are stored, you have to use `.equals`
 *
 * For primitive types, In Java, primitive types are stored in memory differently than reference types (objects). Primitive types are simple data types that represent single values,
 * such as numbers or characters. They are stored directly in memory and are not objects. These values are stored as bits and bytes in memory and you can directly access their values
 *
 * Reason why...->
 * Strings for example are more complicated than primitive types like int. Int has a fixed length, so java knows relatively how much space is going to be needed. Strings are objects and can vary wildly in
 * length. So java needed another strategy to store these values. Also, Strings in Java are instances of the String class, which is an object. Objects in Java come with additional overhead, such as headers for bookkeeping information, reference pointers,
 * and methods that can be invoked on the object. Primitive data types like int do not have this overhead because they are not objects.
 */
public class ReferencePrimitiveTypes {

    public static int findInt(int[] a, int value) {
            for (int i = 0; i < a.length; i++) {
                // Use `==` because ints can only take the == operator. You can't use `equals`
                // on an int. This is because ints are primitive types and are not objects.
                // Ints are just pure values, so .equals doesnt work
                if (a[i] == value) {
                    return i;
                }
            }
            return -1;
        }

        public static int findString(String[] b, String value) {
            for (int i = 0; i < b.length; i++) {
                // Have to use `equals` here because `==` is checking for equivalent values in their
                // MEMORY locations. It is seeing if these two string objects are the same in that
                // they are stored in the same place in memory. On the other hand, `equals` is just
                // checking if the actual VALUE is the same, regardless of if they're different objects
                if (b[i].equals(value)) {
                    return i;
                }
            }
            return -1;
        }

    /**
     * NOTE: you can create a function that can be used for strings and ints
     * There can be two functions with the exact same name as long as their input parameters are different
     * This is helpful if you want to use the function for strings and integers, and don't want to create two different named functions
     * Just pass a string or an int into the function call, and it will work.
     * I didn't show an example here because strings and ints use `==` and `.equals`, so I can't reuse the same function in this case without it being annoying to do
     */

    public static void main(String[] args) {
            int[] a = {1,2,3,4,5,6,7,8,9,10};
            String[] b = {"a", "b", "c", "d", "e", "f", "g"};
            int resultA = findInt(a, 8);
            int resultB = findString(b, "c");

            System.out.println(resultA);
            System.out.println(resultB);

        }
    }

    // This can also be done using a generic. This allows for one function to work with multiple data types. below is the example of how that would be implemented. vs making 2 functions

/*

    public class ReferencePrimitiveTypes<T> {

        public static <T> int find(T[] a, T value) {
            for (int i = 0; i < a.length; i++) {
                if (a[i].equals(value)) {
                    return i;
                }
            }
            return -1;
        }

        */


