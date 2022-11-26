package Lb2;

import java.util.Scanner;

public class N4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        int v = in.nextInt();

        if(5<=v){
            if (v<=10){
                System.out.println("Число подходит в диапозон [5 до 10]");

            }
            else{
                System.out.println("Число не подходит оно больше 10]");
            }
        }
        else {
            System.out.println("Число не подходит оно меньше [5");

        }
    }
}
