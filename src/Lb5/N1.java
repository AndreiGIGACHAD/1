package Lb5;
import java.util.Scanner;
public class N1 {
    public static void main(String[] args) {
       var sym = new Symbol();
        sym.setSymbol();
        sym.printSymbolInfo();
    }
}
class Symbol {
    private char symbol;

    public void setSymbol() {

        Scanner in = new Scanner(System.in);

        System.out.print("Ведите символ");

        symbol = in.next().charAt(0);
    }

    public int getSymbolCode() {

        return (int) symbol;
    }

    public void printSymbolInfo() {
        System.out.println(" " + symbol + " " + getSymbolCode());
    }
}

