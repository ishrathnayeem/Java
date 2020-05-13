// 16.b
package javaProgrammes;

public class ConstructorsSubClass {
    private String mFruite;

    public ConstructorsSubClass(String fruiteName){
        mFruite = fruiteName;
    }

    public String getName(){
        return mFruite;
    }

    public void fResult(){
        System.out.printf("Your Fruite is %s\n",getName());
    }
}
