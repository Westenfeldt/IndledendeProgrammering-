package Uge2;

import java.util.Scanner;

public class AfstandMellemPogL {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    System.out.println("Indtast værdierne for a og b");
                double a = scan.nextDouble();
                double b = scan.nextDouble();

    System.out.println("Indtast koordinaterne for punktet P");
                double x = scan.nextDouble();
                double y = scan.nextDouble();

    double afstand = (a * x - y + b)/Math.sqrt(1 + a*a);

    System.out.println("Afstanden er: " + afstand);
// TESTER NAEUN I LOVE YOU
    }
}

