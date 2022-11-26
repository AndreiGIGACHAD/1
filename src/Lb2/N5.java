package Lb2;

import java.util.Scanner;

public class N5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        int b = 1000;
        int c = 0;
        int v = in.nextInt();
        c=v/b;

        if(c%1==0){
            System.out.println("У введенного числа "+" "+c+" " + "тысач");
            }


    }
}
