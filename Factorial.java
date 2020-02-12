
/*
    Calculating the Factorial.

    NOTE: to get (n!), n must be geater than or equal zero.

    Implemented using two methodes:
        - With recursion
        - Without recursion
*/
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n;
        long facto;

        Scanner s = new Scanner(System.in);

        System.out.print("Please enter a positive integer: ");
        n = s.nextInt();

        // Calculating the factorial without recursion
        facto = findFacto.NoRec(n);
        System.out.println("Without Recursion, " + n + "! = " + facto);

        // Calculating the factorial with recursion
        facto = findFacto.Rec(n);
        System.out.println("With Recursion, " + n + "! = " + facto);
    }
}

class findFacto {
    static long NoRec(int n) {
        long facto = 1;

        while (n != 0) {
            facto *= n;
            n -= 1;
        }

        return facto;
    }

    static long Rec(int n) {
        if (n == 0)
            return 1;
        else
            return (n * Rec(n - 1));

    }
}