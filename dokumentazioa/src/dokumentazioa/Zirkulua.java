/*
 * 2024(e)ko ots. 7(a)
 * Ioritz Lopetegi
 */
package dokumentazioa;

/**
 * 
 * @author Ioritz Lopetegi
 */

public class Zirkulua extends Irudia {

	/** The Constant PI. */
	public static final double PI = Math.PI;

	/** The zentroa. */
	private Puntua zentroa;

	/** The erradioa. */
	private int erradioa;

	/**
	 * Instantiates a new zirkulua.
	 *
	 * @param izena    the izena
	 * @param zentroa  the zentroa
	 * @param erradioa the erradioa
	 */
	public Zirkulua(String izena, Puntua zentroa, int erradioa) {
		super(izena);
		this.zentroa = zentroa;
		this.erradioa = erradioa;
	}

	/**
	 * Azalera.
	 *
	 * @return the azalera
	 */
	public double azalera() {
		return PI * erradioa * erradioa;
	}

	/**
	 * Erregularra da.
	 *
	 * @return true, if erregularra
	 */
	public boolean erregularraDa() {
		return true;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		return ("Zirkulua: " + getIzena() + "; Erradioa: " + getErradioa() + "; Zentroa" + getZentroa().toString());
	}

	/**
	 * Gets the zentroa.
	 *
	 * @return the zentroa
	 */
	private Puntua getZentroa() {
		return this.zentroa;
	}

	/**
	 * Sets the zentroa.
	 *
	 * @param zentroa the new zentroa
	 */
	private void setZentroa(Puntua zentroa) {
		this.zentroa = zentroa;
	}

	/**
	 * Gets the erradioa.
	 *
	 * @return the erradioa
	 */
	private int getErradioa() {
		return this.erradioa;
	}

	/**
	 * Sets the erradioa.
	 *
	 * @param erradioa the new erradioa
	 */
	private void setErradioa(int erradioa) {
		this.erradioa = erradioa;
	}
}
