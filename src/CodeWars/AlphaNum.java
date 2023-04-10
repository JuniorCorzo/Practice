package CodeWars;

public class AlphaNum {
    
    public static boolean isAlphaNumeric(String s){
        if (s == null) return false;
        
        if (!s.equals(s.replaceAll("[^a-zA-Z0-9]", "")) || s.isEmpty()){
            return false;
        }
        
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isAlphaNumeric(""));
    }
}
