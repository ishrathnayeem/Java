// 06
package javaProgrammes;

public class MathOperations {
    public static void main(String[] Args) {
        int apples, grapes, answer;
        apples = 10;
        grapes = 5;
        answer = apples + grapes;
        System.out.println("Addition of two fruits is :" + answer);

        apples++;
        --grapes;
        System.out.println("Addition of incrimented fruits :" + (apples + grapes));

    }
}