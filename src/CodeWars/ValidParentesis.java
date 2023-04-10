package CodeWars;

import java.util.ArrayList;
import java.util.List;

public class ValidParentesis {
 

    public static boolean isValidParentesis(String parens) {
        System.out.println(parens);
        List<Integer> parenthesesOrganize = new ArrayList<>();
        List<String> parenthesesInput = new ArrayList<>();
        
        char[] parensArray = parens.replaceAll("[a-zA-Z0-9,]", "").toCharArray();
        for (int i = 0; i < parensArray.length; i++) {
            parenthesesInput.add(String.valueOf(parensArray[i]));
        }

        int i = 0;
        while (parenthesesInput.size() != 0) {
            if (i == parenthesesInput.size())
                break;
            if (parenthesesInput.get(i).equals("(")) {
                parenthesesOrganize.add(1);
            }
            if (parenthesesInput.get(i).equals(")")) {
                parenthesesOrganize.add(0);
            }

            System.out.println(parenthesesOrganize);
            i++;
        }  
        if (parenthesesOrganize.size() % 2 != 0) return false;
        
        int reset = 0;
        for (int j = 0; j < parenthesesOrganize.size(); j++) {

            if (reset == 1){
             j = 0;
             reset = 0;
            }

            if (parenthesesOrganize.size() == 1){
                return false;
            } 

            if (j == 0 && parenthesesOrganize.get(j) == 0) {
                return false;
            }

            if (parenthesesOrganize.get(0) == 1){
                if (parenthesesOrganize.contains(0) == false) return false;
            }
            
            if (parenthesesOrganize.get(j) == 1 && parenthesesOrganize.get(j + 1) == 0) {
                parenthesesOrganize.remove(j + 1);
                parenthesesOrganize.remove(j);
                reset += 1;
                System.out.println(parenthesesOrganize);
            }

            if (parenthesesOrganize.size() == 2 && parenthesesOrganize.get(0) == 1 && parenthesesOrganize.get(1) == 1) return false;
        }

        if(parenthesesOrganize.size() == 0) return true;
        if (parenthesesOrganize.get(0) == 1 && parenthesesOrganize.get(1) == 0) return true; 
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isValidParentesis("1{(7]("));
    }

}
