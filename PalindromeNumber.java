
/* 
    Palindrome Number.

    check if a given number is palindrome
*/

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = s.nextInt();

        isPalindrome(num);
    }

    static void isPalindrome(int n) {
        int n2 = 0;
        int num = n;

        while (n != 0) {
            n2 = (n2 * 10) + n % 10;
            n /= 10;
        }

        if (n2 == num)
            System.out.println(num + " is a palindrome number.");
        else
            System.out.println(num + " is not a palindrome number.");

    }
}
