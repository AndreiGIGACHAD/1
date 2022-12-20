package Timus;

import java.util.Scanner;

public class N11
{
    public static void main(String args[]){

        int f[] = new int[100001];
        int g[] = new int[100001];
        Scanner cin = new Scanner(System.in);
        f[0] = 0;
        f[1] = 1;
        g[0] = 0;
        g[1] = 1;
        for (int i = 2; i < 100000; i++)
        {
            if (i % 2 == 0)
                f[i] = f[i / 2];
            else
                f[i] = f[i / 2] + f[i / 2 + 1];
            g[i] = Math.max(g[i - 1], f[i]);
        }
        while (cin.hasNext())
        {
            int n = cin.nextInt();
            if (n == 0)
                break;
            System.out.println(g[n]);
        }
    }
}