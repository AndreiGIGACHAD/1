package Lb10;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
public class JsonParser {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser
                    ..parse(new FileReader(fileName:"src/lr 10/example 2/example-json.json"));
            JSONObject jsonobject = (JSONObject) obj;
            System.out.println("Корневой элемент: "
                    + +jsonobject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonobject.get("books");
            for (Object o : jsonArray) {
                JSONObject book = (JSONObject) o;
                System.out.println("\nТекущий элемент: book");
                System.out.println("Название книги: " + book.get("title"));
                System.out.println("Автор: " + book.get("author"));
                System.out.println("Год издания: " + book.get("year"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}