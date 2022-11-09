package day17;

public class Task {

        public static void main(String[] args) {

            //TASK 1 - 100 Arasındaki Tek ve Çift sayıların toplamını yazdırınız.

            int tekTop=0;
            int ciftTop=0;
            for (int i = 1; i < 100; i++) {
                if(i%2==0){
                    ciftTop+=i;
                }else {
                    tekTop+=i;
                }
            }
            System.out.println("Tek Sayıların Toplamı: " +tekTop);
            System.out.println("Çift Sayıların Toplamı: " +ciftTop);

        }
    }


