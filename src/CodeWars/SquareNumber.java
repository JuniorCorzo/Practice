package CodeWars;

public class SquareNumber {

    public static boolean isSquare(int n){
        boolean result = false;
        int index = 0;
        while(index <= n){
            if (Math.pow(index, 2) == n) {
                result = true;
                break;
            }
            if (Math.pow(index, 2) > n) break;
            index++;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(isSquare(0));
    }
}
