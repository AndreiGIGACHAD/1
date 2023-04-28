
package Timus;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N33 {

    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String line = consoleReader.readLine();
        consoleReader.close();

        if (line.length() == 1)
            System.out.println(line + line);
        else
            for (int i = 1; i < line.length(); i++){
                String subString = line.substring(i);
                if (isPalindrome(subString)){
                    StringBuilder sb = new StringBuilder(line.substring(0, i));
                    System.out.println(line + sb.reverse());
                    break;
                }
            }
    }

    private static boolean isPalindrome(String str) {
        if (str == null)
            return false;
        StringBuilder strBuilder = new StringBuilder(str);
        strBuilder.reverse();
        return strBuilder.toString().equals(str);
    }
}