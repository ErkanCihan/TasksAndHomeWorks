package day27.GeoMetri;

public class daire {
    /**
     * Daire (Çember) nesnesini temsil eder.
     */

    public int yaricap;

    public daire() {
    }

    public daire(int yaricap) {
        this.yaricap = yaricap;
    }

    /**
     * Dairenin Alan Hesaplaması: Math.PI*Math.pow(yaricap,2);
     * @return double
     */

    public double alanHesapla(){
       return Math.PI*Math.pow(yaricap,2);

    }

    /**
     * Dairenin Çevre Hesaplaması: 2*Math.PI.yaricap
     * @return double
     */
    public double cevreHesapla(){
        return 2*Math.PI*yaricap;

    }
}

