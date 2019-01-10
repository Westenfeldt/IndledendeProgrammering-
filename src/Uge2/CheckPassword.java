package Uge2;

import java.util.Scanner;

public class CheckPassword {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        final int min = 4;
        final int max = 9;

        System.out.print("Indtast dit password");

        String password = scan.nextLine();

         int length = password.length();

         if (length > 4 && length < 9 ){
            System.out.println("Lændgen af dit password er godkendt");
        }
         else if (length < 4) {
             System.out.println("Længden af dit password er er for kort og er derfor ikke godkendt");
             System.out.println("Det skal bestod af mindst 4 charaters og højst 9");
        }
         else if (length > 9) {
             System.out.println("Længden af dit password er for langt og er derfor ikke godkendt");
             System.out.println("Det skal bestod af mindst 4 charaters og højst 9");
         }
    }
}