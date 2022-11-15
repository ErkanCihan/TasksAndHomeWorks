package day27.GeoMetri;

/**
 * Kare Nesnesini temsil eder.
 */

public class kare {

    public int kenar;

    public kare() {
    }

    public kare(int kenar) {
        this.kenar = kenar;
    }


    /**
     * Karenin Alan Hesaplaması: Math.pow(kenar,2)
     * @return int
     */
    public int alanHesapla(){
        return kenar*kenar;
    }
    /**
     * Karenin Çevre Hesaplaması: 4*kenardır.
     * @return int
     */
    public int cevreHesapla(){
        return 4*kenar;
    }
    /**
     * Karenin Köşegen Uzunluğu Hesaplaması: kenar*Mathsqrt(2)
     * @return double
     */
    public double kosegenUzunlugu(){
        return kenar*Math.sqrt(2);
    }
}
