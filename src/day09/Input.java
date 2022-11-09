package day09;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //Klavyeden girilen iki tamsayının toplamını bulup ekrana yazdıran bir java programını yazınız.


        Scanner input=new Scanner(System.in);
        System.out.print("Birinci Sayı : ");
        int sayi1 = input.nextInt();
        System.out.print("İkinci Sayı : ");
        int sayi2 = input.nextInt();
        int toplam=sayi1+sayi2;
        System.out.println("Toplam: "+toplam);




    }
}
