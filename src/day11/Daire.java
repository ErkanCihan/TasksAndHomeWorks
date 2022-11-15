package day11;

public class Daire {
    public static void main(String[] args) {

        //Dairenin Alan ve Çevre Hesaplamasının Metod aracılığı ile yapılması.
        double r=6.0;
        double alan=alanHesapla(r);
        double cevre=cevreHesapla(r);
        System.out.println("Dairenin Alanı: "+alan);
        System.out.println("Çemberin Çevresi: "+cevre);

    }
    public static double alanHesapla(double r){
        return Math.PI*Math.pow(r,2);

    }
    public static double cevreHesapla(double r){
        return 2*Math.PI*r;
    }

}
