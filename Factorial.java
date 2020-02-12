
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
        Scanner s = new Scanner(System.in);

        System.out.print("Please enter a positive integer: ");
        n = s.nextInt();

        // Calculating the factorial without recursion
        findFacto.NoRec(n);
    }
}

class findFacto {
    static void NoRec(int n) {
        long facto = 1;
        int x = n;

        while (n != 0) {
            facto *= n;
            n -= 1;
        }
        System.out.println(x + "! = " + facto);
    }
}