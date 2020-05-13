// 25
package javaProgrammes;

public class ArrayForAndEnhancedFor {
    public static void main(String[] Args) {
        int[] apple = {12, 23, 45, 34, 78, 57};
        int total = 0;
        int totalV = 0;

        for (int x : apple) {                       // Enhanced For Loop
            totalV += x;
        }
        System.out.println("Total is : " + totalV);


        for (int i = 0; i < apple.length; i++) {    // For Loop
            total = total + apple[i];
        }
        System.out.println("Total is : " + total);
    }

}