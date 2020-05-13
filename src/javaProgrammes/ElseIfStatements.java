// 11

package javaProgrammes;

import java.util.Scanner;

public class ElseIfStatements {
    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        int age;
        System.out.println("Enter your age :");
        age = input.nextInt();

        if (age < 18) {                                 // This is to check specific condition only
            System.out.println("You are too young");

        } else if (age == 25) {
            System.out.println("You can Marry");

        } else if (age == 50) {
            System.out.println("Your are old");
        }

        else if (age > 50) {
            System.out.println("You are too old");
        }



        if (age < 18) {                                 // This is to check two or more condition in same case
            System.out.println("You are too young");

        } else if (age > 25 && age < 40) {
            System.out.println("You are young");

        } else if (age > 40 && age < 60) {
            System.out.println("Your are old");
        }

        else if (age > 60) {
            System.out.println("You are too old");
        }
        }
    }

