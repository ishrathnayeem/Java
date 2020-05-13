// 33.a
package javaProgrammes;

public class ToStringMethod {
    public static void main(String[] Args) {
        TwoStringMethodSub obj1 = new TwoStringMethodSub(04, 03, 1995);
        Composition obj2 = new Composition("Ishrath", obj1);

        System.out.println("\nPrinted from main method : "+obj1.myString());
        System.out.println(obj2);
    }
}