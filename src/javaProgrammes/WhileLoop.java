// 12
package javaProgrammes;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] Args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter no of times you want to print :");

        int y = input.nextInt();
        int x=0;

        while(x < y){
            x ++;
            System.out.println(x + ". Hello World!");
        }
    }
}
