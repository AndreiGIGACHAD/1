package N7_5;

public class FirstSubClass extends FirstSudClass {


    protected int int1;

    public void setInt1(int int1) {
        this.int1 = int1;
    }

    FirstSubClass(String str1, int int1) {
        super(str1);
        this.setInt1(int1);
    }


    @Override
    public void PrintToString() {
        String SecondFieldValue =
                " int1 = \"" + this.getInt1()+"\"";
        super.PrintToString();
        System.out.println(SecondFieldValue);
    }
    public int getInt1() {
        return int1;
    }
}