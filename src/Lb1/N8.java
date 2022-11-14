package Lb1;

import java.util.Scanner;

public class N8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите названия дня недели: ");
        String name = in.nextLine();

        System.out.println("Введите название месяца: ");
        String name1 = in.nextLine();

        System.out.println("Введите дату : ");
        int data = in.nextInt();

        System.out.println("День недели" +" " + name +" " + "дата " +" " +data +" " + "месяц  " +" " + name1);
        in.close();

    }
}
