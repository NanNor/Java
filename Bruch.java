import javax.swing.JOptionPane;
public class Bruch {
	private int  zaehler;
	private int  nenner=1;
	private String etikett = ""; 
	public void setzeZaehler(int zpar) {zaehler = zpar;} 
	public void setzeNenner(int n) {
		nenner=n;}
	
	public void setzeEtikett(String epar) { 
		if	(epar.length()	<= 40)
			etikett = epar; 
		else 
			etikett = epar.substring(0, 40); 
		}	
		
	public int gibZaehler() {return zaehler;} 
	public int gibNenner() {return nenner;} 
	public String gibEtikett() {return etikett;} 
	
	public void kuerze() { 
		if (zaehler != 0) { 
			int rest; 
			int ggt = Math.abs(zaehler); 
			int divisor = Math.abs(nenner); 
				do { 
					rest = ggt % divisor; 
					ggt = divisor; 
					divisor = rest; 
				} while (rest > 0); 
				zaehler /= ggt; 
				nenner  /= ggt; 
		}	else	
			nenner = 1; 
		}
		
		public void addiere(Bruch b) {
			
		}
		
		public void frage() {} 
		
		public void zeige() { 
			String luecke = "";
			JOptionPane.showMessageDialog(null,"Der eingegebene Bruch: "+"" + luecke  + "   " + zaehler + "\n"  
					+"                                              " + etikett + " ‐‐‐‐‐\n"  
					+" " + luecke  + "                                               " + nenner + "\n"); 
		}
		public void zeigegekürzt() { 
			String luecke = ""; 
			int el = etikett.length(); 
			for (int i=1; i<=el; i++) 
				luecke = luecke + " "; 
			JOptionPane.showMessageDialog(null,"Der Bruch gekürzt ergibt: "+"" + luecke  + "   " + zaehler + "\n"  
					+"                                               " + etikett + " ‐‐‐‐‐\n"  
					+" " + luecke  + "                                                " + nenner + "\n"); 
		}
		public static void main(String[] args) {  
			Bruch b = new Bruch(); // weil eigentlich 2 Klassen 
			String s = JOptionPane.showInputDialog("Zähler eingeben");
			int Z = Integer.parseInt(s);
		String s1 = JOptionPane.showInputDialog("Nenner eingeben");
			int N = Integer.parseInt(s1);
				b.setzeZaehler(Z); 
				b.setzeNenner(N); 
				b.zeige();
				b.kuerze(); 
				b.setzeEtikett(""); 
				b.zeigegekürzt(); }
	}

