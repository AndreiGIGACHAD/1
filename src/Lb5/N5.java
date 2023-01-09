package Lb5;

public class N5 {
    public static void main(String[] args) {

        nomer2 my = new  nomer2(21);
        System.out.println("Число = "+my.PrintInt());


        my.Set(15);
        System.out.println("Число = "+my.PrintInt());


        my.Set(125);
        System.out.println("Число = "+my.PrintInt());


        my.Set(-15);
        System.out.println("Число = "+my.PrintInt());


        my.Set();
        System.out.println("Число = "+my.PrintInt());
    }
}
class  nomer2 {

    private int c1;

    public void Set(int n) {
        System.out.println("Метод c аргументом");
        c1 = n;

        if (n >= 100){
            c1 = 100;
        }

        if (n<=0){
            c1 = 0;
        }
    }

    public void Set() {
        System.out.println("Метод без аргумента");
        c1 = 0;
    }

    public int PrintInt() {
        return c1;
    }

    nomer2(int int1){
        System.out.println(" конструктор ");
        this.Set(int1);
    }
}

