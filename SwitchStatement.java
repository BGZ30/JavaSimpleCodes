/*
    Switch statment.
    Syntax:
        switch(expression){    
            case value1:    
                //code to be executed;    
                break;  //optional  
            case value2:    
                //code to be executed;    
                break;  //optional  
            ......    
                
            default:     
                code to be executed if all cases are not matched;    
        }    
*/

public class SwitchStatement {
    public static void main(String[] args) {
        int value = 450;

        switch (value) {
        case 10:
            System.out.println("Value = 10");
            break;
        case 20:
            System.out.println("Value = 20");
            break;
        case 50:
            System.out.println("Value = 50");
            break;
        default:
            System.out.println("Value not found");
            break;
        }
    }
}