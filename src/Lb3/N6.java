package Lb3;
import java.util.Scanner;
public class N6 {

    public static void main(String[] args) {

        System.out.println("Введите массив");

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int[] ints = new int[x + 1];
        if (x >= 0) {
            int b = 0;
            int i = 0;
            while (i < ints.length - 1) {
                b++;
                if (b % 5 == 2) {
                    i ++;
                    ints[i] = b;
                    System.out.println(ints[i]);

                }
            }

        }
    }



}
