package Lb7;

public class subClassTest1 extends superClassTest {
    private String str2;

    public int int1;


    subClassTest1() {setStr1();}

    subClassTest1(String str2) {setStr1(str2);}

    subClassTest1(int int1) {setStr1(); this.setInt1(int1);}

    subClassTest1(String str2, int int1) {setStr1(str2); this.setInt1(int1);}

    public void setInt1(int int1) {
        this.int1 = int1;
    }
    public void setStr1 (){
        this.str2 = "здесь ничего нет";
    }

    public void setStr1 (String str2){
        this.str2 = str2;
    }

    public int getInt1(){
        //   System.out.println(str1);
        return int1;
    }

    public String getStr1(){
        //   System.out.println(str1);
        return str2;
    }

    public int getStr1length(){

        return str2.length();
    }


    @Override
    public String toString() {
        String ClassNameAndFieldValue = "subClassTest{" + "str2=\"" + getStr1() + '\"' + " string.length = " +"\""+getStr1length()+"\"}"
                +"\nsubClassTest{" + "int1=\"" + getInt1() + "\"}";
        return ClassNameAndFieldValue;
    }

}