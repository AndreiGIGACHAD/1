package Lb12;
import java.util.ArrayList;
import java.util.List;

public class N9 {


        public static List<String> filterStrings(List<String> inputList) {
            List<String> filteredList = new ArrayList<>();

            for (String str : inputList) {
                if (str.matches("[a-zA-Z]+")) {
                    filteredList.add(str);
                }
            }

            return filteredList;
        }

        public static void main(String[] args) {
            List<String> inputList = new ArrayList<>();
            inputList.add("Hello123");
            inputList.add("World");
            inputList.add("Java!");
            inputList.add("Programming");

            List<String> filteredList = filterStrings(inputList);

            System.out.println("Filtered List:");
            for (String str : filteredList) {
                System.out.println(str);
            }
        }
    }

