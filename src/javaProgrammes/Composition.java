// 34
package javaProgrammes;

public class Composition {                              // Main class is ToStringMethod
    private String name;
    private TwoStringMethodSub birthday;                // Composition date from TwoStringMethodSub class
    public Composition(String theName, TwoStringMethodSub date){
        name = theName;
        birthday = date;
    }
public String toString (){
        return String.format("Your name is %s and birthday is %s", name,birthday);
    }
}
