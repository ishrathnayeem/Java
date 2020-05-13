// 33.b
package javaProgrammes;

public class TwoStringMethodSub {
    private int day;
    private int month;
    private int year;

    public TwoStringMethodSub(int d, int m, int y){
        day = d;
        month = m;
        year = y;

        System.out.printf("Printed from Constructor : %s", myString());
        System.out.printf("\nPrinted from Constructor : %s", this);
    }
    public String myString(){
        return String.format("%d/%d/%d", day,month,year);
    }
    public String toString(){
        return String.format("%d/%d/%d", month,day,year);
    }
}
