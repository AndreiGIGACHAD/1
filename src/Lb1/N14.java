package Lb1;

import java.util.Scanner;

public class N14 {
    public static void main(String[] args) {
        int d=+1, b, a,z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int v = sc.nextInt();
     b=v-d;
     a=v+d;
     z=v+a+b;



        System.out.println( b+" "+v +" "+ a +" "+Math.pow(z, 2));
    }
}
