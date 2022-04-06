package CodeWars;

public class ExpandNumbers {
    public static String expandNumbers(int num){
        String result = "";
        int[] separateNumber = new int[String.valueOf(num).length()];
        for (int i = 0; i < separateNumber.length; i++) {
            separateNumber[i] = String.valueOf(num).charAt(i) - '0';
        }

        for (int i = 1; i < separateNumber.length + 1; i++) {
            if (separateNumber[i - 1] > 0) result += ((separateNumber[i -1] * (int) Math.pow(10, separateNumber.length - i)) + " + ");
        }

        return result.substring(0, result.length()-3);
    }

    public static void main(String[] args) {
        System.out.println(expandNumbers(12));
    }
}
