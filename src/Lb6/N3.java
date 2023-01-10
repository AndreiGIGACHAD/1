package Lb6;

public class N3 {
    public static class nomer02{

        static void Max(int ... array){
            int max = array[0];
            for (int i =0; i<array.length; i++) {
                max = Math.max(max, array[i]);
            }
            System.out.println("Max"+max);
        }

        static void Min(int ... array){
            int min = array[0];
            for (int i =0; i<array.length; i++) {
                min = Math.min(min, array[i]);
            }
            System.out.println("Min"+min);

        }

        static void Avg(int ... array){
            int sum = 0;
            for (int i =0; i<array.length; i++) {
                sum = array[i]+sum;
            }
            double avg = (double)sum/array.length;
            System.out.println("Avg"+avg);
        }


    }

    public static void main(String[] args) {
        nomer02 myexample = new nomer02();
        myexample.Max(1,0,-9,5,25,-101);
        myexample.Min(3,0,500,-2,33,-5,6,17);
        myexample.Avg(3,0,50,-2,33,-5,6,17);

    }

}
