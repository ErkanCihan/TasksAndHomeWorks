package day19;

public class Task {

        public static void main(String[] args) {

            int student=12;
            int total=0;
            int average;
            int[]notes={56,75,90,47,83,58,33,86,92,65,90,45};
            for (int i = 0; i < notes.length ; i++) {
                total+=notes[i];
            }
            System.out.println("Total Point: "+total);
            average=total/student;
            System.out.println("Average: "+average);

            int toplam=0;
            for (int i = 0; i <notes.length; i++) {
                toplam+=notes[i];
            }
            System.out.printf("Ortalama= %5.2f", toplam/notes.length);




        }
    }

