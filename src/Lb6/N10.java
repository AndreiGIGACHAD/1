package Lb6;



public class N10 {
    public static void main(String[] args) {
        nomer5 my1 = new nomer5();
        nomer5 my2 = new nomer5();
        my1.calcMaxMin(1,0,-9,5,25,-101);
        my1.viewMaxMin();
        nomer5.calcMaxMin(3,0,500,-2,33,-5,6,17);
        nomer5.viewMaxMin();
        my2.calcMaxMin(3,0,50,-2,33,-5,6,17);
        my2.viewMaxMin();
    }
    protected static class nomer5{
        private static int[] MaxMin;

        private static int[] calcMaxMin(int ... array){
            int max = array[0];
            int min = array[0];
            for (int i =0; i<array.length; i++) {
                max = Math.max(max, array[i]);
                min = Math.min(min, array[i]);
            }
            MaxMin= new int[]{max, min};

            return MaxMin;
        }
        private static void viewMaxMin() {
            System.out.println("\nMaxiMin[max] = " + MaxMin[0]);
            System.out.println("MaxiMin[min] = " + MaxMin[1]);
        }
    }
}
