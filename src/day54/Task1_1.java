package day54;

import java.util.ArrayList;
import java.util.List;

public class Task1_1 {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i)%2!=0){
                int silinecekSayi=numbers.get(i);
                numbers.remove(i);
            }
        }

    }
}