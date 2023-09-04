package Week2;

/**
 * Goal of this algorithm
 *      Make an algorithm to find all combinations of integers a,b,c that add up to n.
 *      badSolution is a brute force approach and runs in O(n^3) time, due to 3 nested loops that all go to n iterations
 *          - this solution is going through every combination of a,b,c
 *          - note that by doing a third nested loop, you have to go through the c loop n times, but you also have to go back through the a and b loops n times AGAIN
 *      goodSolution is an optimized approach and runs in O(n^2) time since the function has 2 nested loops, each going up to n iterations
 *          - this solution goes through every combo of a and b, then it sees if n-(a+b) = c is a positive or negative value. if its non-negative, then this is another valid combo that adds up to n
 *
 *      Ex: if n = 100, the good solution would have 100^2 iterations (10,000). Whereas the bad solution would have 100^3 iterations (1,000,000)
 */

/**
 * Run times ranked
 *      Constant - O(1)
 *      Logarithmic - O(logN)
 *      linear - O(N)
 *      Linearithmic - O(NlogN)
 *      Polynomial - O(N^2), O(N^3), etc.
 *      Exponential - O(2^N), O(3^N), etc.
 */

/**
 * How to identify run time
 *      - Think about the worst case of what can be the slowest the algorithm can run
 *      - Identify a basic unit of the algorithm to count (like how many loops execute per run)
 *      - Map growth of the count from step 2 to see if the growth is constant, exponential etc.
 *      - Can make a table of n on the left column, and the count on the right
 *          - Ex: if there is a function that is a one time for loop that takes every index number and multiplies it by two, and appends that to a value, it is O(n) or linear time, since n is directly correlated with run time
 *      ___n___|___count of iterations___
 *        1     |   1
 *       100    |   100
 *      1000    |   1000
 *             |
 *             |
 */
public class BigONotation {
    static int goodSolution(int n) {
        int solutions = 0;
        // go through every potential value for a
        for (int i = 0; i <= n; i++) {
            int a = i;
            // go through every potential value for b
            for (int j = 0; j <= n; j++) {
                int b = j;
                // if you already have a and b, then just find c by taking n - (a+b) and then see if c is a positive number. If it is, that means that c, when combined with a and b, are another valid combo
                int c = n - (a + b);
                if (c >= 0) {
                    solutions += 1;
                }
            }
        }
        return solutions;
    }

    static int badSolution(int n) {
        int solutions = 0;
        // go through every potential value for a
        for (int i = 0; i <= n; i++) {
            int a = i;
            // go through every potential value for b
            for (int j = 0; j <= n; j++) {
                int b = j;
                // go through every potential value for c
                for (int k = 0; k <= n; k++) {
                    int c = k;
                    // see if the three numbers are equal to the marked number
                    if (a + b + c == n) {
                        solutions += 1;
                    }
                }
            }
        }
        return solutions;
    }

    public static void main(String[] args) {
        int resultGood = goodSolution(5000);
        System.out.println(resultGood);
        int resultBad = badSolution(5000);
        System.out.println(resultBad);

    }
}
