// 28
package javaProgrammes;

public class VariableArguments {
    public static void main(String[] Args) {
        int[] apples = {12, 34, 3, 45, 5};
        System.out.println(total(apples));
    }

    public static int total(int... apples) {        // Argument is in brackets. We can give n no of values
        int sum = 0;
        for (int x : apples) {
            sum += x;
        }
        return sum;

    }

   /* public static int myTotal(int a, int b, int c){       // Simple argument, will get error if values increased
        int sum = a+ b + c;
        return sum;
    }

    */

}