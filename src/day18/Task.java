package day18;

import java.util.Scanner;

public class Task {



        public static void main(String[] args) {
            String secim = mainMenu().toUpperCase();
            switch (secim) {
                case "1":
                    String mathSecim = mathMenu().toUpperCase();
                    if (mathSecim.equals("1")) {
                        System.out.print("Faktöriyeli Hesaplanacak Sayı: ");
                        System.out.println("Sonuç = " + faktoriyel(new Scanner(System.in).nextInt()));
                    } else if (mathSecim.equals("2")) {
                        System.out.print("Mutlak Değeri Hesaplanacak Sayı: ");
                        int sayi = new Scanner(System.in).nextInt();
                        System.out.printf("Sonuç =%5d", sayi > 0 ? sayi : -sayi);

                    } else if (mathSecim.equals("Q")) {
                        System.out.println("Programdan çıkış yaptınız.");

                    } else {
                        System.out.println("Hatalı seçim yaptınız!");
                    }
                    break;
                case "2":
                    String geoSecim = geoMenu().toUpperCase();
                    switch (geoSecim) {
                        case "1":
                            System.out.println("Dikdörtgen için;");
                            System.out.print("Uzun Kenar: ");
                            int uKenar = new Scanner(System.in).nextInt();
                            System.out.print("Kısa Kenar: ");
                            int kKenar = new Scanner(System.in).nextInt();
                            //System.out.printf("Dairenin Alanı=%5d\n ",kKenar*uKenar);
                            //System.out.printf("Dairenin Alanı=%5d\n ",2*(kKenar+uKenar));
                            System.out.printf("Çevre=%5d\n", cevreHesapla(uKenar, kKenar));
                            System.out.printf("Alan=%5d\n", alanHesapla(uKenar, kKenar));
                            break;
                        case "2":
                            System.out.println("Kare için: ");
                            System.out.print("Kenarı giriniz: ");
                            int kenar = new Scanner(System.in).nextInt();
                            System.out.printf("Karenin Alanı=%5.2f\n", Math.pow(kenar,2));
                            System.out.printf("Karenin Çevresi=%5d\n", 4 * kenar);
                            break;
                        case "3":
                            System.out.println("Daire için: ");
                            System.out.print("Dairenin Yarıçapını giriniz: ");
                            double yariCap = new Scanner(System.in).nextDouble();
                            System.out.printf("Dairenin Çevresi=%5.2f\n", 2 * (Math.PI * yariCap));
                            System.out.printf("Dairenin Alanı=%5.2f\n", Math.PI * Math.pow(yariCap, 2));
                            break;
                        case "Q":
                            System.out.println("Programdan çıkış yaptınız.");
                            break;
                        default:
                            System.out.println("Hatalı seçim yaptınız!");
                            break;
                    }
                    break;
                case "Q":
                    System.out.println("Programdan çıkış yaptınız.");
                    break;
                default:
                    System.out.println("Hatalı seçim yaptınız!");
                    ;
                    break;
            }
        }

        public static int alanHesapla(int uKenar, int kKenar) {
            return uKenar * kKenar;
        }

        public static int cevreHesapla(int uKenar, int kKenar) {
            return 2 * (uKenar + kKenar);
        }

        public static String mainMenu() {
            System.out.println("Ana Menü");
            System.out.println("1. Matematiksel İşlemler");
            System.out.println("2. Alan ve Çevre Hesaplama");
            System.out.println("Q. Çıkış");
            System.out.print("Seçiminiz: ");
            //Scanner input=new Scanner(System.in);
            //String choice=input.nextLine();
            //return choice;
            return new Scanner(System.in).nextLine();
        }

        public static String mathMenu() {
            System.out.println("Alt Menü| Matematik İşlemleri");
            System.out.println("1. Faktöriyel Hesaplama");
            System.out.println("2. Mutlak Değer Alma");
            System.out.println("Q. Çıkış");
            System.out.print("Seçiminiz: ");
            //Scanner input=new Scanner(System.in);
            //String choice=input.nextLine();
            //return choice;
            return new Scanner(System.in).nextLine();
        }

        public static String geoMenu() {
            System.out.println("1. Dikdörtgen");
            System.out.println("2. Kare");
            System.out.println("3. Daire");
            System.out.println("Q. Çıkış");
            System.out.print("Seçiminiz: ");
            //Scanner input=new Scanner(System.in);
            //String choice=input.nextLine();
            //return choice;
            return new Scanner(System.in).nextLine();

        }

        public static int faktoriyel(int deger) {

            if (deger < 2) return 1;

            int carpim = 1;
            for (int i = 2; i <= deger; i++) {
                carpim *= i;

            }
            return carpim;
        }
    }


