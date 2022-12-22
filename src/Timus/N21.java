package Timus;

import java.util.Scanner;

public class N21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int tt = in.nextInt();
        int s = in.nextInt();
        int f = in.nextInt();
        if (f > s)
        {
            int y = (f - s-1) * (2 * tt + t) + 2 * tt;
            System.out.print(y);
        }
        else System.out.print((s - f)*(tt+tt+t)+t);


    }
}