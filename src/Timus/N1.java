package Timus;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Deque;

public class N1 {
    public static void main(String[] str) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Deque<Long> deque = new LinkedList<>();

        while (scanner.hasNextLong())
            deque.addFirst(scanner.nextLong());

        for (Long l : deque)
            System.out.printf("%.4f\n", Math.sqrt(l));

    }
}
