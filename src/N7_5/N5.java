package N7_5;



public class N5 {
    public static void main(String[] args) {
        FirstSudClass SuperClassTest1 = new FirstSudClass("проврка");
        SuperClassTest1.PrintToString();
        FirstSubClass SubClassTest1 = new FirstSubClass("подкласc", 10);
        SubClassTest1.PrintToString();
        SecondSubClass SubClassTest2 = new SecondSubClass("подклас 1", 'n');
        SubClassTest2.PrintToString();
        FirstSudClass SuperClassTest2 = new FirstSudClass(SubClassTest1.getStr1());
        SuperClassTest2.PrintToString();
        FirstSudClass SuperClassTest3 = new FirstSudClass(SubClassTest2.str1);
        SuperClassTest3.PrintToString();
    }

}

