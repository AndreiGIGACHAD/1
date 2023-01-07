package Lb3;
import java.util.Scanner;
public class N4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите два  числа");
        int a = in.nextInt();
        int b = in.nextInt();


        int c=0;
        int d=0;
        int s=0;
        int x=0;

        if (a > b) {
            c = a - b + 1;
            d = b;
            s = a;
            System.out.println( b  + a);

        }else {
            c = b - a + 1;
            d = a;
            s = b;
            System.out.println(  a  + b);
        }

        int[] ints = new int[c];

        for (int i = 0; i < ints.length; i ++) {
            ints[i] = d + i;

        } x = d; while (x != s) {
            x = d ++;
            System.out.print(x);
        }
    }




}


