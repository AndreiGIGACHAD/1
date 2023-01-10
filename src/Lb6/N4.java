package Lb6;

public class N4 {

    public static int doubleFactorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * doubleFactorial(n - 2);
    }
    public static void main(String[] args) {
        int n = 5;
        int SypFactorial = doubleFactorial(n);
        System.out.println("Двойной факториал" + " "+  SypFactorial);
    }
}

