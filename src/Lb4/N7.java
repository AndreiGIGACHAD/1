package Lb4;
import java.util.Scanner;

public class N7{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("введите количество строчек");
        int a =in.nextInt();

        System.out.print("введите количество столбиков");
        int b = in.nextInt();

        int zm[][] = new int[a][b];
        int t = 0;
        int t1 = 0;
        int x = 0;
        for (int i = 0 ; x <zm.length ; x++) {
            for (int j = 0 ; j <(zm[i].length - t); j++) {
                zm[i][j] = t1;
                t1++;
            }
            i++;
            for (int k = i; k <zm.length; k++) {
                zm[k][zm[i].length-1-t] = t1;
                t1++;
            }
            t++;
        }
        int y = 0;
        for (int i =0; i < zm.length; i++){
            int count = i+1;
            System.out.print("номер строки " + count + " : ");
            for (int j = 0; j <zm[i].length; j++){
                System.out.print(zm[i][j]+" ");
                y++;
            }
            System.out.println(" "+ "Количество символов" + y);
            y = 0;
        }

    }





}

