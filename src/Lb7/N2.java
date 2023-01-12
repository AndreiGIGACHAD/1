package Lb7;

public class N2 {
    public static void main(String[] args) {
        superClassTest1 myTest0 = new superClassTest1();
        String superClassTest0 = myTest0.toString();
        System.out.println(superClassTest0);

        superClassTest1 myTest1 = new superClassTest1("тест это");
        String superClassTest1 = myTest1.toString();
        System.out.println(superClassTest1);

        superClassTest myTest2 = new subClassTest1();
        String subClassTest0 = myTest2.toString();
        System.out.println(subClassTest0);

        superClassTest myTest3 = new subClassTest1("тест это тоже");
        String subClassTest1 = myTest3.toString();
        System.out.println(subClassTest1);

        superClassTest myTest4 = new subClassTest1(256);
        String subClassTest2 = myTest4.toString();
        System.out.println(subClassTest2);

        superClassTest myTest5 = new subClassTest1("тест и это", 256);
        String subClassTest3 = myTest5.toString();
        System.out.println(subClassTest3);
    }
}