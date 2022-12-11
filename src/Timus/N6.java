package Timus;

import java.util.Scanner;

public class N6 {
    public static void main(String[] args) {

        Scanner v = new Scanner(System.in);
        int n = v.nextInt();
        int s = v.nextInt();

        int b = (n+s)-1;
        int g = b-n;
        int l = b-s;
        System.out.println(g+" "+ l);


    }
}