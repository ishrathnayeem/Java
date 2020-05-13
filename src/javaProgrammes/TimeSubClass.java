// 29.b
package javaProgrammes;

public class TimeSubClass {
    private int hour;
    private int minute;
    private int second;
    public void SetTime(int hh, int mm, int ss){
        hour = ((hh >= 0 && hh<24 ? hh : 00));
        minute = ((mm >= 0 && mm<60 ? mm : 00));
        second = ((ss >= 0 && ss<60 ? ss : 00));
    }
    public String fullTime(){
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }
}
