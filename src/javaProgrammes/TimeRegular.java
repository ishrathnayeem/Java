// 30.a
package javaProgrammes;

public class TimeRegular {
    public static void main(String[] Args) {
        TimeRegularSubclass timeRegularSubclass = new TimeRegularSubclass();
        timeRegularSubclass.SetTime(13, 23, 57);
        System.out.println(timeRegularSubclass.fullTime());
        System.out.println(timeRegularSubclass.regularTime());
    }
}
