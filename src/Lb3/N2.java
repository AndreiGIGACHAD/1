package Lb3;


import java.util.Scanner;

public class N2 {
    public static void main(String[] args) {
        System.out.println("Введите номер деня недели:");
        Scanner in = new Scanner(System.in);
        String v = in.nextLine();
        int[] c = new int[8];
        c[1]=1;
        c[2]=2;
        c[3]=3;
        c[4]=4;
        c[5]=5;
        c[6]=6;
        c[7]=7;




        switch (v){
            case "Понедельник":
                System.out.println(c[1]);
                break;
            case "Вторник":
                System.out.println( c[2]);
                break;
            case "Среда":
                System.out.println( c[3]);
                break;
            case "Четверг":
                System.out.println( c[4]);
                break;
            case "Пятница":
                System.out.println( c[5]);
                break;
            case "Суббота":
                System.out.println( c[6]);
                break;
            case "Воскресенье":
                System.out.println( c[7]);
                break;
            default:
                System.out.println("Нет такого дня недели ");
        }
    }

}
