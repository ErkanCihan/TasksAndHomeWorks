package day23;

import java.text.BreakIterator;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        //Task 2: Beş elemanlı arabalar dizisi oluşturunuz. Kullanıcıdan bir aradığı arabanın ismini isteyiniz.
        // Bulunca mesela aradığınız araç bulundu veya Araç bulunamadı mesajı veren Java programı yazınız.
        String[]cars={"BMW","Mercedes","Bugatti","Lamborghini","Maserati",};
        System.out.print("Hangi arabayı aramıştınız?: ");
        String input=new Scanner(System.in).nextLine();
        boolean bulunamadi=true;
        for (String araba:cars){
            if (input.equalsIgnoreCase(araba)){
                System.out.println("Aradığınız araba bulundu.");
                bulunamadi=false;
                break;
            }
        }
        if (bulunamadi){
            System.out.println("Aradığınız araba bulunamadı.");
        }
    }
}
