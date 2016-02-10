import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by hepstev on 15.12.15.
 */
public class Factorial {
    public static void main(String[] args){
        ArrayList<BigInteger> sumoffact100 = new ArrayList<>();
        BigInteger fact100 = factorial(100);
        String pf = fact100.toString();
        BigInteger tenpow = BigInteger.TEN;
        for(int h = 0; h<pf.length();h++){
            sumoffact100.add((fact100.mod(tenpow)));
            fact100 = fact100.divide(tenpow);
        }
        int sum = 0;
        for(int i = 0; i<sumoffact100.size();i++){
            sum +=sumoffact100.get(i).intValue();
                   }
        System.out.println(sum);
    }
    public static BigInteger factorial(long n){
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

}
