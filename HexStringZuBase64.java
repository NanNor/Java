package Mai_Juni;

import java.util.Base64;
import javax.xml.bind.DatatypeConverter;

public class HexStringZuBase64
{
	public static void main(String[] args)
	{
		String hexString = "49276d206b696c6c696e6720796f7572206272"
				+ "61696e206c696b65206120706f69736f6e6f7573206d757368726f6f6d";
		byte[] string = DatatypeConverter.parseHexBinary(hexString);
		byte[] base64encoded = Base64.getEncoder().encode(string);
		for (byte i = 0; i < base64encoded.length; i++)
		{
			System.out.print((char) base64encoded[i]);
		}
	}
	/*
	 * SSdtIGtpbGxpbmcgeW91ciBicmFpbiBsaWtlIGEgcG9pc29ub3VzIG11c2hyb29t 
	 */
}
