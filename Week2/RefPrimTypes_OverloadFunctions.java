package Week2;

/**
 * Overloading functions
 *
 * This is when you have a function with the same name, but has different input parameters. So you can call the same function and just pass different parameters and it will work.
 * Note that you still have to create the fucntions separately and have to specify all the types that can be inputted into it
 */
public class RefPrimTypes_OverloadFunctions {
    public static void main(String[] args) {

        // See how its the same function but there are different arguments for each
        printer(5);
        printer("hello");
    }
    public static void printer(int n) {
        System.out.println(n);
    }
    public static void printer(String n) {
        System.out.println(n);
    }
}
