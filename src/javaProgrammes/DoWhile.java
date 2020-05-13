// 21
package javaProgrammes;

public class DoWhile {
    public static void main (String[] Args){
        int x = 0;

        do {                                        // Do-While first prints and then it will checks the condition
            x++;                                    // It will print atleast onetime even if the condition is false
            System.out.println(x +" Hello World!");
        }while (x < 10);

/*        while(x < 10){                            // While will first checks condition and then it prints
            x++;
            System.out.println(x + " Hello World!");
        }

 */
    }
}
