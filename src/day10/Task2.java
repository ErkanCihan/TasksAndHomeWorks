package day10;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double pi = Math.PI;
        Scanner input = new Scanner(System.in);
        System.out.print("Çemberin yarıçapını girin:");
        double r = input.nextDouble();
        System.out.println(cemberHesapla(r));


    }

    public static double cemberHesapla(double r) {
        double cevre = 2 * Math.PI * r;
        return cevre;

    }
}
