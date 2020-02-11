/*
    Loops (for, while, do-while, for-each)
    Syntax:

    for(init;condition;incr/decr){         |      while(condition){              |     do{                           |   for(Type var:array){  
      // code to be executed               |          //code to be executed      |          //code to be executed    |       //code to be executed  
    }                                      |      }                              |      }while(condition);           |   }


    NOTE:
        ** We can have a name of each Java for loop. To do so, we use label before the for loop. 
        It is useful if we have nested for loop so that we can break/continue specific for loop.

*/

public class LoopsAll {
    public static void main(String[] args) {

        // for loop
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // while loop
        int k = 0;
        while (k < 5) {
            System.out.println(k);
            k++;
        }

        // do-while
        do {
            System.out.println(k);
            k++;
        } while (k < 10);

        // for-each
        char[] arr = { 'a', 'b', 'c', 'd' };
        for (char x : arr) {
            System.out.println(x);
        }

        // Using Label for outer and for loop
        aa: for (int i = 1; i <= 3; i++) {
            bb: for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break aa;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}