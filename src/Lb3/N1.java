package Lb3;

import java.util.Scanner;

public class N1 {
    public static void main(String[] args) {
        System.out.println("Введите номер деня недели:");
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        String[] d = new String[8];
        d[1]="Понедельник";
        d[2]="Вторник";
        d[3]="Среда";
        d[4]="Четверг";
        d[5]="Пятница";
        d[6]="Суббота";
        d[7]="Воскресенье";



        switch (v){
            case 1:
                System.out.println(d[1]);
                break;
            case 2:
                System.out.println( d[2]);
                break;
            case 3:
                System.out.println( d[3]);
                break;
            case 4:
                System.out.println( d[4]);
                break;
            case 5:
                System.out.println( d[5]);
                break;
            case 6:
                System.out.println( d[6]);
                break;
            case 7:
                System.out.println( d[7]);
                break;
            default:
                System.out.println("Нет такого дня недели ");
        }
    }

}

