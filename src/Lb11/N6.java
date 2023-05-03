package Lb11;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.IntStream;

public class N6 {
    private static final String ENGLISH = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int MIN = 1;
    private static final int MAX = 20;
    private static final int AMOUNT_WRITE = 10;

    public static void main(String[] args) {
        Map<Integer, String> map = fillingMap(AMOUNT_WRITE, MIN, MAX, ENGLISH);
        System.out.println("HashMap:");
        printMap(map);
        System.out.println("Values, where key > 5 :" + Arrays.toString(getKeyMoreFive(map)));
        System.out.print("Values, where key % 3 == 0: ");
        printStringMod3(map);
        System.out.println("\nMulti key, where string length > 5: " + multi(map));
    }

    private static void printStringMod3(Map<Integer, String> map) {
        map.entrySet().stream().filter(e -> e.getKey() % 3 == 0).forEach(e -> System.out.print(e.getValue() + ", "));
    }

    private static int multi(Map<Integer, String> map) {
        return map.entrySet().stream().filter(e -> e.getValue().length() > 5).mapToInt(Map.Entry::getKey).reduce(1, (x, y) -> x * y);
    }

    private static void printMap(Map<Integer, String> map) {
        map.entrySet().stream().forEach(e -> System.out.println(e.getKey() + ": " + e.getValue() + ";"));
    }

    private static String[] getKeyMoreFive(Map<Integer, String> map) {
        return map.entrySet().stream().filter(x -> x.getKey() > 5).map(Map.Entry::getValue).toArray(String[]::new);
    }

    private static Map<Integer, String> fillingMap(int size, int min, int max, String decoder) {
        Map<Integer, String> map = new HashMap<>();
        Random random = new Random();
        for (int count = 0; count < size; count++) {
            int key = random.nextInt(max - min + 1) + min;
            map.put(key, getRandomString(key, decoder));
        }
        return map;
    }

    private static String getRandomString(int size, String decoder) {
        Random random = new Random();
        return IntStream.rangeClosed(1, size).
                mapToObj(i -> String.valueOf(decoder.charAt(random.nextInt(decoder.length())))).
                reduce("", (x, y) -> x + y);
    }
}
