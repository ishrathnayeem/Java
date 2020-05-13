// 08
package javaProgrammes;

public class IfElseMultiple {
    public static void main(String[] Args) {
        int Maths, Physics, Chemistry;
        Maths = 57;
        Physics = 32;
        Chemistry = 45;

        if (Maths > 35 && Physics > 35 && Chemistry > 35) {     // If any condition is fail it will print Fail (And)
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        if (Maths > 35 || Physics > 35 || Chemistry > 35) {     // If any one condition is satisfied it will print Pass(OR)
            System.out.println("Pass");
        } else {
            System.out.println("Fail");

        }
    }
}