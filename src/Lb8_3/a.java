package Lb8_3;

import java.io.*;

public class a {
    public static void main(String[] args) throws IOException {





        try {

            File f1 = new File("inn1.txt");
            f1.createNewFile();
            if (f1.exists()) {

                System.out.println("Создан");
                System.out.println("Полный путь: " + f1.getAbsolutePath());
            }

        } catch (Exception e) {
            System.out.println("Ошибка" + e);
        }
        File file = new File("inn1.txt");
        PrintWriter d = new PrintWriter(file);
        d.println(" Но дружбы нет и той меж нами. Все предрассудки истребя, Мы почитаем всех нулями, А единицами – себя");

        d.close();


        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new
                    FileInputStream("inn1.txt")));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new
                    FileOutputStream("2.txt")));
            String strRead = null;
            while ((strRead = br.readLine()) != null) {
                bw.write(strRead);
                bw.newLine();
            }
            bw.close();
            br.close();
        } catch (Exception e) {
            System.err.println("ошибка");
        }

    }
}