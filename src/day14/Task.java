package day14;

public class Task {

    public static void main(String[] args) {
        //TODO: İki tamsayı değişkenine değerleri assign ediniz.
/*

            Önce bunları isimleri ve değerleriyle birlikte ekrana yzadırınız.
            Daha sonra iki değişkenin değerlerini yer değiştirip ekrana tekrar yazdırınız.
*/


        int x=18;
        int y=81;

        System.out.println(x);
        System.out.println(y);

        int empty;

        empty=y;
        y=x;
        x=empty;

        System.out.println(x);
        System.out.println(y);









    }
}

