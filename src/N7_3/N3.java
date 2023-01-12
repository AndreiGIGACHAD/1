package N7_3;

public class N3  {
    public static void main(String[] args) {
        FirstSupClass superClassTest = new FirstSupClass(5);
        String className1 = superClassTest.toString();
        System.out.println(className1);

        SecondSubClass FirstSubClassTest = new SecondSubClass(10,'n');
        String className2 = FirstSubClassTest.toString();
        System.out.println(className2);

        ThirdSubClass SecondSubClassTest = new ThirdSubClass(10,'n',"число");
        String className3 = SecondSubClassTest.toString();
        System.out.println(className3);
    }
}
