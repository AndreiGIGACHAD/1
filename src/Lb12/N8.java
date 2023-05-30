package Lb12;
import java.util.ArrayList;
import java.util.List;

public class N8 {


        public static List<Integer> filterNumbers(List<Integer> inputList, int threshold) {
            List<Integer> filteredList = new ArrayList<>();

            for (int number : inputList) {
                if (number > threshold) {
                    filteredList.add(number);
                }
            }

            return filteredList;
        }

        public static void main(String[] args) {
            List<Integer> inputList = new ArrayList<>();
            inputList.add(10);
            inputList.add(15);
            inputList.add(20);
            inputList.add(25);

            int threshold = 15;

            List<Integer> filteredList = filterNumbers(inputList, threshold);

            System.out.println("Filtered List:");
            for (int number : filteredList) {
                System.out.println(number);
            }
        }
    }

