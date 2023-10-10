package Week7Constructors;

public class Counter {
    // Below are instance variables. Every instance of a Counter class gets its own set of the below two variables.
    private int count = 0;
    private String name;
   // This is a constructor for the Counter class. Constructors are special methods that are used to initialize objects.
   // They are declared without a return type and have the same name as the class. Think of the below code as a sort of prototype like C, or a template that you build a class from
    // When instantiating a class, you accept `name` as a parameter, and set that value to be an instance variable called `name`. This is helpful because you can set the input
    // parameter to be an instance variable. While local variables are usually tied to the scope of a method and declared within the method, instance variables are available
    // to all non-static methods, and can be accessed outside the class and changed.
    // `this.name` is referring to the above `private String name`, and `name` is referring to the input parameter `public Counter(String name)`
    public Counter(String name) {
        this.name = name;
    }

    // The below two methods are instance methods because they are tied to the Counter class after it is instantiated. When you construct a Counter class with `new Counter =
    // Counter ("stringhere");, you can then immediately call these methods below. This is because you are calling the class Counter, so you get everything in the class.
    // However, since we also have a constructor WITHIN the class, it gives you the availability to make an instance of the class and input values to store in the class
    // as instance variables. Constructors are important because they let you create a version of the class with your desired set of input params (`String name` in this example)
    public void increment() {
        count += 1;
    }
    public int getCount() {
        return count;
    }
}
