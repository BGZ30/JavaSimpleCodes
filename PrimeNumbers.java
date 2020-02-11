
/* 
    Prime Numbers.

    check if a given prime is a prime or not.
*/

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = s.nextInt();

        isPrime(num);
    }

    static void isPrime(int n) {
        if (n == 1)
            System.out.println(n + " is not a prime number.");
        else {
            int x = n / 2;
            while ((n % x != 0) && (x != 1))
                x--;

            if (x == 1)
                System.out.println(n + " is a prime number.");
            else
                System.out.println(n + " is not a prime number.");
        }

    }
}
