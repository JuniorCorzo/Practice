package CodeWars;

import java.util.Arrays;

public class PyLatin {
    public static String pigIt (String str){
        StringBuilder srtd = new StringBuilder(str);
        String[] strArray = srtd.reverse().toString().split(" ");

        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = strArray[i].concat("ay");
        }

        return Arrays.toString(strArray).replaceAll("[^ a-zA-Z]", "");
    }


    public static void main(String[] args) {
        System.out.println(pigIt("Hello World"));
    }
}
