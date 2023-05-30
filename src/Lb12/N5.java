package Lb12;
import java.util.ArrayList;
import java.util.List;
public class N5 {

        public static List<String> filterStrings(List<String> inputList, String substring) {
            List<String> filteredList = new ArrayList<>();

            for (String str : inputList) {
                if (str.contains(substring)) {
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

            String substring = "lo";

            List<String> filteredList = filterStrings(inputList, substring);

            System.out.println("Filtered List:");
            for (String str : filteredList) {
                System.out.println(str);
            }
        }
    }

