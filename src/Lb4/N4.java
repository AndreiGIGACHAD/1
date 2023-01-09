package Lb4;
import java.util.Scanner;

public class N4{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("введите высоту");
        int height = in.nextInt();


        char [][] st = new char [height][];


        for (int i=0;i<st.length;i++){

            int j = i+1;
            st[i]=new char[j];
        }
        int x = 0;
        for (int i =0; i < height; i++){
            for (int j = 0; j <i+1; j++){
                st[i][j] = '#';
            }
        }

        for (int i =0; i < height; i++){
            int count = i+1;
            System.out.print("номер строки " + count + " : ");

            for (int j = 0; j < st[i].length; j++){
                System.out.print(st[i][j]+" ");
                x++;
            }

            System.out.println( " "+ "Количество символов" + x);
            x = 0; //обнуление счетчика
        }
    }




}

