package Lb10;

import netscape.javascript.JSObject;

import java.io.File;
import java.io.FileReader;

public class N2 {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser
                    .parse(new FileReader());
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println( jsonObject.keySet().interator().next());
            JSONArray = (JSONArry) jsonObject.get("books");
            for (Object o : jsonArry){
                JSObject book = (JSObject) o;
                System.out.println();
                System.out.println(book.get);
                System.out.println(book.get);
                System.out.println(book.get);

            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}