package Week1;

// Public means that the method is available to all other modules in the project
// static means that there is no other outside data that is needed to be passed through the method. If you are passing parameters into the method, it wouldn't be static
// The example below is passing just an array of strings into the main function
// Every file has to have a class and that class has to be the same as the file name. And within the class, all code has to be nested in a method

public class HelloWorld {
    /***
     * Task 1 - Just do a simple hello world. Note that for the code to be executable, there needs to be a main method in the class definition
     * @param args
     */
   public static void helloWorld(String[] args) {
        System.out.println(5);
    }

    public static void main (String[] args) {
        helloWorld(args);
    }
}
