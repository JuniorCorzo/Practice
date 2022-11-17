package CodeWars;

public class LSC {
    
    public static String lsc(String x, String y){
        String result = "";
    
        for (int i = 0; i < x.length(); i++) {
            for (int j = 0; j < y.length(); j++) {
                if(x.charAt(i) == y.charAt(j)){
                    result = result.concat(String.valueOf(y.charAt(j)));
                    break;
                }
            }
        }

        /*
        Segunda solucion sin usar ciclos anidados
        int indexX = 0;
        int indexY = 0;
        while(indexX < x.length()){
            if (x.charAt(indexX) == y.charAt(indexY)){
                result = result.concat(String.valueOf(y.charAt(indexY)));
                indexX ++;
                indexY = 0; 
            } else {
                indexY++;
            }

            if (indexY == y.length()){
                if (indexX < x.length()) indexX++;
                indexY = 0;
            }
            
        }*/
        return result;
    }
    public static void main(String[] args) {
        System.out.println(lsc("abcdf", "abcg"));
    }
}
