package day13;

import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {

        //Klavyeden Kullanıcı tarafından girilen Username ve Password' u If - Else Metodu ile karşılaştıran ve sonuca göre
        //Kullanıcıya cevap veren bir program.

        Scanner input=new Scanner(System.in);
        System.out.print("Enter Username : ");
        String userName= input.next();
        System.out.print("Enter Password : ");
        int passWord=input.nextInt();

        String name="Erkan";
        int pass=995125;

        if(userName.equals(name)&pass==passWord){
            System.out.println("Yönetim Sayfasına hoşgeldiniz");
        } else if (!(userName.equals(name))){
            System.out.println("Yanlış Kullanıcı adı girdiniz.");
        } else if (!(passWord==pass)) {
            System.out.println("Yanlış Parola girdiniz");
        }else{
            System.out.println("Yönetici sayfasına hoşgeldiniz!");
        }

    }

}
