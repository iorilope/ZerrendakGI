/*
 * 2024(e)ko ots. 7(a)
 * Ioritz Lopetegi
 */
package dokumentazioa;

/**
 * 
 * @author Ioritz Lopetegi
 */
public abstract class Irudia {

	/** The Izena. */
	private String izena;

	/**
	 * Instantiates a new irudia.
	 *
	 * @param izena the izena
	 */
	public Irudia(String izena) {
		this.izena = izena;
	}

	/**
	 * Azalera.
	 *
	 * @return the azalera
	 */
	abstract public double azalera();

	/**
	 * Erregularra da.
	 *
	 * @return true, if erregularra
	 */
	abstract public boolean erregularraDa();

	/**
	 * Gets the izena.
	 *
	 * @return the izena
	 */
	protected String getIzena() {
		return izena;
	}

	/**
	 * Sets the Izena.
	 *
	 * @param izena the new Izena
	 */
	protected void setName(String izena) {
		this.izena = izena;
	}

}