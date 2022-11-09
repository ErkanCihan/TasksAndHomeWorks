package day20;

import java.util.Scanner;

public class Task2 {
        public static void main(String[] args) {

            String[]months={"Ocak","Şubat","Mart","Nisan","Mayıs","Haziran","Temmuz","Ağustos","Eylül","Ekim","Kasım","Aralık"};
/*
        String[] aylar=new String[12];
        aylar[0]="Ocak";
        aylar[1]="Şubat";
        aylar[2]="Mart";
        aylar[3]="Nisan";
        aylar[4]="Mayıs";
        aylar[5]="Haziran";
        aylar[6]="Temmuz";
        aylar[7]="Ağustos";
        aylar[8]="Eylül";
        aylar[9]="Ekim";
        aylar[10]="Kasım";
        aylar[11]="Aralık";
*/
            System.out.print("Kaçıncı ayı tercih ettiniz? [1 - 12]: ");
            Scanner input=new Scanner(System.in);
            int secim= input.nextInt();
            if (secim>0&secim<=12){

            }else {
                System.out.println("Hatalı Seçim Girdiniz!");
            }
            System.out.printf("Seçilen Ay %s",months[secim-1]);
        }
    }


