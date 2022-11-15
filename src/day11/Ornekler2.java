package day11;

import java.util.Scanner;

public class Ornekler2 {
    public static void main(String[] args) {

        //Kullanıcı tarafından klavyeden girilen bir sayının asign edilmiş bir sayı ile karşılaştırılmasını
        //If - Else metodu ile yapan Program.
        int sayi = 21;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı tuttum.");
        System.out.print("Tahminiz nedir: ");
        int tahmin = input.nextInt();
        if (tahmin < sayi) {
            System.out.println("Daha büyük bir sayı gir.");
        } else if (tahmin > sayi) {
            System.out.println("Daha küçük bir sayı gir.");
        } else {
            System.out.println("Tebrikler bildiniz.");
        }

    }

}
