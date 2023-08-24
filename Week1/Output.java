package Week1;

import static java.lang.Double.sum;

//
public class Output {
    public static void main(String[] args) {
        double[] startingArray = { 2.7, 1.6, 9.5, 2.8, 4.9 };
        double numberSum = 0.0;

        // Want to take the sum of all the values in the array and divide it by the total
        for (int i = 0; i < startingArray.length; i++) {
            numberSum += startingArray[i];
        }
        // Getting the mean of the array
        double numAvg = (numberSum / startingArray.length);
        System.out.println(numAvg);

        // How to do an f string or a .format like in python. The syntax is first supplying the entire string and all the substitutions that will be made
        // The second part after the string are all the values that will be substituted in for the `%x` part. The percent symbol is always the same, but the `x` will change depending on the data type
        /*
         * Common Format Specifiers and Corresponding Data Types for printf:
         *
         * %d - int: Decimal integer
         * %f - float or double: Floating-point number
         * %s - String: String representation
         * %c - char: Character
         * %b - boolean: Boolean value (true or false)
         * %x or %X - int: Integer in hexadecimal (lowercase or uppercase)
         * %o - int: Integer in octal
         * %e or %E - float or double: Floating-point number in scientific notation (lowercase or uppercase)
         * %% - N/A: Prints a literal '%' character
         *
         */
        System.out.printf("The amount of numbers is %d and the mean average is %f and the sum of all of them is %f", startingArray.length, (numAvg), numberSum);
    }
}
