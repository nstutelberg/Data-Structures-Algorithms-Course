package Week10;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Scanner;

/**
 * Goal here is to take the txt file, read in word by word, clean up the spaces and commas and upper/lowercase and then append to a big long string.
 * Then with that big long string read in the words one at a time and then we can add these words to a set to find the distinct words etc
 */
public class Tree_And_SetWordCounter {
    /**
     * Method to clean up the input strings
     * @param s
     * @return
     */
    private static String cleanString (String s) {

        // Object from base java that is used for creating mutable (changeable) strings
        StringBuilder sb = new StringBuilder();

        // Looping so each character of the string (s) is checked one by one. The charAt() method is used
        // to get the character at the current index. If it is lowercase, append it to the big string.
        // If not, convert it to lowercase then append it to the big string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLowerCase(c)) {
                sb.append(c);
            } else if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }
    /**
     * Method to read in the text, clean it, then print out each word
     */
    // You can add a `throws` keyword in the main function declaration to say what exception should be thrown
    // in case any part of the main function fails
    public static void main(String[] args) throws FileNotFoundException {

        // Object from base java that reads data from files. It reads the data byte-by-byte. fs is a file stream
        // that acts with scanner to give the next character when scanner requests it. Just declaring `fs` does not
        // save the entire contents of the file into `fs`. It merely opens the data stream to where other things
        // like scanner can read from the file
        FileInputStream fs = new FileInputStream("C:\\Users\\nstut\\git\\Data-Structures-Algorithms-Course\\Week10\\tiny_tale.txt");
        Scanner fileScanner = new Scanner(fs);

        // Declare a hash set of strings so that only unique words will be stored. Use an arraylist for all the words since you can only use .add() on an arraylist not an array
        HashSet<String> uniqueWordsHash = new HashSet<String>();
        TreeSet<String> uniqueWordsTree = new TreeSet<String>();
        ArrayList<String> allWords = new ArrayList<>();

        // As long as fileScanner has a word to read from the data stream `fs`, loop continues. Note that scanner
        // will read WORDS not characters, because scanner object is delimited by spaces. So it will read a full
        // word, then clean the word, then print it, then a new loop will start and the fileScanner.next() will
        // pull the next word after the whitespace
        while (fileScanner.hasNext()) {
            String s = fileScanner.next();
            s = cleanString(s);
            uniqueWordsHash.add(s);
            uniqueWordsTree.add(s);
            allWords.add(s);
        }
        fileScanner.close();

        System.out.printf("\nThere were %d total words in the file -> ", allWords.size());
        System.out.println(allWords);

        // Notice how hash set prints in a random order because hash sets do not preserve ordering
        System.out.printf("There were %d unique words in the file -> ", uniqueWordsHash.size());
        System.out.println(uniqueWordsHash);

        // Notice how a tree set prints in alphabetical order because tree set implementation in java util defaults to sorting things in ascending order
        System.out.printf("There were %d unique words in the file -> ", uniqueWordsTree.size());
        System.out.println(uniqueWordsTree);


    }


}
