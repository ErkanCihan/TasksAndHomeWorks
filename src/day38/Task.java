package day38;

public class Task {
    public static void main(String[] args) {

        //verilen kelimeyi tersten yazdıracak bir program tasarlayınız.


        String yemek="Ey Edip Adanada Pide ye";
        String yem=" ";

        for (int i = yemek.length()-1; i >=0 ; i--) {
            System.out.print(yemek.charAt(i)+" ");



        }
    }
}
