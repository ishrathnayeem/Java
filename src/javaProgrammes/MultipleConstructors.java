// 32.a
package javaProgrammes;

public class MultipleConstructors {
    public static void main(String[] Args) {
        MultipleConstructorsSub obj1 = new MultipleConstructorsSub();
        MultipleConstructorsSub obj2 = new MultipleConstructorsSub(2);
        MultipleConstructorsSub obj3 = new MultipleConstructorsSub(3, 5);
        MultipleConstructorsSub obj4 = new MultipleConstructorsSub(13, 4, 57);

        System.out.println(obj1.myTime());
        System.out.println(obj2.myTime());
        System.out.println(obj3.myTime());
        System.out.println(obj4.myTime());
    }
}