package Lb5;
import java.util.Scanner;
public class N2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ведите начальный символ: ");
        char st = in.next().charAt(0);
        System.out.print("Ведите конечнный символ: ");
        char en = in.next().charAt(0);

        SymbolRange symbolRange = new SymbolRange(st, en);
        symbolRange.printSymbolsInRange();
    }
}

class SymbolRange {
    private char st;
    private char en;

    public SymbolRange(char start, char end) {
        this.st = start;
        this.en = end;
    }

    public void printSymbolsInRange() {
        for (char c = st; c <= en; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
