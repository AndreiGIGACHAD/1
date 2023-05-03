package Lb11;

import java.util.Scanner;

public class N3
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Заполните массив");
        int mas[] = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = input.nextInt();
        }


        System.out.println("Заполненый массив");
        for (int i=0;i < mas.length;i++){
            System.out.print(mas[i]+ " ");
        }
        System.out.println();







    }
}


