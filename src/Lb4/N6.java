package Lb4;

import java.util.Random;
public class N6 {
    public static void main(String[] args) {
        int y = 2;
        int x = 4;
        int[][] tr = new int[y][x];
        Random random = new Random();

        for (int i = 0; i < y; i++){
            for (int j = 0; j< x; j++){
                tr[i][j] = random.nextInt(5);
                System.out.print(tr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        int a = random.nextInt(y);
        int b = random.nextInt(x);

        System.out.println();
        for (int i = 0; i < y; i++){
            if(i == a)
                continue;
            for (int j = 0; j< x; j++){
                if(j == b)
                    continue;
                System.out.print(tr[i][j]);
            }
            System.out.println();
        }
    }




}

