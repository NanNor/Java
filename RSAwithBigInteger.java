
import java.math.BigInteger;
import java.security.SecureRandom;


public class RSAwithBigInteger {
    public BigInteger n, d, e;

    public int bitlen = (int)Math.pow(2,10);

    public RSAwithBigInteger(int bits) {
        bitlen = bits;
        SecureRandom r = new SecureRandom();
        BigInteger p = new BigInteger(bitlen / 2, 100, r);
        BigInteger q = new BigInteger(bitlen / 2, 100, r);
        n = p.multiply(q);
        BigInteger m = (p.subtract(BigInteger.ONE)).multiply(q
                .subtract(BigInteger.ONE));
        e = new BigInteger("3");
        while (m.gcd(e).intValue() > 1) {
            e = e.add(new BigInteger("2"));
        }
        d = e.modInverse(m);
    }

    public synchronized BigInteger encrypt(BigInteger message) {
        return message.modPow(e, n);
    }

    public synchronized BigInteger decrypt(BigInteger message) {
        return message.modPow(d, n);
    }

    public synchronized BigInteger getN() {
        return n;
    }

   public static void main(String[] args) {
        RSAwithBigInteger rsa = new RSAwithBigInteger(1024);

        String text1 = "Das ist der Text der verschlüsselt werden soll";
        System.out.println("plaintext: " + text1);
        BigInteger plaintext = new BigInteger(text1.getBytes());

        BigInteger ciphertext = rsa.encrypt(plaintext);
        System.out.println("ciphertext: " + ciphertext);
        plaintext = rsa.decrypt(ciphertext);

        String text2 = new String(plaintext.toByteArray());
        System.out.println("plaintext: " + text2);
      }
}
