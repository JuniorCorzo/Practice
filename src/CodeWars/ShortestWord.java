package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;

public class ShortestWord {

    public static int findShort(String s ){
        String[] separate = s.split(" ");
        int[] sizesLetter = new int[separate.length];

        for (int i = 0; i < separate.length; i++) {
            sizesLetter[i] = separate[i].length();
        }
        Arrays.sort(sizesLetter);
        return sizesLetter[0];
    }


    public static void main(String[] args) {
        System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));
    }
}
