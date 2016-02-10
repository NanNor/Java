import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by hepstev on 01.02.16.
 */
public class DistinctPowers {
    public static void main(String[] args){
        Set<BigInteger> hs = new HashSet<>();
        fill(hs);
        System.out.println(hs.size());
    }
    public static Set fill(Set n){
        BigInteger a = new BigInteger("100");
        BigInteger b = new BigInteger("100");
        while(b.compareTo(BigInteger.ONE) > 0) {
            while(a.compareTo(BigInteger.ONE) > 0) {
            int exp = (int)b.longValue();
                n.add(a.pow(exp));
            a = a.subtract(BigInteger.ONE);
            }
            a = BigInteger.valueOf(100);
            b = b.subtract(BigInteger.ONE);
        }
        return n;
    }

}
