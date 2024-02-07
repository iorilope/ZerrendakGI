/*
 * 2024(e)ko ots. 7(a)
 * Ioritz Lopetegi
 */
package dokumentazioa;

/**
 * 
 * @author Ioritz Lopetegi
 */

public class Triangelua extends Irudia {

	/** The erpin 1. */
	private Puntua erpin1;

	/** The erpin 2. */
	private Puntua erpin2;

	/** The erpin 3. */
	private Puntua erpin3;

	/**
	 * Instantiates a new triangelua.
	 *
	 * @param izena  the izena
	 * @param erpin1 the erpin 1
	 * @param erpin2 the erpin 2
	 * @param erpin3 the erpin 3
	 */
	public Triangelua(String izena, Puntua erpin1, Puntua erpin2, Puntua erpin3) {
		super(izena);
		this.erpin1 = erpin1;
		this.erpin2 = erpin2;
		this.erpin3 = erpin3;
	}

	/**
	 * Azalera.
	 *
	 * @return the azalera
	 */
	public double azalera() {
		return 0.5 * Math.abs(erpin1.getX() * (erpin2.getY() - erpin3.getY())
				+ erpin2.getX() * (erpin3.getY() - erpin1.getY()) + erpin3.getX() * (erpin1.getY() - erpin2.getY()));
	}

	/**
	 * Erregularra da.
	 *
	 * @return true, if erregularra
	 */
	public boolean erregularraDa() {
		return (erpin1.distantzia(erpin2) == erpin2.distantzia(erpin3))
				&& (erpin1.distantzia(erpin2) == erpin3.distantzia(erpin1));
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		return ("Triangelua: " + getIzena() + "; Erpinak: " + getErpin1().toString() + getErpin2().toString()
				+ getErpin3().toString());
	}

	/**
	 * Gets the erpin 1.
	 *
	 * @return the erpin 1
	 */
	private Puntua getErpin1() {
		return erpin1;
	}

	/**
	 * Gets the erpin 2.
	 *
	 * @return the erpin 2
	 */
	private Puntua getErpin2() {
		return erpin2;
	}

	/**
	 * Gets the erpin 3.
	 *
	 * @return the erpin 3
	 */
	private Puntua getErpin3() {
		return erpin3;
	}

	/**
	 * Sets the erpin 1.
	 *
	 * @param erpin1 the new erpin 1
	 */
	private void setErpin1(Puntua erpin1) {
		this.erpin1 = erpin1;
	}

	/**
	 * Sets the erpin 2.
	 *
	 * @param erpin2 the new erpin 2
	 */
	private void setErpin2(Puntua erpin2) {
		this.erpin2 = erpin2;
	}

	/**
	 * Sets the erpin 3.
	 *
	 * @param erpin3 the new erpin 3
	 */
	private void setErpin3(Puntua erpin3) {
		this.erpin3 = erpin3;
	}
}