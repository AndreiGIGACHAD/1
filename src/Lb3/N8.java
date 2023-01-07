package Lb3;

public class N8 {
    public static void main(String[] args) {

        int x = 10;

        char[] ms = new char[x];
        char[] ms2 = new char[] {'A', 'E', 'I', 'O', 'U', 'Y'};
        char d = 'A';
        int i=0;
        int j=0;

        for(i = 0; i < x; i++) {
            int a = 1;
            for(j = 0; j < ms2.length; j++) {
                if(d == ms2[j]) {
                    i--;
                    a = 0;
                }
            }
            if(a == 1) {
                ms[i] = d;
            }
            d++;
        }
        for(int k = 0; k < x; k++){
            System.out.println(ms[k]);
        }
    }





}
