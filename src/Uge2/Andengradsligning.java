package Uge2;

import java.util.Scanner;


public class Andengradsligning {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Hvad er koefficienterne til A, B og C?");

        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();

        if (A == 0) {//2.grad

            if (B == 0) {

                System.out.println("Der findes ingen rødder til den ligning du har angivet");

            } else {

                double x0 = -C / B;

                System.out.print("X er: " + x0);
            }
        }else{

            double diskriminant = Math.pow(B, 2) - 4*A*C;

            if (diskriminant < 0) {
                System.out.println("Der findes ingen rødder.");

            } else if (diskriminant == 0) {

                double x0 = (-B + Math.sqrt(diskriminant)) / 2*A;

                System.out.println("Der findes en rod: X = " + x0);
            } else {

                double x0 = (-B + Math.sqrt(diskriminant)) / 2*A;

                double x1 = (-B - Math.sqrt(diskriminant)) / 2*A;

                System.out.println("Der findes 2 l�sninger: " + "x = " + x0 + " og x = " + x1);
            }

        }











    }
}
