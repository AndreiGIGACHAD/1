package Lb1;

import java.util.Scanner;

public class N9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите названия месяца: ");
        String name = in.nextLine();

        System.out.println("Введите количество дней:");
        int data = in.nextInt();
        System.out.println("Месяц"+" "+name+" "+"количество дней"+" "+ data);
        in.close();

    }
}
