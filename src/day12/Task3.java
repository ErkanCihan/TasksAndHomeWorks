package day12;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        //Verilen bir sayının hem 2'ye hem de 5'e bölünüp bölünmediğini bulan bir java program yazınız.

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen herhangi sayı giriniz : ");
        int sayi = input.nextInt();

        if (sayi % 10==0) {
            System.out.printf("%d, Hem 2'ye hem de 5'e tam bölünür.", sayi);
            System.out.println();
        } else {
            System.out.printf("%d, Hem 2'ye hem de 5'e tam bölünmez.\n", sayi);

        }


    }
}
