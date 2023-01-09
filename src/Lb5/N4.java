package Lb5;

public class N4 {
    public static void main(String[] args) {

        nomer my1 = new   nomer(12,'A');

        nomer my2 = new   nomer(65.1267);
    }
}
class   nomer {

    private char c1;
    private int c2;

    nomer(int i, char c){
        c1 = c;
        c2 = i;
        int length = (int) (Math.log10(c2) + 1);
        double result = (double)c1 + (double)c2*1/Math.pow(10, length);
        System.out.println("result1 = "+result+"; ch = "+(double)c1+ "; int = "+length);
    }

    nomer(double d){

        char c1 = (char)d;

        c2 = (int)((d -(int)d)*100);
        System.out.println("c1 = " + c1 +"; c2 = "+c2);
    }
}

