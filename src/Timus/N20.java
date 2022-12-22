package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class N20 {

    public static void main(String[] args){


        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();

        int b = in.nextInt();

        int c = in.nextInt();

        out.println(a * b * c * 2);
        out.flush();

    }

}