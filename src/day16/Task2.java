package day16;

public class Task2 {

        public static void main(String[] args) {

            //Task 2:
            //0'dan 20'ye kadar olan TEK sayıların toplamını bulup, sonucu ekrana yazdıran Java programını yazınız.


            int sayi = 0;
            for (int i = 1; i <= 20; i = i + 2) {
                sayi = sayi+i;

            }
            System.out.println("Toplam: "+sayi);
            //Task 1:
            //0'dan 20'ye kadar olan ÇİFT sayıları ekrana yazdıran Java programını yazınız. (Sıfır ve yirmi dahil)

            int num = 0;
            for (int i = 0; i <= 20; i = i + 2) {
                num += i;
                System.out.print(i + " ");
            }
            System.out.println();
            //Task 3:
            //0'dan 100'e kadar olan sayılardan hem 5'e hem de 2'ye tam bölünebilen sayıları ekrana yazdıran
            // Java programını yazınız. (Sıfır ve yüz dahil)

            for (int i = 0; i <=100 ; i++) {
                if(i%2==0 & i%5==0){
                    System.out.print(i+ " ");
                }
            }
        }
    }

