package javaProgrammes;

// 10
public class NestedIfCondition {
    public static void main(String[] Args){
        int age = 13;

        int Telugu = 40;
        int Hindi = 15;

        if (age >= 18){                                     // Nested If checking another condition after first condition failed
            System.out.println("You can Vote");
        }else{
            System.out.println("You are not elgible");
            if(age >= 12){
                System.out.println("You are young");
            }else{
                System.out.println("You are too Young");
            }
        }

        if (Telugu > 35){                                   // Nested If checking another condition after first condition is satisfied
            if(Hindi > 35){
                System.out.println("Passed in Hindi and Telugu");
            }else{
                System.out.println("Failed in Hindi");
            }
        }else{
            System.out.print("Failed in Telugu");
        }
    }
}
