// 13.a
package javaProgrammes;

public class MultipleClassesandMethods {
    public static void main(String[] Args){

        MultipleClassSubClass subClass = new MultipleClassSubClass();  // First we need to create an object for SubClass

        System.out.println("My Name is :");
        subClass.myName();                                          // Call object name with method name in the subclass

        System.out.println("My Age is :");
        subClass.myAge();

    }
}
