package day27.GeoMetri;

public class MainApp {
    public static void main(String[] args) {

        kare square=new kare(7);

        daire circle=new daire(7);

        double alanFarki=Math.abs((square.alanHesapla()- circle.alanHesapla()));
        double cevreFarki=Math.abs(square.cevreHesapla()- circle.cevreHesapla());

        System.out.println("Alan Farkı= "+alanFarki);
        System.out.println("Çevre Farkı= "+cevreFarki);

    }
}
