// 18
package javaProgrammes;

import java.util.Scanner;

public class SimpleAverage {
    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);

        int income;
        int total=0;
        int average;
        int x = 0;
        int y;
        System.out.println("Enter the days you want the average :");
        y = input.nextInt();

        while (x < y) {
            x++;
            System.out.println("Enter your income on day "+ x +" :");
            income = input.nextInt();
            total = total+income;
        }
        average = total/y;

        System.out.println("Your total income is : "+total);
        System.out.println("Your daily average is : "+average);
    }
}