package day58;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class Queues {

        public static void main(String[] args) {
        /*
            Queue: FIFO, yani ilk giren ilk çıkar
         */
            Queue<String> printer=new LinkedList<>();
            System.out.println(printer);
            printer.offer("Sayfa 1");
            printer.offer("Sayfa 2");
            printer.offer("Sayfa 3");
            System.out.println(printer);
            System.out.println("İlk bastırılacak sayfa : "+printer.peek());
            System.out.println("Sayfa basıtırılıyor..");
            System.out.println("Bastırılan sayfa : "+printer.poll());
            System.out.println("İlk bastırılacak sayfa : "+printer.peek());

            System.out.println("-------------------------------------------");
            LinkedList<String> linkedList=(LinkedList)printer;
            ListIterator<String> stringListIterator = linkedList.listIterator();
            while (stringListIterator.hasNext()){
                System.out.println(stringListIterator.next());
            }
            System.out.println("--");
            while (stringListIterator.hasPrevious()){
                System.out.println(stringListIterator.previous());
            }




        }
    }

