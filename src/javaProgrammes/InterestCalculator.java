// 20
package javaProgrammes;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] Args){
        // simple Interest P*R*n
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Principle Amount : ");
        double principle = input.nextDouble();
        System.out.println("Enter your Rate of Interest : ");
        double rate = input.nextDouble()/100;
        System.out.println("Enter the no of months you want to calculate Interest : ");
        int months = input.nextInt();
        double simpleInterest;
        int x;
        double compoundIntrest;

        simpleInterest = principle+principle*rate*months;                   // Simple Intrest Calculation
        System.out.println("Total Simple Interest is : "+simpleInterest);


        for (x=1; x<=months; x++){                                         // compound Intrest P(1+R)^n
            compoundIntrest = principle*Math.pow(1+rate,months);
            if (x >= months) {
                System.out.println("Total Compound Interest is : " + compoundIntrest);
            }
        }
    }
}
