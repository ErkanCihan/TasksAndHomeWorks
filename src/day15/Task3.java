package day15;

import java.util.Scanner;

public class Task3 {



        public static void main(String[] args) {
            // TODO: 26.10.2022 Alan ve Çevre Hesaplama
            //1. Kare
            //2. Daire
            //Seçiminiz:
            //Yukarıdaki menüyü tasarlayınız.
            //Gerekli diğer kodlamaları yaparak alan ve çevre sonucunu gösteren Java programını yazınız.
            //Not: Seçim için switch kullanılacaktır.

            System.out.println("-".repeat(20));
            System.out.println("Alan ve Daire Hesap");
            System.out.println("-".repeat(20));
            System.out.println("1. Kare");
            System.out.println("2. Daire");
            System.out.println("-".repeat(20));
            System.out.print("Seçiminiz: ");
            Scanner input = new Scanner(System.in);
            int secim = input.nextInt();
            String sonuc="";
            boolean flag=true;
            switch (secim){
                case 1:
                    System.out.print("Karenin Kenar Uzunluğu: ");
                    double kenar=input.nextDouble();
                    if(kenar<0){
                        flag=false;
                        break;
                    }
                    double kCevre=4*kenar;
                    double kAlan=Math.pow(kenar,2);
                    System.out.println("Karenin Alanı= "+kAlan);
                    System.out.println("Karenin Çevresi= "+kCevre);
                    break;
                case 2:
                    System.out.print("Çemberin Yarıçap Uzunluğu: ");
                    double yaricap= input.nextDouble();
                    if (yaricap<0){
                        flag=false;
                        break;
                    }
                    double pi=Math.PI;
                    double dCevre=2*(pi*yaricap);
                    double dAlan=pi*Math.pow(yaricap,2);
                    System.out.println("Dairenin Çevresi= "+dCevre);
                    System.out.println("Dairenin Alanı= "+dAlan);
                    break;
                default:
                    System.out.println("Hatalı Seçim Yaptınız!");
            }
            if(flag==true){
                System.out.println(sonuc);
            }else{
                System.out.println("Negatif Seçim olmaz!");
            }




        }
    }

