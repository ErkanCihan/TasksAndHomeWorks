package day14;

import java.util.Scanner;

public class MainApp {


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print(" Enter First Number: ");
            int sayi = input.nextInt();
            System.out.print("Enter Second Number:");
            int sayi2 = input.nextInt();
            System.out.print("Enter Third Number:");
            int sayi3 = input.nextInt();

            if (sayi >= sayi2 & sayi >= sayi3) {
                System.out.println("En büyük sayı: " + sayi);

            } else if (sayi2 >= sayi3 & sayi2 >= sayi) {
                System.out.println("En büyük sayı: " + sayi2);

            } else if (sayi3 >= sayi2 & sayi3 >= sayi) {
                System.out.println("En büyük sayı: " + sayi3);
            }


            // Bu problemin Math kütüphanesi ile çözümü:
            double n1=7.9;
            double n2=5.3;
            System.out.println(Math.max(n1,n2)+"Sayısı daha büyüktür.");



            Scanner girdi = new Scanner(System.in);
            System.out.print(" Enter First Number: ");
            int num = input.nextInt();
            System.out.print("Enter Second Number:");
            int num2 = input.nextInt();
            System.out.print("Enter Third Number:");
            int num3 = input.nextInt();

            int min=num;
            if(num>num2){
                min=num2;
            }
            if (num2>num3){
                min=num3;
            }
            System.out.println("En Küçük Sayi: "+min);


        }
    }

