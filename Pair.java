package StreamsUndIO.de.umr.oop;

public class Pair<T1, T2 extends Number> implements Comparable<Pair<String, Integer>>{
	
	private T1 fst;
	
	private T2 snd;

	public Pair(T1 fst, T2 snd) {
		this.fst = fst;
		this.snd = snd;
	}

	public T1 getFst() {
		return fst;
	}

	public void setFst(T1 fst) {
		this.fst = fst;
	}

	public T2 getSnd() {
		return snd;
	}

	public void setSnd(T2 snd) {
		this.snd = snd;
	}

	@Override
	public int compareTo(Pair<String,Integer> o) {
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pair<?,?> other = (Pair<?,?>) obj;
		if (fst == null) {
			if (other.fst != null)
				return false;
		} else if (!fst.equals(other.fst))
			return false;
		if (snd == null) {
			if (other.snd != null)
				return false;
		} else if (!snd.equals(other.snd))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "(" + fst + " , " + snd + ")";
	}

}
