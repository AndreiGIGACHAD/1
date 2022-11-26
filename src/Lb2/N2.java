package Lb2;

import java.util.Scanner;

public class N2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        int v = in.nextInt();

        if(v%5==2){
            System.out.println("остаток равен 2");
        }
        else {
            System.out.println("остаток не равен 2");

        }

        if(v%7==1){
            System.out.println("остаток равен 1:");
        }
        else {
            System.out.println("статок не равен 1 :");

        }
    }
}
