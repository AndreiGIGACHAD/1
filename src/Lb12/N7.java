package Lb12;
import java.util.ArrayList;
import java.util.List;
public class N7 {



        public static List<String> filterStrings(List<String> inputList, int minLength) {
            List<String> filteredList = new ArrayList<>();

            for (String str : inputList) {
                if (str.length() > minLength) {
                    filteredList.add(str);
                }
            }

            return filteredList;
        }

        public static void main(String[] args) {
            List<String> inputList = new ArrayList<>();
            inputList.add("Hello");
            inputList.add("World");
            inputList.add("Java");
            inputList.add("Programming");

            int minLength = 4;

            List<String> filteredList = filterStrings(inputList, minLength);

            System.out.println("Filtered List:");
            for (String str : filteredList) {
                System.out.println(str);
            }
        }
    }

