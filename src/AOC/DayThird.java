package AOC;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DayThird {

    public static void lifeSupportRating(List<String> stringList) {
        System.out.println(binaryToDecimal(oxygenGeneratorRating(stringList)) * binaryToDecimal(CO2ScrubberRating(stringList)));

    }

    public static String oxygenGeneratorRating(List<String> stringList) {
        int one = 0;
        int zero = 0;
        String length = stringList.get(0);
        List<String> mostCommon = new ArrayList<>(stringList);

        for (int i = 0; i < length.length(); i++) {

            for (int j = 0; j < mostCommon.size(); j++) {
                char[] parseArrayChar = mostCommon.get(j).toCharArray();
                if (parseArrayChar[i] == '1') one++;
                if (parseArrayChar[i] == '0') zero++;
            }

            int index = 0;
            if (one > zero) {
                while (index != mostCommon.size()) {
                    char[] parseArrayChar = mostCommon.get(index).toCharArray();
                    if (parseArrayChar[i] != '1') {
                        mostCommon.remove(mostCommon.get(index));
                    } else index++;

                }

            }
            if (zero > one) {
                while (index != mostCommon.size()) {
                    char[] parseArrayChar = mostCommon.get(index).toCharArray();
                    if (parseArrayChar[i] != '0') {
                        mostCommon.remove(mostCommon.get(index));
                    } else index++;
                }

            }
            if (one == zero) {
                while (index != mostCommon.size()) {
                    char[] parseArrayChar = mostCommon.get(index).toCharArray();
                    if (parseArrayChar[i] != '1') {
                        mostCommon.remove(mostCommon.get(index));
                    } else index++;

                }

            }

            if (mostCommon.size() == 1){
                break;
            }

            one = 0;
            zero = 0;
        }
        return mostCommon.get(0);
    }

    public static String CO2ScrubberRating(List<String> stringList) {
        int one = 0;
        int zero = 0;
        String length = stringList.get(0);
        List<String> leastCommon = new ArrayList<>(stringList);

        for (int i = 0; i < length.length(); i++) {

            for (int j = 0; j < leastCommon.size(); j++) {
                char[] parseArrayChar = leastCommon.get(j).toCharArray();
                if (parseArrayChar[i] == '1') one++;
                if (parseArrayChar[i] == '0') zero++;
            }

            int index = 0;
            if (one < zero) {
                while (index != leastCommon.size()) {
                    char[] parseArrayChar = leastCommon.get(index).toCharArray();
                    if (parseArrayChar[i] != '1') {
                        leastCommon.remove(leastCommon.get(index));
                    } else index++;

                }

            }
            if (zero < one) {
                while (index != leastCommon.size()) {
                    char[] parseArrayChar = leastCommon.get(index).toCharArray();
                    if (parseArrayChar[i] != '0') {
                        leastCommon.remove(leastCommon.get(index));
                    } else index++;
                }

            }
            if (one == zero) {
                while (index != leastCommon.size()) {
                    char[] parseArrayChar = leastCommon.get(index).toCharArray();
                    if (parseArrayChar[i] != '0') {
                        leastCommon.remove(leastCommon.get(index));
                    } else index++;

                }

            }
            if (leastCommon.size() == 1){
                break;
            }

            one = 0;
            zero = 0;
        }
        return leastCommon.get(0);
    }

    public static int binaryToDecimal(String numberBinary){
        int numDecimal = 0;
        int elevate = numberBinary.length();
        List<Integer> tableConversion = new ArrayList<>();
        for (int i = 0; i < numberBinary.length() - 1; i++) {
            tableConversion.add((int) Math.pow(2, --elevate));
        }
        tableConversion.add(1);
        char[] StringToArray = numberBinary.toCharArray();
        for (int i = 0; i < numberBinary.length(); i++) {
            if (StringToArray[i] == '1') numDecimal += tableConversion.get(i);
        }
        return  numDecimal;
    }


    public static void main (String[]args){
            List<String> stringListBinary = new ArrayList<>();
            try {
                BufferedReader fileRead = new BufferedReader(new FileReader("inputDayThird.txt"));
                String input = fileRead.readLine();
                while (input != null) {
                    stringListBinary.add(input);
                    input = fileRead.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            lifeSupportRating(stringListBinary);
        }
    }
