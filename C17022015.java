public class C17022015
{
	static final int lol = 10;
	static int feld[] = null;

	static void feldFuellen()
	{
		for (int i = 0; i <= lol; i++)
		{
			feld[i] = (int) Math.round(Math.random() * 150 + 10);
		}
	}

	static void pl(Object ob)
	{
		System.out.print(ob);
	}

	static void pln(Object ob)
	{
		System.out.println(ob);
	}

	static void feldAusgabe1()
	{
		pln("Das Feld enthält die " + "folgenden Elemente: ");
		pln("");
		for (int i = 0; i <= lol; i++)
		{
			pln("Random Numbers : " + feld[i]);
		}
		System.out.println();
	}

	static void feldAusgabe2()
	{
		int n = 1;
		pln("Das Feld enthält die folgenden Zahlen:");
		pln(" ");
		for (int i = 0; i <= lol; i++)
		{
			pln("Ausgabe " + (n++) + " : " + feld[i]);
		}
	}

	static void vertausche(int a, int b)
	{
		int ablage = feld[a];
		feld[a] = feld[b];
		feld[b] = ablage;
	}

	static void minsort()
	{
		int minpos;
		pln(" ");
		pln("******** MinSort ********");
		pln(" ");
		for (int i = 0; i <= lol; i++)
		{
			minpos = i;
			for (int k = i + 1; k <= lol; k++)
			{
				if (feld[k] < feld[minpos])
				{
					minpos = k;
				}
			}
			if (minpos > i)
			{
				vertausche(i, minpos);
			}
		}
	}

	public static void main(String[] args)
	{
		feld = new int[lol + 1];
		feldFuellen();
		feldAusgabe1();
		pln("*****************************");
		pln(" Testausgabe:");
		minsort();
		feldAusgabe2();
	}
}
