package day11;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Uzun kenarı giriniz:");
        int uzunKenar = input.nextInt();
        System.out.print("Kısa kenarı giriniz: ");
        int kisaKenar=input.nextInt();
        int alan = alanHesapla(uzunKenar,kisaKenar);
        int cevre=cevreHesapla(uzunKenar,kisaKenar);
        System.out.println("Dikdörtgenin Alanı: "+alan);
        System.out.println("Dikdörtgenin Çevresi: "+cevre);
    }
    public static int alanHesapla(int uKenar,int kKenar){
        return uKenar*kKenar;

    }
    public static int cevreHesapla(int uKenar,int kKenar){
        return 2*(uKenar+kKenar);

    }
}
