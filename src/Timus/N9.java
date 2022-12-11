package Timus;

import java.util.Scanner;

public class N9 {
    public static void main(String[] args) {

        Scanner v = new Scanner(System.in);

        int k  = v.nextInt();
        int z  = v.nextInt();

        if (k % 2 == 0 || z % 2 !=0 ){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

    }
}
