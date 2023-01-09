package Lb4;

import java.util.Scanner;
public class N8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = in.nextLine();
        char[] textChars = text.toCharArray();
        boolean ver = true;
        int key = 0;
        while (ver){
            try{
                System.out.println("Введите ключ:");
                key = Integer.parseInt(in.nextLine());
                if(key == 0) {
                    continue;
                }
                ver = false;
            }
            catch(Exception ignored){}
        }
        for (int i = 0; i < textChars.length; i++){
            System.out.print((char) ++textChars[i]);
        }
        System.out.println();

        System.out.println(" Расшифровать  (y/n)");
        ver = true;

        while (ver) {
            String reply = in.next();

            if (reply.toLowerCase().equals("y")) {
                System.out.println(text);
               ver= true;
            }

            else if (reply.toLowerCase().equals("n")) {
                System.out.println("До свидания!");
                ver = true;
            }

            else {
                System.out.println("Введите корректный ответ: ");
                ver = false;
            }
        }
    }
}