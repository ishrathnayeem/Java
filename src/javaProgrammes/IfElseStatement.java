// 07
package javaProgrammes;

import java.util.Scanner;

public class IfElseStatement {
    public static void main (String[] Args){

    Scanner input = new Scanner(System.in);
        int apple,grapes;

        System.out.println("Enter the value for apples :");
        apple = input.nextInt();

        System.out.println("Enter values for Grapes");
        grapes = input.nextInt();

        if (apple == grapes){                           // You can use < , > , <= , >=, !=
            System.out.println("Correct");

        }else{
            System.out.println("Wrong");
        }
    }
}
