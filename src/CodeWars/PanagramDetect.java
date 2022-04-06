package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PanagramDetect {
    public static boolean isPanagram(String sentece) {
        boolean isPanagram = false;
        List<String> sentenceList = new ArrayList<>();
        List<String> alphabet = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"));

        char[] input = sentece.toLowerCase().replaceAll("[^a-z]", "").toCharArray();
        for (int i = 0; i < input.length; i++) {
            sentenceList.add(String.valueOf(input[i]));
        }

        Collections.sort(sentenceList);

        int index = 0;
        while (index != sentenceList.size()){
            if (index >= 26) index = 0;
            for (int i = index+1; i < sentenceList.size(); i++) {
                if (sentenceList.get(index).equals(sentenceList.get(i))) sentenceList.remove(i);
            }
            index++;
        }
        System.out.println(sentenceList);
        if (sentenceList.equals(alphabet)) isPanagram = true;

        return isPanagram;
    }
    public static void main(String[] args) {
        System.out.println(isPanagram("nnmlrjhpvuxbfmggi zoactd y wteq thkkrs"));
    }
}
