
public class Pyra {
	static final int Gub = 10;
	static int Zufallszahlen[] = null;
	public static void main(String [] args) {
		System.out.println("Versuchen Sie mit der Summenformel vom Gauß "
				+ "eine Äquivalente Pyramidalzahl zu erhalten");
		String s1 = javax.swing.JOptionPane.showInputDialog((char)425+" "+(char)576+
					(char)704+" (Summenformel von Gauß)");
		int Gz = Integer.parseInt(s1);
		int Gauß = (Gz * (Gz + 1))/2;
				System.out.println("Der kleine Gauß: "+Gauß);
			double n = 5;
			double EinsDurchSechs = (double)1/(double)6;
		while(n<30) {
			double QuadratischePyrazahl = (n*((n+1)*(2*n+1)))*EinsDurchSechs;
		System.out.println("Pyr"+(int)n+"(n): "+(int)QuadratischePyrazahl);
		n++; 
		if (Gauß != QuadratischePyrazahl) {
			System.out.println("Leider nein!!"); }
		if (Gauß == QuadratischePyrazahl) {
			System.out.println("Glückwunsch");
				break;}}
	}
	public static int Pyramidalzahl(){
		double n = 5;
		double EinsDurchSechs = (double)1/(double)6;
		while(n<1000) {
			double QuadratischePyrazahl = (n*((n+1)*(2*n+1)))*EinsDurchSechs;
		System.out.println("Pyr"+(int)n+"(n): "+(int)QuadratischePyrazahl);
						n++; }
						return 0; // Fortsetzung eines Suchprogramms .. Geht nicht .. weil keine vollständige gleichheit .. Toll
	}}

