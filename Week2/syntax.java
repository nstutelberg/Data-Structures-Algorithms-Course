package Week2;

import java.util.Scanner;

public class syntax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // See how max is used in an if else statement. we first have to declare it or initialize it before we can use it in the if/else block
        int max;
        String result;

        if (a>b) {
            result = "a is bigger";
            max = a;
        } else {
            result = "b is bigger";
            max = b;
        }

        int c = 35;
        while (c < 42) {
            System.out.println("a less than 42");
            c++;
        }

        System.out.println(result);
    }
}
