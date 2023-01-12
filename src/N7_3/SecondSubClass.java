package N7_3;

public class SecondSubClass extends FirstSupClass{
    SecondSubClass(int int1) {
        super(int1);
    }

    public char char1;

    public void setInt1Str1(int int1, char char1) {
        super.int1 = int1;
        this.char1 = char1;
    }

    SecondSubClass(int int1, char char1) {
        super(int1);
        this.setInt1Str1(int1, char1);
    }


    public String toString() {
        String SecondFieldValue =
                "\n str 1 = " + this.getChar1();
        return super.toString()+SecondFieldValue;
    }
    public char getChar1() {
        return char1;
    }
}
