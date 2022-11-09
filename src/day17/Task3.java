package day17;

public class Task3 {

        public static void main(String[] args) {

            //Task: 60km den başlayarak 10 km artırıp Mil (mph) olarak karşılığını yazınız.

            System.out.println("  Km\t\tMPH");
            for (int i = 60; i <= 130; i += 10) {
                double mph = i * 0.6214;
                System.out.printf("%5d\t\t%5.1f", i, mph);
                System.out.println();




            }

        }
    }



