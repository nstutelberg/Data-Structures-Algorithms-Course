package Week7Constructors;

import java.util.Scanner;

/**
 * program below is a program that creates a pair of counter object with the names heads and tails, which represent the number of times a coin flip goes heads or tails
 *
 */

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter how many coin flips to do");

        Scanner sc = new Scanner(System.in);
        int numFlips = sc.nextInt();

        // Constructors here are to create instances of a class. Since in the "Counter" file, we create a Counter class, you can use "heads" or "tails" to instantiate it.
        // This is because we used `this.name` in the class definition, so when you instantiate a class, you have to input the arguments of whatever `this.etc` variables you set
        Counter heads = new Counter("heads");
        Counter tails = new Counter("tails");

        for (int i = 0; i < numFlips; i++) {
            if (RandomUtils.randNumberGenerator(0.5))
                heads.increment();
            else
                tails.increment();
        }

        // Note how heads and tails are objects, so you call methods ON TOP of them with getCount(). Since heads and tails are both classes, you do not do `getCount(heads)`
        // Since that method doesn't accept a class as an argument. It accepts no arguments, but just returns the value of the instance variable `count`
        System.out.println(" The count of heads flips is: " + heads.getCount() + "\n The count of tails flips is: " + tails.getCount());
    }
}
