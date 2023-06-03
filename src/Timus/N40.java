package Timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N40 {
    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String line = consoleReader.readLine();
        StringBuilder output = new StringBuilder();

        for (char c : line.toCharArray()) {
            int l = output.length();
            if (l != 0 && output.charAt(l - 1) == c)
                output.deleteCharAt(l - 1);
            else
                output.append(c);
        }

        System.out.println(output);
    }
}
