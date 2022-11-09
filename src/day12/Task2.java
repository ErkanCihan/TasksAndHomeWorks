package day12;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Verilen bir sayının hem 2'ye hem de 3'e bölünüp bölünmediğini bulan bir java program yazınız.


        /*
        - Girilen sayı hem 2'ye hem 3'e tam bölünebilir.
        - Sayı sadece 2'ye tam bölünebilir.
        - Sayı sadece 3'e tam bölünebilir.
        - Sayı hem 2'ye hem de 3'e tam bölünemez.
        */

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen 1 ile 100 arasında sayı giriniz : ");
        int sayi = input.nextInt();

        if (sayi % 2 == 0 & sayi % 3 == 0) {
            System.out.printf("%d, Hem 2'ye hem de 3'e tam bölünür.", sayi);
            System.out.println();
        } else if (sayi % 2 == 0) {
            System.out.printf("%d, Yalnızca 2'ye tam bölünür.\n", sayi);
        } else if (sayi % 3 == 0) {
            System.out.printf("%d, Yalnızca 3'ye tam bölünür.\n", sayi);
        } else {
            System.out.printf("%d, Hem 2'ye hem de 3'e tam bölünmez.\n", sayi);

        }


    }
}
