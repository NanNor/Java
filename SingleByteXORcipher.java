package Mai_Juni;

public class SingleByteXORcipher extends methods
{
	public static void main(String[] args)
	{
		byte[] cipherText = hexStringToByteArray("1b37373331363f78151b7f2b783431333d"
				+ "78397828372d363c78373e783a393b3736");
		for (int i = 0; i < 255; i++)
		{
			byte[] decoded = xorIt(cipherText, (byte) i);
			double score = characters(decoded);
			if (score > 0.98) // Under are one more solutions.
			{
				println(toString(decoded));
				print("Key is " + (char) i);
			}
		}
	}

	public static double characters(byte[] arr)
	{
		int count = 0;
		for (byte b : arr)
		{
			if ((b >= 'a' && b <= 'z') || b == ' ')
			{
				count += 1.2; // highest score
			}
			if ((b >= 'A' && b <= 'Z') || b == '\'' || b == '.' || b == '!' || b == '?')
			{
				count += 1.1; // middle score
			}
			if ((b >= '0' && b <= '9') || b == '\n' || b == '\t' || b == '\r')
			{
				count++; // lowest score
			}
		}
		return (double) count / (arr.length);
	}
}
