/*
    Syntax to Declare an Array in Java:
        dataType[] arr; (or)  
        dataType []arr; (or)  
        dataType arr[];  
    
    Instantiation of an Array in Java:
        arrayRefVar = new datatype[size];

    Ex: 
        int a[]=new int[5];//declaration and instantiation 
        int a[]={33,3,4,5};//declaration, instantiation and initialization  
        printArray(new int[]{10,22,44,66});//passing anonymous array to method  

    Syntax to Declare Multidimensional Array in Java
        dataType[][] arrayRefVar; (or)  
        dataType [][]arrayRefVar; (or)  
        dataType arrayRefVar[][]; (or)  
        dataType []arrayRefVar[];   
    
    Example to instantiate Multidimensional Array in Java:
        int[][] arr=new int[3][3]; //3 row and 3 column

    //declaring and initializing 2D array  
    int arr[][]={{1,2,3},{2,4,5},{4,4,5}};
*/

public class TestOverloading2 {
    public static void main(String[] args) {
        System.out.println(Adder.add(11, 11));
        System.out.println(Adder.add(12.3, 12.6));
    }
}

class Adder {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }
}