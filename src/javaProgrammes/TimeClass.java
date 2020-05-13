// 29.a
package javaProgrammes;

public class TimeClass {
    public static void main (String[]Args){
        TimeSubClass timeSubClass= new TimeSubClass();
        timeSubClass.SetTime(12,23,57);
        System.out.println(timeSubClass.fullTime());
    }
}
