/*
    This program checks whether the given number is armstrong number or not.
  
    Armstrong Number:
        A positive number is called armstrong number if it is equal to the sum of cubes of its digits. 
        
        Example: 
            153 : 1*1*1 + 5*5*5 + 3*3*3 = 153. ---> Armstrong 
            112 : 1*1*1 + 1*1*1 + 2*2*2 = 10. ---> Not Armstrong
 */

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int num, digit, digits3, n;
        java.util.Scanner s = new Scanner(System.in);

        do {
            System.out.print("Please enter a positive integer: ");
            num = s.nextInt();
        } while (num < 0);

        n = num;
        digits3 = 0;

        while (num != 0) {
            digit = num % 10;
            digits3 += digit * digit * digit;
            num /= 10;
        }

        if (digits3 == n)
            System.out.println(n + " is an Armstron number.");
        else
            System.out.println(n + " is not an Armstron number.");
    }
}