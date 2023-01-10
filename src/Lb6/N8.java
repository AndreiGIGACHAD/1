package Lb6;
import java.util.Random;

public class N8 {
    public static void main(String[] args) {
        Random random = new Random(1000);
        int pi = 11;
        int pie[] = new int[pi];
        for (int i = 0 ; i <pi; i++){
           pie[i] = random.nextInt(1000);
            System.out.println("intArray["+i+"] = "+pie[i]);
        }

        System.out.println("Среднее значение intArray["+pi+"] = "+nomer8.ArrayAvg(pie));
    }
    protected static class nomer8{
        private static double ArrayAvg (int Array[]){
            int sum=0;
            for (int i = 0 ; i <Array.length; i++){
                sum += Array[i];
            }
            double result = (double)sum/Array.length;
            return result;
        }
    }



}


