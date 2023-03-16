package day50;

import java.util.ArrayList;

public class MainApp2 {
    public static void main(String[] args) {
        ArrayList<String> liste=new ArrayList<>();//Eğer Array Liste <>(Diamond) içerisinde herhangi bir tip yazılmışsa
        liste.add("Ayşe");                        //sadece o tipten kayıt yapılabilir. String - Stiring ya da int - int gibi
        liste.add("Şule");
        liste.add("Betül");



        System.out.println(liste.get(0).toUpperCase());//Listedeki hangi elemanın referansına erişmek için yazılıyor.
                                                // toUpperCase ise burda tümünü büyük yazdırmak amacı ile kullanıldı.


        for (int i = 0; i < liste.size(); i++) {
            System.out.println(liste.get(i));
        }

    }
}