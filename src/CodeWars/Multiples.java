package CodeWars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Multiples {
    public static void main(String[] args) {
        int number = 20;
        int sum = 0;
        List<Integer> multipleOf3 = new ArrayList<>();
        List<Integer> multipleOf5 = new ArrayList<>();
        List<Integer> multiples = new ArrayList<>();

        for (int i = 1; i < number; i++) {
            if(number < 0) break;
            int multiple3 = 3 *i;
            int multiple5 = 5 *i;

                multipleOf3.add(multiple3);
                multipleOf5.add(multiple5);

        }


        for (int i = 1; i < number; i++) {
            if (number < 0) break;
            for (int j = 0; j < number-1; j++) {
                if (multipleOf3.get(j) == i) multiples.add(i);
                if (multipleOf5.get(j) == i) multiples.add(i);
            }
        }

        Collections.sort(multiples);
        for (int i = 1; i < multiples.size(); i++) {
            if(number < 0) break;
            if(multiples.get(i - 1).equals(multiples.get(i))) multiples.remove(i);
        }

        for (int i = 0; i < multiples.size(); i++) {
            if(number < 0) break;
            sum = sum + multiples.get(i);
        }

        System.out.println(sum);

    }
}
