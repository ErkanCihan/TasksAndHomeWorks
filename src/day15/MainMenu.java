package day15;

import java.util.Scanner;

public class MainMenu {

        public static void main(String[] args) {

            // Dört işlem yapabilen hesap makinesi tasarlayınız.

            System.out.println("-".repeat(20));
            System.out.println("     Dört İşlem     ");
            System.out.println("-".repeat(20));
            System.out.println("1. Toplama");
            System.out.println("2. Çıkarma");
            System.out.println("3. Çarpma");
            System.out.println("4. Bölme");
            System.out.println("-".repeat(20));
            System.out.print("Seçiminizi Girin: ");
            Scanner input = new Scanner(System.in);
            int secim = input.nextInt();
            int sonuc=0;
            String birinci="Birinci Sayı:";
            String ikinci="İkinci Sayı:";
            boolean flag=true;

            switch (secim) {
                case 1:
                    System.out.println("Toplama yapılacak sayıları giriniz.");
                    System.out.print(birinci);
                    int num1=input.nextInt();
                    System.out.print(ikinci);
                    int num2=input.nextInt();
                    sonuc=num1+num2;
                    break;
                case 2:
                    System.out.println("Çıkarma yapılacak sayıları giriniz.");
                    System.out.print(birinci);
                    num1=input.nextInt();
                    System.out.print(ikinci);
                    num2=input.nextInt();
                    sonuc=num1-num2;
                    break;
                case 3:
                    System.out.println("Çarpma yapılacak sayıları giriniz.");
                    System.out.print(birinci);
                    num1=input.nextInt();
                    System.out.print(ikinci);
                    num2=input.nextInt();
                    sonuc=num1*num2;
                    break;
                case 4:
                    System.out.println("Bölme yapılacak sayıları giriniz.");
                    System.out.print(birinci);
                    num1=input.nextInt();
                    System.out.print(ikinci);
                    num2=input.nextInt();
                    sonuc=num1/num2;
                    break;
                default:
                    System.out.println("Hatalı Seçim yaptınız.");
                    flag=false;
                    break;
            }
            if(flag){
                System.out.println("Sonuç= "+sonuc);
            }


        }
    }

