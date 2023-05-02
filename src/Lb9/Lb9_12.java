package Lb9;

public class Lb9_12 {
    public class Main {
        public static void m(String str, double chislo) {
            if (str == null) {
                throw new IllegalArgumentException("Строка введена неверно");
            }
            if (chislo > 0.001) {
                throw new IllegalArgumentException("Неверное число");
            }
        }

        public static void main(String[] args) {
            m(null, 0.000001);
        }
    }
}
