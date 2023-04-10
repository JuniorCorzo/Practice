package CodeWars;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


public class PerimeterSquare {
    public static BigInteger perimeter(BigInteger n) {
        BigInteger result = BigInteger.valueOf(1);
        List<BigInteger> listFibonacci = new ArrayList<>();
        for (int i = 0; i <= n.intValue(); i++) {
            if(i == 0) {
                listFibonacci.add(BigInteger.ONE);
            } else {
                listFibonacci.add(result);
                result = listFibonacci.get(i-1).add(listFibonacci.get(i));
            }

        }

        result = BigInteger.ZERO;
        for (int i = 0; i < listFibonacci.size(); i++) {
            result = result.add(listFibonacci.get(i));
        }
        
        result = result.multiply(BigInteger.valueOf(4));
        return result; 
    }
    
    public static void main(String[] args) {
        System.out.println(perimeter(BigInteger.valueOf(5)));       
    }
}
