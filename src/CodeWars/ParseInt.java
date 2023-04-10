package CodeWars;

import java.util.*;

public class ParseInt {
    private static int parseInt(String numStr) {
        int number;
        HashMap<String, Integer> numbers = new HashMap<>();
        List<String> listNumStr = new ArrayList<>(Arrays.asList(numStr.split(" ")));
        listNumStr.remove("and");
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.put("four", 4);
        numbers.put("five", 5);
        numbers.put("six", 6);
        numbers.put("seven", 7);
        numbers.put("eight", 8);
        numbers.put("nine", 9);
        numbers.put("ten", 10);
        numbers.put("eleven", 11);
        numbers.put("twelve", 12);
        numbers.put("thirteen", 13);
        numbers.put("fourteen", 14);
        numbers.put("fifteen", 15);
        numbers.put("sixteen", 16);
        numbers.put("seventeen", 17);
        numbers.put("eighteen", 18);
        numbers.put("nineteen", 19);
        numbers.put("twenty", 20);
        numbers.put("thirty", 30);
        numbers.put("forty", 40);
        numbers.put("fifty", 50);
        numbers.put("sixty", 60);
        numbers.put("seventy", 70);
        numbers.put("eighty", 80);
        numbers.put("ninety", 90);

        number = 0;
        int prevNum = 0;
        for (String item : listNumStr) {
            String[] numSeparate = item.split("-");
            if (item.equals("zero")) return 0;
            if (listNumStr.contains("one") && listNumStr.contains("million")) return 1000000;

            if (numbers.get(item) != null) {
                number += numbers.get(item);
                continue;
            }

            if (numSeparate.length == 2) {
                number += numbers.get(numSeparate[0]);
                number += numbers.get(numSeparate[1]);
                continue;
            }

            if (item.equals("hundred")) {
                number *= 100;
                continue;
            }

            if (item.equals("thousand")) {
                number *= 1000;
                prevNum = number;
                number = 0;
            }
        }
        number += prevNum;
        return number;
    }

    public static void main(String[] args) {
        System.out.println(parseInt("one thousand two hundred twenty-four"));
    }
}
