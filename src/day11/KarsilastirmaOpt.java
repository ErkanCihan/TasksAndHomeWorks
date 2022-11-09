package day11;

import java.util.Scanner;

public class KarsilastirmaOpt {
    public static void main(String[] args) {
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
