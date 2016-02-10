public class MaxIndexMinSort extends C17022015
{
	public static void main(String[] args)
	{
		int maxIndex = 99;
		boolean maxindex = true;
		if (maxindex == true)
		{
			while (true)
			{
				maxIndex++;
				pl(maxIndex);
				if (maxIndex == 200)
					break;
				{
					maxindex = false;
				}
				pln(maxindex);
				feld = new int[lol + 1];
				feldFuellen();
				minsort();
				feldAusgabe2();
			}
		}

	}
}
