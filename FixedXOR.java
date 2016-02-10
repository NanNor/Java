package Mai_Juni;

public class FixedXOR extends methods
{
	public static void main(String[] args)
	{
		String str1 = "1c0111001f010100061a024b53535009181c";
		byte[] str1dec = decode(str1);
		String str2 = "686974207468652062756c6c277320657965";
		byte[] str2dec = decode(str2);
		String expected = "746865206b696420646f6e277420706c6179";
		int raise = 0; // for expected.charAt in line 19
		for (int i = 0; i < str1dec.length; i++)
		{
			int xor = str1dec[i] ^ str2dec[i];
			String str3 = Integer.toHexString(xor);
			if (str3.charAt(0) == (expected).charAt(raise))
			{
				print("PASSED");
			} else
			{
				print(str3+" is not this "+ expected.charAt(i));
				break;
			}
			raise += 2;
		}
		print(" = "+expected);
	}
}
