package day09;

import java.util.Scanner;

public class TaskInput {
    public static void main(String[] args) {
        //TASK: Klavyeden girilen iki sayının çarpımını bulup ekrana yazan bir Java programı tasarlayınız.

        Scanner input=new Scanner(System.in);
        System.out.print("Birinci Sayı : ");
        int num1 = input.nextInt();
        System.out.print("İkinci Sayı : ");
        int num2 = input.nextInt();
        int carpim=num1*num2;
        System.out.println("Çarpım: "+carpim);
        //Klavyeden girilen iki tamsayının toplamını bulup ekrana yazdıran bir java programını yazınız.


        Scanner input1=new Scanner(System.in);
        System.out.print("Birinci Sayı : ");
        int sayi1 = input.nextInt();
        System.out.print("İkinci Sayı : ");
        int sayi2 = input.nextInt();
        int toplam=sayi1+sayi2;
        System.out.println("Toplam: "+toplam);






    }
}
