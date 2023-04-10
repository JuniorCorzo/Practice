package CodeWars;

import java.util.*;

public class SumStringAsNumbers {
    /*
    public static List<Integer> completeList(List<Integer> toComplete, int sizeToComplete){

        for (int i = 0; i < (sizeToComplete - toComplete.size()) + 1; i++) {
            toComplete.add(0, 0);
        }
        return toComplete;
    }*/


    public static String srtSum(String numbersSrtA, String numbersSrtB){
        List<String> resultSum = new ArrayList<>();
        List<Integer> listSrtNumberA = new ArrayList<>();
        List<Integer> listSrtNumberB = new ArrayList<>();
        Arrays.stream(numbersSrtA.split("(?<=.)")).mapToInt(Integer::parseInt).forEach(listSrtNumberA::add);
        Arrays.stream(numbersSrtB.split("(?<=.)")).mapToInt(Integer::parseInt).forEach(listSrtNumberB::add);

        int saveNum = 0;
        if (listSrtNumberA.size() > listSrtNumberB.size()){
            int index = 0;
            Collections.reverse(listSrtNumberA);
            Collections.reverse(listSrtNumberB);
            for (int sum : listSrtNumberA){
                sum += (listSrtNumberB.get(index) + saveNum);
                saveNum = 0;
                if (sum > 9 && index != listSrtNumberB.size() - 1){
                    saveNum = sum/10;
                    sum %= 10;
                }
                listSrtNumberA.set(index, sum);
                index = index == listSrtNumberB.size() -1? index : index + 1;
            }
            Collections.reverse(listSrtNumberA);
            return listSrtNumberA.toString().replaceAll("[^0-9]", "");
        }

        for (int i = listSrtNumberB.size() - 1; i > 0; i--){

        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(srtSum("23950", "3306"));
    }
}
