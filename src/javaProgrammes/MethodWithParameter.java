// 14.a
package javaProgrammes;

import java.util.Scanner;

public class MethodWithParameter {
    public static void main(String[] Args){

        Scanner input = new Scanner(System.in);
        MethWithParaSubClass methWithPara = new MethWithParaSubClass();
        System.out.println("Enter your name :");
        String userName = input.nextLine();
        methWithPara.myName(userName);
    }
}
