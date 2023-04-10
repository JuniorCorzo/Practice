package CodeWars;


public class FindMissingLetter {

    public static char findMissingLetter(char[] array){
        char c;
        char result = 0;
        int index = 0;
        if (String.valueOf(array[0]).equals(String.valueOf(array[0]).toUpperCase())){
            for (c = array[0]; c <= 'Z'; ++c){
                if (array[index] != c){
                    result = c;
                    break;
                }
                index++;
            }
        }
        if (String.valueOf(array[0]).equals(String.valueOf(array[0]).toLowerCase())){
            for (c = array[0]; c <= 'z'; ++c){
                if (array[index] != c){
                    result = c;
                    break;
                }
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[] input = {'O','Q','R','S'};
        System.out.println(findMissingLetter(input));
    }
}
