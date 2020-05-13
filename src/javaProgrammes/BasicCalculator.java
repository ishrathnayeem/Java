// 05
package javaProgrammes;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);

        double fNum,sNum,myResult;

        System.out.println("Enter your First Number :");
        fNum = input.nextDouble();

        System.out.println("Enter your Second Number :");
        sNum = input.nextDouble();

        myResult = fNum + sNum;

        System.out.println("The Result is :" +myResult);
    }
}
