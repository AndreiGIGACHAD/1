package Timus;

import java.util.Scanner;

public class N19 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int c = in.nextInt();
        int x = in.nextInt();
        int s = in.nextInt();
      if (x==0 || x==1 ||s==1){


          System.out.println(c-x-s);

      }else {
          System.out.println(c-x*s);
      }



    }
}
