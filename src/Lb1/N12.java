package Lb1;
import java.util.Scanner;
public class N12 {
    public static void main(String[] args) {
        int g=2022;
        Scanner sc = new Scanner(System.in);

        System.out.println("Напишите свой возраст: ");
        int v = sc.nextInt();
        g=g-v;
        System.out.println("Вы роделись в" +" " +  g +" " + "году");
    }
}
