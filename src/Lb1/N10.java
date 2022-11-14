package Lb1;

import java.util.Scanner;

public class N10 {
    public static void main(String[] args) {
        int g=2022;
        Scanner sc = new Scanner(System.in);

        System.out.println("Напишите свой год рождения: ");
        int v = sc.nextInt();
        g=g-v;
        System.out.println("Ваш возраст" +" " +  g );
    }
}
