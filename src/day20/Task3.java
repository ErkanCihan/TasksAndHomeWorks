package day20;

import java.util.Scanner;

public class Task3 {

        public static void main(String[] args) {
            //Task: Gün isimlerinden ibaret TR-EN sözlük hazırlayınız. Türkçe arama yapılmış ise ingilizcesini,
            // ingilizce arama yapılmış ise Türkçesini ekrana yazdırınız.

            String[]gunler={"Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"};
            String[]days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
            System.out.println("Lütfen bir gün giriniz. Gün Türkçe veya İngilizce olabilir.");
            System.out.print("Gün / Day: ");
            String day=new Scanner(System.in).nextLine();
            for (int i = 0; i < days.length; i++) {
                if (day.equalsIgnoreCase(days[i])){
                    System.out.println(gunler[i]);
                    break;
                } else if (day.equalsIgnoreCase(gunler[i])) {
                    System.out.println(days[i]);
                    break;
                }
            }
        }
    }


