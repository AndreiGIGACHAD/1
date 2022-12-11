package Timus;

import java.util.Scanner;

public class N10 {

    public static void main(String[] args) {

        Scanner v = new Scanner(System.in);
        int c = v.nextInt();
        int m = v.nextInt();
        int c1 = v.nextInt();
        int m1 = v.nextInt();
        int c2 = v.nextInt();
        int m2 = v.nextInt();
        int k = m-m1;
        int k1 = m2-k-m1;
        System.out.println(k1+" "+k);

    }
}