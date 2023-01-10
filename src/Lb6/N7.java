package Lb6;

public class N7 {
    public static void main(String[] args) {
        char[] inArray = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с',
                'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        nomer7.convertCharArray(inArray);
        nomer7.viewArray();

    }

    private static class nomer7 {
        static int[] IntArray;


        private static int[] convertCharArray(char ChArray[]) {
            IntArray = new int[ChArray.length];
            for (int i = 0; i < ChArray.length; i++) {
                IntArray[i] = (int)ChArray[i];
            }

            return IntArray;
        }

        private static void viewArray() {
            for (int i = 0; i < IntArray.length; i++) {
                System.out.println("IntArray[" + i + "] = " + IntArray[i]);
            }
        }
    }




}

