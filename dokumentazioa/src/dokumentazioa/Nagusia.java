/*
 * 2024(e)ko ots. 7(a)
 * Ioritz Lopetegi
 */
package dokumentazioa;

/**
 * 
 * @author Ioritz Lopetegi
 */

import java.util.ArrayList;

/**
 * The Class Nagusia.
 */
public class Nagusia {

	/** The irudiak. */
	private ArrayList<Irudia> irudiak;

	/**
	 * Instantiates a new irudi nagusia.
	 */
	public Nagusia() {
		irudiak = new ArrayList<Irudia>();
	}

	/**
	 * Azalera guztira.
	 *
	 * @return the azalera
	 */
	public double azaleraGuztira() {
		double azaleraGuztira = 0;
		for (int i = 0; i < irudiak.size(); i++) {
			azaleraGuztira = azaleraGuztira + irudiak.get(i).azalera();
		}
		return azaleraGuztira;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		String s = new String();
		for (int i = 0; i < irudiak.size(); i++) {
			s = s + irudiak.get(i).toString() + "\n";
		}
		return s;
	}

	/**
	 * Gehitu irudia.
	 *
	 * @param f the f
	 */
	public void gehituIrudia(Irudia f) {
		irudiak.add(f);
	}

	/**
	 * The main method.
	 *
	 * @param the arguments
	 * @throws Exception
	 */
	public static void main(String args[]) throws Exception {
		Nagusia irudiak = new Nagusia();
		Zirkulua z = new Zirkulua("Zirkulua1", new Puntua(1, 1), 4);
		Triangelua t = new Triangelua("Triangelua1", new Puntua(1, 1), new Puntua(3, 1), new Puntua(2, 3));
		irudiak.gehituIrudia(z);
		irudiak.gehituIrudia(t);
		try {
			Laukizuzena l = new Laukizuzena("Laukizuzena1", new Puntua(1, 4), new Puntua(4, 1), new Puntua(1, 1),
					new Puntua(4, 4));
			irudiak.gehituIrudia(l);
		} catch (IrudiDesegokia e) {
			System.out.println("Error: " + e.getMessage());
		}
		System.out.println(irudiak.toString());
		System.out.println("Azalera guztira: " + irudiak.azaleraGuztira());
	}
}
