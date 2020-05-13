// 26
package javaProgrammes;

public class ArrayMethods {
    public static void main(String[] Args) {
        int[] apples = {10, 20, 30, 40, 50, 60};

        for(int y:apples){                          // Storing array in a variable
            System.out.println(y);
        }

        System.out.println();                       // To give space

        changeX(apples);                            // calling the method and assigning values of apple
        for (int y : apples) {                      // storing values of new array in y
            System.out.println(y);
        }
    }

    public static void changeX(int[] dummy) {       // creating a method with no array values
        for (int i = 0; i < dummy.length; i++) {
            dummy[i] += 5;
        }
    }
}
