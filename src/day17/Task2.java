package day17;

public class Task2 {



        public static void main(String[] args) {

            //Task: 1'den 10'a kadar olan sayıların karesini alıp yazdıran java programı tasarlayınız.

            System.out.println("Number\tSquared");
            for (int i = 1; i <=10 ; i++) {
                double kare=Math.pow(i,2);

                System.out.println(i+"       "+kare);

            }
        }
    }


