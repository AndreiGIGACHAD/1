package Lb5;

public class N6 {
    public static void main(String[] args) {

       nomer3 my = new nomer3(2,5);
        my.PrintInt();

        my = new nomer3(1);
        my.PrintInt();

        my.SetInt(3,15);
        my.PrintInt();

        my.SetInt(-9);
        my.PrintInt();
    }
}
class nomer3{

    private int min;
    private int max;

    public void SetInt(int n1, int n2){

        System.out.println("Метод  c 2-я аргументами");
        min = Math.min(n1, n2);
        max = Math.max(n1, n2);
    }

    public void SetInt(int n){


        System.out.println("Метод  c 1-м аргументом");
        min = Math.min(min, n);
        max = Math.max(max, n);
    }

    void PrintInt() {
        System.out.println("min = "+min);
        System.out.println("max = "+max);
    }

    nomer3(int n1, int n2){
        System.out.println("Конструктор  c 2-я аргументами");
        min = Math.min(n1, n2);
        max = Math.max(n1, n2);
    }

    nomer3(int n){
        System.out.println("Конструктор  c 1-м аргументом");
        min = Math.min(min, n);
        max = Math.max(max, n);
    }

}
