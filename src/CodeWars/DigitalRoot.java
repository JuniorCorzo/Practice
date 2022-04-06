package CodeWars;

public class DigitalRoot {
    public static void main(String[] args) {
        int n = 942;
        int result = 0;

        while (result >= 0) {
            char[] arrayN = String.valueOf(n).toCharArray();
            if(arrayN.length == 1)break;
            for (int i = 0; i < arrayN.length; i++) {
                result = result + Integer.parseInt(String.valueOf(arrayN[i]));

            }
            n = result;
            result = 0;
        }
        System.out.println(n);
    }
}
