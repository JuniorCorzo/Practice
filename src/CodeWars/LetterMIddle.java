package CodeWars;

public class LetterMIddle {
    public static void main(String[] args) {
        String word = "t";
        String result = null;

        char[] converArray = word.toCharArray();
        int mid = converArray.length / 2;
        if(converArray.length % 2 == 0){
            result = String.valueOf(converArray[mid-1]) + converArray[mid];
        }

        if(converArray.length % 2 != 0) {
            result = String.valueOf(converArray[mid]);
        }


            System.out.println(result);
        }
    }
