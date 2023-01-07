package Lb3;

public class N7 {
    public static void main(String[] args) {

        String[] ms = new String [10];
        ms[0]="a";
        ms[1]="b";
        ms[2]="c";
        ms[3]="e";
        ms[4]="f";
        ms[5]="q";
        ms[6]="h";
        ms[7]="i";
        ms[8]="j";
        ms[9]="k";

        for (int i = 0; i < ms.length; i++) {


            System.out.print(ms[i] );
        }
        for (int i = ms.length - 1 ; i >= 0; i--) {
            System.out.println(ms[i] );
        }
    }



}
