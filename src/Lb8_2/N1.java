package Lb8_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class N1 {

    public static void main(String[] args) throws IOException {


        try {

            File f1=new File("inn.txt");
            f1.createNewFile();
            if (f1.exists()) {

                System.out.println("Создан");
                System.out.println("Полный путь: "+ f1.getAbsolutePath());
            }

        } catch (Exception e) {
            System.out.println("Ошибка"+e);
        }
        File file = new File("inn.txt");
        PrintWriter d = new PrintWriter(file);
        d.println(" 0.21 0.03 -1.00 6.90 2.09 9.63 -2.61 -80.43 -0.04 60.95 -7.00 9.60 3.47 -4.05");
        d.close();


        Scanner sc = new Scanner(new File("inn.txt"));
        sc = new Scanner(sc.nextLine()).useDelimiter(" ");
        List<Double> dl = new ArrayList<>();
        sc.forEachRemaining(x -> listPositiveDouble(dl, Double.parseDouble(x)));

        int indexMax = dl.indexOf(Collections.max(dl));
        FileWriter outFile = new FileWriter("noviy.txt", true);

        for (int i = 0; i < dl.size(); i++) {
            if (i != indexMax) outFile.write(dl.get(i) + " ");
        }

        outFile.close();
    }

    static void listPositiveDouble(List<Double> list, double val) {
        if (val > 0.0) list.add(val);
    }
}
