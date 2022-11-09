package day10;

public class Task {
    public static void main(String[] args) {
        int kare1=alanHesapla(2);
        int kare2=alanHesapla(3);
        int toplamAlan=kare1+kare2;
        System.out.println("Toplam Alan ="+toplamAlan);


    }
    public static int alanHesapla(int kenar){
        return kenar*kenar;

    }
}