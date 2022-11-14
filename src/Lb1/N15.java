package Lb1;

import java.util.Scanner;

public class N15 {
    public static void main(String[] args) {
        int c, z;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число: ");
        int v = sc.nextInt();
        System.out.println("Введите число: ");
        int g = sc.nextInt();
        c=g+v;
        z=g-v;
        System.out.println( c+" " + z );
    }
}
