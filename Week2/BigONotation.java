package Week2;

/**
 * Goal is to make an algorithm to find all combinations of integers a,b,c that add up to n.
 * badSolution is a brute force approach and runs in O(n^3) time, due to 3 nested loops that all go to n iterations
 *     this solution is going through every combination of a,b,c
 * goodSolution is an optimized approach and runs in O(n^2) time since the function has 2 nested loops, each going up to n iterations
 *     this solution goes through every combo of a and b, then it sees if n-(a+b) = c is a positive or negative value. if its non-negative, then this is another valid combo that adds up to n
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
        for (int i = 0; i <= n; i++) {
            int a = i;
            // go through every potential value for b
            for (int j = 0; j <= n; j++) {
                int b = j;
                for (int k = 0; k <= n; k++) {
                    int c = k;
                    if (a + b + c == n) {
                        solutions += 1;
                    }
                }
            }
        }
        return solutions;
    }

    public static void main(String[] args) {
        int resultGood = goodSolution(1000);
        System.out.println(resultGood);
        int resultBad = badSolution(1000);
        System.out.println(resultBad);

    }
}
