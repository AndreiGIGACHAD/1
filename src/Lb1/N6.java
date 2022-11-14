package Lb1;

import java.util.Scanner;

public class N6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Напишите сове имя: ");
        String name = in.nextLine();



        System.out.println("Напишите совою фамилию: ");
        String age = in.nextLine();

        System.out.println("Напишите сове очество: ");
        String height = in.nextLine();

        System.out.println( "Hello" + " " + name + " " + age+  " " + height);

        in.close();

    }
}
