/*
    Syntax:
        if(condition1){  
            //code to be executed if condition1 is true  
            }else if(condition2){  
            //code to be executed if condition2 is true  
            }  
            else if(condition3){  
            //code to be executed if condition3 is true  
            }  
            ...  
            else{  
            //code to be executed if all the conditions are false  
        }  
*/

class ifExample {

    public static void main(final String[] args) {
        int num = 207;

        if (num % 2 == 0) {
            System.out.println("Even number.");
        } else {
            System.out.println("Odd number");
        }
    }
}