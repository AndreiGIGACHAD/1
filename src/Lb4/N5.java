package Lb4;
import java.util.Random;
import java.util.Scanner;
public class N5{
    public static void main(String[] args) {
        Random random = new Random(10);
        Scanner in = new Scanner(System.in);

        System.out.print("введите количество столбиков");

        int y = in.nextInt();

        System.out.print("введите количество строчек");

        int x = in.nextInt();

        int tr [][] = new int[y][x];

        for (int i = 0 ; i <y; i++) {
            for (int j = 0 ; j <x; j++) {
                tr [i][j] = random.nextInt(10);

                System.out.println("i = "+i+"; j= "+j+" "+  tr [i][j]);
            }
        }

        int tr1 [][] = new int[x][y];
        for (int i = 0 ; i <x; i++) {
            for (int j = 0 ; j <y; j++) {
               tr1 [i][j] = tr1[j][i];

                System.out.println("i = "+i+";j= "+j+" "+tr1[i][j]);
            }
        }
    }




}

