package day09;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        // Çemberin Alanını ve Çevresini hesaplayan bir program tasarlayınız.

        Scanner input = new Scanner(System.in);
        System.out.print("Çemberin Yarıçapını giriniz: ");
        double r = input.nextDouble();

        double PI_SAYISI = Math.PI, rx = 2;
        double rkare = Math.pow(r, rx);

        double cemberinAlani = 2 * (PI_SAYISI * (rkare));
        System.out.println("Çemberin Alanı :" + cemberinAlani);

        double cemberinCevresi = 2 * (PI_SAYISI * r);
        System.out.println("Çemberin Çevresi:" + cemberinCevresi);


    }
}
