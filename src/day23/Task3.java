package day23;

public class Task3 {
    public static void main(String[] args) {
        //On elemanlı sayilar dizi oluşturunuz. Sonra 0-100 arasındaki rastgele tamsayılarla doldurunuz. Listeleyip,
        // toplamını ve ortalamasını gösteren bir Java programı yazınız.

        int [] sayilar=new int[10];
        int toplam=0;
        double ortalama=0.0;
        for (int i = 0; i < sayilar.length ; i++) {
            sayilar[i]=(int)Math.round(Math.random()*99+1);
            toplam+=sayilar[i];
            System.out.print(sayilar[i]+" ");
        }
        System.out.println("Toplam: " +toplam);
        System.out.println("Ortalama: "+(double)toplam/ sayilar.length);


    }
}
