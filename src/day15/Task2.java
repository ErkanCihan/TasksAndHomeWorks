package day15;

import java.util.Scanner;

public class Task2 {

        public static void main(String[] args) {

            // TODO: 26.10.2022 Task 1: Kullanıcıdan bir geometrik şeklin iç açı (3 adet) değerlerini alınız.
            //  Verilen açılara göre; "Bu şekil bir üçgendir", "Bu şekil bir üçgen değildir" mesajı veren Java programını yazınız.

            Scanner input = new Scanner(System.in);
            System.out.print("Birinci Açıyı Giriniz: ");
            int angle = input.nextInt();
            System.out.print("İkinci Açıyı Giriniz: ");
            int angle2 = input.nextInt();
            System.out.print("Üçüncü Açıyı Giriniz: ");
            int angle3 = input.nextInt();

            String Ucgen=(angle+angle2+angle3)==180?"Bu şekil bir Üçgendir.":"Bu şekil bir Üçgen Değildir!";
            System.out.println(Ucgen);

        }


    }

