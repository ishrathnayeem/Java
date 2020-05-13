// 09
package javaProgrammes;

public class SwitchCase {
    public static void main (String[] Args){
        int age;
        age = 25;
        if(age == 18){                                  // You can use If Else also to check multipule conditions
            System.out.println("You can Vote");
        }
        if(age == 25){
            System.out.println("You can Marry");
        }
        if(age == 60){
            System.out.println("You can Retire");
        }
        else{
            System.out.println("You have to wait");
        }

        switch (age){                                   // Switch-Case is the alternative of If Else Statement
            case 18:
                System.out.println("You can Vote");
                break;                                  // Break is used to stop if a condition was satisfied

            case 25:
                System.out.println("You can Marry");
                break;

            case 60:
                System.out.println("You can Retire");
                break;

            default:
                System.out.println("You have to wait");
        }
    }
}
