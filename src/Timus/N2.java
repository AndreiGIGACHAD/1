package Timus;


import java.util.Scanner;

public class N2 {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        int n = v.nextInt();

       if (n<10000) {
           if (n>0){
               System.out.println((1 + n)*( n- 1 +1)/2);
           }else if (n<0){
               System.out.println((n + 1)*( 1- n +1)/2);
           }

       }
       else {
           System.out.println("Число не подходит");
       }


    }
}






