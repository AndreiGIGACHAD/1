package Lb3;
import java.util.Arrays;
import java.util.Random;

public class N9 {
    public static void main(String[] args) {

        int d = 6;
        int[] ms = new int[d];
        Random random = new Random();


        for (int i = 0; i < ms.length; i++) {
            ms[i] = random.nextInt(100);
            System.out.println("[" + i + "]" + ms[i]);
        }
        Arrays.sort(ms);
        int x = Math.min(ms[0], ms[d - 1]);

        for (int i = 0; i < ms.length; i++) {
            System.out.println("[" + i + "]" + ms[i]);
        }

        for (int i = 0; i < ms.length; i++) {
            if (x == ms[i]) {
                System.out.println(x);
            }


        }
    }




}
