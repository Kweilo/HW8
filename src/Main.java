import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача 1
       int [] meow = new int [3];
       meow[0] = 1;
       meow[1] = 2;
       meow[2] = 3;
       double [] meow2 = {1.57,7.654,9.986};
        int [] meow3 = new int[13];
        for (int cat = 10; cat < 13; cat++) {
            meow3[cat] = 34;
            System.out.println(meow3[cat]);
        }
        //Задача 2
        for (int m1 = 0; m1 < meow.length - 1; m1++) {
            System.out.print(meow[m1] + ", ");
        } System.out.print(meow[meow.length - 1] );
        System.out.println();
        for (int m2 = 0; m2 < meow2.length - 1; m2++) {
            System.out.print(meow2[m2] + ", ");
        } System.out.print(meow2[meow2.length - 1] );
        System.out.println();
        for (int m3 = 0; m3 < meow3.length - 1; m3++) {
            System.out.print(meow3[m3] + ", ");
        }
        System.out.print(meow3[meow3.length - 1] );
        System.out.println();

        //Задача 3
        for (int m1 = meow.length - 1; m1 > 0; m1--) {
            System.out.print(meow[m1] + ", ");
        } System.out.print(meow[0] );
        System.out.println();
        for (int m2 = meow2.length - 1; m2 > 0; m2--) {
            System.out.print(meow2[m2] + ", ");
        } System.out.print(meow2[0] );
        System.out.println();
        for (int m3 = meow3.length - 1; m3 > 0; m3--) {
            System.out.print(meow3[m3] + ", ");
        }
        System.out.print(meow3[0] );
        System.out.println();

        //Задача 4
        for (int cat = 0; cat < meow.length; cat++) {
            if (meow[cat] % 2 != 0) {
                meow[cat] = meow[cat] + 1;
            }
        }
        System.out.println(Arrays.toString(meow));
    }
}