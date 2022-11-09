package day20;

import java.util.Scanner;

public class MaxMin {
        public static void main(String[] args) {
            //Klavyeden girilen 10 adet sayı, bir tam sayı dizisi içinde tutulacaktır.
            //En büyük ve en küçük sayıları bulup ekranda gösteren Java programını yazınız.
            //
            System.out.println("Lütfen 10 adet rastgele sayı giriniz: ");
            Scanner input = new Scanner(System.in);
            int[] rastgeleSayilar = new int[10];

            for (int i = 0; i < rastgeleSayilar.length; i++) {
                System.out.print("Dizinin " + (i + 1) + ". elemanını giriniz: ");
                rastgeleSayilar[i] = input.nextInt();
            }
            int min = rastgeleSayilar[0];
            int max = rastgeleSayilar[0];

            for (int i = 1; i < rastgeleSayilar.length; i++) {
                if (min > rastgeleSayilar[i]) {
                    min = rastgeleSayilar[i];
                }
                if (rastgeleSayilar[i] > max) {
                    max = rastgeleSayilar[i];

                }
            }
            System.out.println("Dizinin En Büyük Elemanı: " + max);
            System.out.println("Dizinin En Küçük Elemanı: " + min);


        }
    }


