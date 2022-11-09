package day12;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        //Mantıksal Operatör Örnekleri
        /*
        Klavyeden girilen üç sayının birbirlerine göre büyüklüklerini test ediniz.
        ortaya çıkan sonuçları &,|, ^ve ! ile işleme sokup ekranda gösteriniz.
        */
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Girin: ");
        int num1 = input.nextInt();
        System.out.print("İkinci Sayıyı Girin: ");
        int num2 = input.nextInt();
        System.out.print("Üçüncü Sayıyı Girin: ");
        int num3 = input.nextInt();

        boolean n1 = num1 >= num2;
        boolean n2 = num2 >= num3;
        boolean n3 = num1 >= num3;

        System.out.println(n1 & n2);
        System.out.println(n1 & n3);
        System.out.println(n2 & n3);

        System.out.println(n1 | n2);
        System.out.println(n1 | n3);
        System.out.println(n2 | n3);

        System.out.println(n1 ^ n2);
        System.out.println(n1 ^ n3);
        System.out.println(n2 ^ n3);

        System.out.println(!(n1));
        System.out.println(!(n2));
        System.out.println(!(n3));
    }
}

