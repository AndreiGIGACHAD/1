package Lb3;

import java.util.Random;
import java.util.Scanner;

public class N5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа ");

        int sc = in.nextInt();
        if (sc <= 0) {

        } else if (sc == 1) {


        } else {
            int[] ints = new int[sc];
            int x;
            int i = -1;
            int k=0;
            int l=0;
            int ta = 0;

            Random random = new Random();




            while (i < ints.length - 1) {
                x = random.nextInt(1000);
                k =x;
                if (k % 5 == 2 || k % 3 == 1) {
                    l = x;
                    i++;
                    ints[i] = l;
                    System.out.print(ints[i] + ", ");
                }
            }
            for (i = 0; i < ints.length; i++) {
                ta = ta + ints[i];
            }
            System.out.print( ta );
            int[] ms = new int[sc];
            int c = 0;
            for (i = 0; i < ms.length; i = x) {
                x = random.nextInt(100000);
                k = x;
                if (x % 5 == 2 || x % 3 == 1) {
                    x++;
                    ms[i] = k;
                    System.out.print(ms[i]);
                }
            }
            int ot = 0;
            for (i = 0; i < ints.length; i++) {
                ot = ot + ms[i];
            }
            System.out.print( ot);
        }
    }



}
