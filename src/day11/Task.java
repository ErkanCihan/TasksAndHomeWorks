package day11;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        //Kullanıcı tarafından klavyeden alınan kenar uzunluğu ile karelerin alanlarını karşılaştıran program tasarımı


        Scanner input = new Scanner(System.in);
        System.out.print("Birinci kare kenarını giriniz :");
        int kare1 = input.nextInt();
        Scanner input1 = new Scanner(System.in);
        System.out.print("İkinci kare kenarını giriniz :");
        int kare2 = input.nextInt();
        int alan1 = alanHesapla(kare1);
        int alan2 = alanHesapla(kare2);


        System.out.println("Birinci Karenin Alanı: "+alan1);
        System.out.println("İkinci Karenin Alanı: "+alan2);
        System.out.println();

        if (alan1 < alan2) {
            System.out.println("Birinci karenin alanı küçüktür.");
        } else if (alan2 < alan1) {
            System.out.println("İkinci karenin alanı küçüktür.");
        } else {
            System.out.println("Her iki karenin alanı eşittir.");
        }
    }

    public static int alanHesapla(int kenar) {
        return kenar * kenar;


    }
}
