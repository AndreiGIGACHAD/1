package Lb3;

import java.util.Scanner;

public class N3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int v = sc.nextInt();
    long[] f = new long[v];
         f[0] = 0;
       f[1] = 1;
        for (int i = 2; i < f.length; ++i) {
          f[i] = f[i - 1] + f[i - 2];
            System.out.println(f[i]);
        }

    }
}
