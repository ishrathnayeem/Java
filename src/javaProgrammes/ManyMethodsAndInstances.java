// 15.a
package javaProgrammes;

import java.util.Scanner;                                       // Importing Scanner function

public class ManyMethodsAndInstances {
   public static void main(String[] Args) {                     // Main method starts from here

       ManyMethAndInstSubClass objectMethod = new ManyMethAndInstSubClass();
                                                                // We have to create object of the class we want to use
       Scanner input = new Scanner(System.in);                  // Variable to use scanning

       System.out.println("Enter your favourite movie : ");
       String xMovie = input.nextLine();                        // Creating a variable to store input string

       objectMethod.setMovie(xMovie);                           // Calling method from other class using object name given
       objectMethod.fResult();
   }
}
