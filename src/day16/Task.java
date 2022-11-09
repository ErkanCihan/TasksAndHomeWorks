package day16;

public class Task {

        public static void main(String[] args) {

            //0 - 10 arasındaki sayıların ortalamasını alan program.

            int toplam=0;
            float ortalama=0.0F;

            for (int i = 1; i <=10 ; i++) {
                toplam=toplam+i;
            }System.out.println("toplam: "+toplam/10F);
        }
    }

