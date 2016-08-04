fsdf
public class BiKoe {
	public static void main(String [] args) throws InterruptedException {
			pln("{ n "+(char)400+ " N | n>k }");
			Thread.sleep(500);
		String s = javax.swing.JOptionPane.showInputDialog("Bitte geben Sie N ein:");
			int n = Integer.parseInt(s);  // n>k !!!
		String s1 = javax.swing.JOptionPane.showInputDialog("Bitte geben Sie K ein:");
			int k = Integer.parseInt(s1); // n über k
				pln("");
				pln("Produkt: "+Prod(k,n)); // Produkt von|bis. 
				// Beispiel: 3*12 .. Produkt von 3 BIS 12 .. 3*4*5*6*7*8*9*10*11*12
				pln("Fakultät von "+k+" : " +Fakultät(k));
				pln("Fakultät von "+n+" : " +Fakultät(n));
				pln("Binom: " +BK(n,k));
				pln((char)425); // Ich muss noch passendere UnicodeSymbole finden.
	}
	static void pln(Object ob) {
		System.out.println(ob);
	}
	static int Prod(int n, int k) {
	if(n > n)
		return -1;
		int prod=n;
	do {
		n++;
		prod *=n;
}			while(n < k);
				return prod;
}
	static int Fakultät(int n) {
		int fak = n;
			while(n > 1) {
				n--;
				fak *= n;}
			return fak;}
	static int BK(int n, int k) {
		if(n < k)
			return 0;
			return Fakultät(n) / (Fakultät(k) * Fakultät(n-k));
}	}
