/* 
    Fibonacci Series

    -Without recursion
    -With recursion
*/

public class Fibonacci {
    public static void main(String[] args) {

        GetFibo.NRec(10);
        // GetFibo.Rec(10);
    }
}

class GetFibo {

    static void NRec(int n) {
        int fibo[] = new int[n];
        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 2; i < n; i++) {
            fibo[i] = fibo[i - 2] + fibo[i - 1];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(fibo[i] + " ");
        }
    }

    /*
     * static void Rec(int n) { int[] fibo = buildArr(n);
     * 
     * if (n > 0) { fibo[i] = fibo[i - 2] + fibo[i - 1]; Rec(n - 1); }
     * 
     * for (int i = 0; i < n; i++) { System.out.print(fibo[i] + " "); } }
     */
}
