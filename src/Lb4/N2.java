package Lb4;

public class N2 {
    public static void main(String[] args) {

        int y = 15;

        int i;

        int j;

        int x=0;

        for (i = 1 ; i <= y; i++){
            System.out.print("номер строки" + i + " ");

            for (j = 0; j <=x; j++){

                System.out.print("#");
            }
            x = x + 1;
            System.out.println( " " + "Количество символов" + x);
        }
    }
}
