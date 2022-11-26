package Lb2;
import java.util.Scanner;
public class N1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        int v = in.nextInt();

        if(v%3==0){
            System.out.println("Делиться");
        }
        else {
            System.out.println("Не делиться ");

        }
    }

}
