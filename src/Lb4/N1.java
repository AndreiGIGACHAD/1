package Lb4;


public class N1 {
    public static void main(String[] args) {

        int y = 11;

        int i;

        int j;

        int x;

        for (i = 1 ; i <= y; i++){
            System.out.print("номер строки" + i + " ");
            x = 0;

            for (j = 0; j < 23; j++){

                System.out.print("#");

                x = x + 1;
            }
            System.out.println(" " + "Количество символов" + x);
        }
    }



}