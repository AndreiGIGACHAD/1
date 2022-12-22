package Timus;

import java.util.Scanner;

public class N18 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int k = in.nextInt();
        int n = in.nextInt();

        int s = 0;

        for (int i=0; i<n; i++){
            int x = in.nextInt();
           s = s+x-k;
           if (s<0){
               s=0;
           }
        }
        System.out.println(s);
    }
}
