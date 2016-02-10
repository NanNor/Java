import java.math.BigInteger;

/**
 * Created by hepstev on 05.01.16.
 */
public class FnBigInteger {
    public static void main(String[] args){
        BigInteger bi2 = new BigInteger("10");
        BigInteger bi3 = bi2.pow(999);
        BigInteger Fn1 = new BigInteger("1");
        BigInteger Fn2 = new BigInteger("1");
        int SumFn = 3;
        while (SumFn < 10000) {
            BigInteger Fn = Fn1.add(Fn2);
            if(Fn.compareTo(bi3) > 0){
                System.out.println("Fn("+ SumFn+") = "+Fn);
                break;
            }
            Fn1 = Fn2;
            Fn2 = Fn;
            SumFn++;
        }
    }
}
