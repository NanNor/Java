import java.math.BigInteger;
import java.security.SecureRandom;

import javax.swing.JOptionPane;

public class RSAcrypto
{
	private final static BigInteger ONE = new BigInteger("1");
	private final static SecureRandom RANDOM = new SecureRandom();

	private BigInteger privateKey;
	private BigInteger publicKey;
	private BigInteger modulus;

	static long BREAK = 1; // != 2

	RSAcrypto(int N)
	{
		BigInteger p = BigInteger.probablePrime(N / 2, RANDOM);
		BigInteger q = BigInteger.probablePrime(N / 2, RANDOM);
		BigInteger phi = (p.subtract(ONE)).multiply(q.subtract(ONE));
		System.out.println("Primzahl 1: " + p);
		System.out.println("Primzahl 2: " + q);
		System.out.println("phi: " + phi);
		modulus = p.multiply(q);
		publicKey = new BigInteger("5");
		privateKey = publicKey.modInverse(phi);
	}

	public static void main(String[] args) throws Exception
	{
		try
		{
			String s1 = JOptionPane.showInputDialog(null, null);
			int N = Integer.parseInt(s1);
			RSAcrypto key = new RSAcrypto(N);
			prln(key);
			BigInteger Nachricht = new BigInteger(N, RANDOM);
			BigInteger encrypt = key.encrypt(Nachricht);
			BigInteger decrypt = key.decrypt(encrypt);
			prln("Nachricht: " + N);
			prln("Nachricht: " + Nachricht);
			prln("Verschlüsselt = " + encrypt);
			prln("Entschlüsselt = " + decrypt);
		}
		catch (Exception e)
		{

			System.err.println("Wiederholen");

			System.err.println("Bitte noch mal "); //Funktioniert nicht immer
			// TODO: handle exception

		}
	}

	BigInteger encrypt(BigInteger nachricht)
	{
		return nachricht.modPow(publicKey, modulus);
	}

	BigInteger decrypt(BigInteger encrypted)
	{
		return encrypted.modPow(privateKey, modulus);
	}

	public String toString()
	{
		String s = "";
		s += "Öffentlich (e)  = " + publicKey + "\n";
		s += "Privat (d) = " + privateKey + "\n";
		s += "modulo (n) = " + modulus;
		return s;
	}

	public static void prln(Object ob)
	{
		System.out.println(ob);
	}

}
