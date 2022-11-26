package Lb2;

import java.util.Scanner;

public class N3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        int v = in.nextInt();

        if(v%4==0){
           if (10<v){
               System.out.println("Число подходит");

           }
           else{
               System.out.println("Число не подходит оно меньше 10");
           }
        }
        else {
            System.out.println("Число не подходит оно не делиться на 4");

        }
    }
}
