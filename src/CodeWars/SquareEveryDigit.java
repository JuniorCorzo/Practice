package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquareEveryDigit {
    public static void main(String[] args) {
        int n = 9119;
        char[] arrayN = String.valueOf(n).toCharArray();
        int[] pow = new int[arrayN.length];
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arrayN.length; i++) {
            int numeberPow = 0;
            for (int j = 0; j < arrayN.length; j++) {
                if(arrayN[i] == arrayN[j]) numeberPow++;
            }

            for (int j = 0; j < arrayN.length; j++) {
                if(arrayN[i] == arrayN[j]) pow[j] = numeberPow;
            }
        }
        for (int i = 0; i < arrayN.length; i++) {
            result.add((int) Math.pow(Double.parseDouble(String.valueOf(arrayN[i])), pow[i]));
        }
        char[] convertToChar = String.valueOf(result).toCharArray();
        System.out.println(Integer.parseInt(String.valueOf(convertToChar)));
    }
}
