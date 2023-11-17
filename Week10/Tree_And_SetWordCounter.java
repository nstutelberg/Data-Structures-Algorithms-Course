package Week10;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Goal here is to take the txt file, read in word by word, clean up the spaces and commas and upper/lowercase and then append to a big long string.
 * Then with that big long string read in the words one at a time, and then we can add these words to a set to find the distinct words etc
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

        // Declare sets so that only unique words will be stored. Use an arraylist for all the words since you can only use .add() on an arraylist not an array
        HashSet<String> uniqueWordsHash = new HashSet<String>();
        TreeSet<String> uniqueWordsTree = new TreeSet<String>();
        ArrayList<String> allWords = new ArrayList<>();

        // Declare maps so that you can keep track of how many occurrences of each word there is. So the word is the key and the amount of times it shows is the value
        HashMap<String, Integer> wordCountsHash = new HashMap<String, Integer>();
        TreeMap<String, Integer> wordCountsTree = new TreeMap<String, Integer>();

        // As long as fileScanner has a word to read from the data stream `fs`, loop continues. Note that scanner
        // will read WORDS not characters, because scanner object is delimited by spaces. So it will read a full
        // word, then clean the word, then print it, then a new loop will start and the fileScanner.next() will
        // pull the next word after the whitespace
        while (fileScanner.hasNext()) {
            String s = fileScanner.next();
            s = cleanString(s);
            allWords.add(s);

            uniqueWordsHash.add(s);
            uniqueWordsTree.add(s);

            // If in the map (dictionary), there is already a count for a word, then get the current count and add 1 to it. Else place a 1 as the value for the word (key)
            // The containsKey() function is a member of the Map interface in java, and it checks if the key already exists in the map
            // The put() function inserts a new key into the map. The first value is the key, and the second is the value. So the word (s) is the key, and the count is the value
            if (wordCountsTree.containsKey(s)) {
                wordCountsTree.put(s, wordCountsTree.get(s) + 1);
            } else {
                wordCountsTree.put(s, 1);
            }

            if (wordCountsHash.containsKey(s)) {
                wordCountsHash.put(s, wordCountsHash.get(s) + 1);
            } else {
                wordCountsHash.put(s, 1);
            }
        }
        fileScanner.close();

        // Print out all the words, then the sets (hash and tree), then the maps (hash and tree)
        System.out.printf("\nThere were %d total words in the file -> ", allWords.size());
        System.out.println(allWords);
        // Hash set prints in a random order because hash sets do not preserve ordering
        System.out.printf("Hash Set | There were %d unique words in the file -> ", uniqueWordsHash.size());
        System.out.println(uniqueWordsHash);
        // Tree set prints in alphabetical order because tree set implementation in java util defaults to sorting things in ascending order
        System.out.printf("Tree Set | There were %d unique words in the file -> ", uniqueWordsTree.size());
        System.out.println(uniqueWordsTree);
        // Printing from hash map which will be random
        System.out.println("Hash Map | These are the occurrences of the words -> " + wordCountsHash);
        // printing from tree map will be alphabetical
        System.out.println("Tree Map | These are the occurrences of the words -> " + wordCountsTree);

        // Now allow for a user to enter input and returning the key to the given value. Set up the scanner for system in. Prompt for input. Save the user input, then .get() to retrieve value
        Scanner wordGetterScanner = new Scanner(System.in);
        System.out.println("Enter a word to find how many occurrences");
        String inputWord = wordGetterScanner.next();
        System.out.print(wordCountsHash.get(inputWord));
        wordGetterScanner.close();
    }
}
