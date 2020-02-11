/*
    This code checks if a year is leap or common;
    It's leap if:
        - year%4=0 and year%100!=0
        or - year%400 = 0
*/

public class LeapYear {
    public static void main(String[] args) {

        int year = 2030;

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("This is a leap year.");
        } else {
            System.out.println("This is a common year.");
        }
    }
}