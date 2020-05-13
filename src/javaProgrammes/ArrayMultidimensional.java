// 27
package javaProgrammes;

public class ArrayMultidimensional {
    public static void main(String[] Args) {
        int apples[][] = {{2, 3, 1, 4, 5}, {3, 57, 54, 32, 2}, {45, 90, 5}};

        System.out.println("Apples Table");
        otherOne(apples);

        int grapes [][] = {{23,23,4,5,6},{34,56,32,22,44,4},{5,7,89,3}};

        System.out.println("\nGrapes Table");
        otherOne(grapes);
    }

    public static void otherOne(int dummy[][]) {
        for (int r = 0; r < dummy.length; r++) {
            for (int c = 0; c < dummy[r].length; c++) {
                System.out.print(dummy[r][c] + "\t");
            }
            System.out.println();
        }
    }
}