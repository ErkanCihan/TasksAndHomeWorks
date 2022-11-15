package day11;

import java.util.Scanner;

public class KarsilastirmaOpt {
    public static void main(String[] args) {

        //Klavyeden Kullanıcı tarafından girilen bir sayının kişinin yaşını hesaplaması ve Yetişkin veya değilsiniz
        // sonucunu If - Else Metodu ile yapılması.
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç Yaşındasın? : ");
        int yas = input.nextInt();

        if (yas >= 18) {
            System.out.println("Siz Yetişkinsiniz.");

        } else {
            System.out.println("Siz Yetişkin değilsiniz");
        }


    }
}
