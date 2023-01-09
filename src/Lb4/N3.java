package Lb4;
import java.util.Scanner;
public class N3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("введите ширину");
        int width = in.nextInt();

        System.out.print("введите высоту");
        int height = in.nextInt();

        int x = 0;

        int [][] st = new int [height][width];



        for (int i =0; i < height; i++){
            for (int j = 0; j <width; j++){
                st[i][j] = 2;
            }
        }

        for (int i =0; i < height; i++){
            int count = i+1;
            System.out.print("номер строки " + count + "  ");
            for (int j = 0; j <width; j++){
                System.out.print(st[i][j]+" ");
                x++;
            }

            System.out.println( " "+ "Количество символов в строке" + x);
            x = 0;
        }
    }



}

