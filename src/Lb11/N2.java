package Lb11;

import java.util.Scanner;

public class N2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int chislo = in.nextInt();
        int[] arr = new int[3];
        int i = 0;
        while (chislo > 8) {
            arr[i] = chislo % 8;
            chislo /= 8;
            i++;
        }
        arr[i] = chislo;
        System.out.print("Число в 8-ой системе счисления = ");
        for (int j = arr.length - 1; j >= 0; j--) {
            System.out.print(arr[j]);
        }
    }

}
