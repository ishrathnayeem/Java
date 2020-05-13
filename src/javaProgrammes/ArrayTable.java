package javaProgrammes;

public class ArrayTable {
    public static void main(String[] Args) {
        System.out.println("Index\tValue");

        int[] apple = {12, 14, 23, 45, 57};

        for (int i = 0; i < apple.length; i++) {            // To print values as a table
            System.out.println(i+ "\t\t" +apple[i]);
        }
    }
}
