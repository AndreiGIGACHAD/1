package Lb5;
import java.util.Scanner;

public class N3 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите n1");
        int int1 = id.nextInt();
        System.out.println("Введите n2");
        int int2 = id.nextInt();
        nomer1 my1 = new nomer1();
        nomer1 my2 = new nomer1 (int1);
        nomer1 my3 = new nomer1 (int1,int2);
    }
}
class nomer1 {

    private int y;
    private int x;


    nomer1(){

    }

    nomer1(int n1){

        this.y = n1;
        System.out.println("n1 в n1 = "+go (n1));
    }
    public int go (int n1) {
        this.y = n1;
        int result=1;
        for (int i=1; i <= n1;i++) {
            result = n1*result;
        }
        return result;
    }

    nomer1(int n1, int n2){

        this.y = n1;
        this.x = n2;
        System.out.println("n1 в n2 = "+go(n1,n2));
    }
    public int go(int z1, int z2){
        z1 = y;
        z2 = x;
        int result=1;
        for (int i=1; i <= x;i++) {
            result = y*result;
        }
        return result;
    }

}