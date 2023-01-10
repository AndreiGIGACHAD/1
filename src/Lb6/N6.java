package Lb6;

public class N6 {
    public static void main(String[] args) {
        int[] inArray = {-9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,};

      nomer6 my = new nomer6();
        for (int i = 0; i < my.SetArray(inArray, 10).length; i++) {
            System.out.println(  i  + my.SetArray(inArray, 10)[i]);
        }

        nomer6.SetArray(inArray, 25);
        nomer6.viewArray();
    }


    protected static class nomer6 {
        private static int outArray[];

        private static int[] SetArray(int inArray[], int count) {

            if (count > inArray.length) {
                count = inArray.length;
            }
            outArray = new int[count];
            for (int i = 0; i < count; i++) {
                outArray[i] = inArray[i];
            }

            return outArray;
        }

        private static void viewArray()
        {
            for (int i = 0; i < nomer6.outArray.length; i++) {
                System.out.println(  i  + outArray[i]);
            }
        }
    }




}
