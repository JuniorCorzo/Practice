package HackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.border.StrokeBorder;

public class SubstringComparation {
    //divide el string en varios framentos dependiendo del tamaño que queramos
    private static List<String> divideStrings(String str, int size){
        List<String> convertStrings = new ArrayList<>();
        for (int i = 0; i < str.length() - (size - 1); i++) {
            convertStrings.add(str.substring(i, i + size));
        }
        return convertStrings;
    }

    private static String substringSmallToLargest(String s, int k){
        HashMap<String, Integer> substringValue = new HashMap<>();
        for (String item : divideStrings(s, k)) {
            int sumCodeAscii = 0;
            for (int i = 0; i < item.length(); i++) {
                char codeAscii = item.charAt(i);
                sumCodeAscii += (int)codeAscii;
            }
            substringValue.put(item, sumCodeAscii);
        }
        return "";
    }
    public static void main(String[] args) {
        substringSmallToLargest("welcometojava", 3);
    }
}
