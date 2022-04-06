package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ListFitering {
    
    public static List<Object> filterList(final List<Object> list) {
        List<Object> listIntegers = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
           if(Character.isDigit(String.valueOf(list.get(i)).charAt(0))) listIntegers.add(list.get(i));
        }

        for (int i = 0; i < listIntegers.size(); i++) {
            for (int j = 1; j < listIntegers.size(); j++) {
                if (i != j){
                    if (String.valueOf(listIntegers.get(i)).equals(String.valueOf(listIntegers.get(j)))) listIntegers.remove(j);
                }
            }
        }
        return listIntegers;
    }
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>(Arrays.asList(1, 2, "aasf", "1", "123", 123));
        System.out.println(filterList(list));
    }    
}
