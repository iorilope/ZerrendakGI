/*
 * 2024(e)ko ots. 7(a)
 * Ioritz Lopetegi
 */
package dokumentazioa;

/**
 * 
 * @author Ioritz Lopetegi
 */

public abstract class Laukia extends Irudia {

	/** Erpin 1. */
	private Puntua erpin1;

	/** Erpin 2. */
	private Puntua erpin2;

	/** Erpin 3. */
	private Puntua erpin3;

	/** Erpin 4. */
	private Puntua erpin4;

	/**
	 * Instantiates a new laukia.
	 *
	 * @param izena
	 * @param erpin1
	 * @param erpin2
	 * @param erpin3
	 * @param erpin4
	 */
	public Laukia(String izena, Puntua erpin1, Puntua erpin2, Puntua erpin3, Puntua erpin4) {
		super(izena);
		this.erpin1 = erpin1;
		this.erpin2 = erpin2;
		this.erpin3 = erpin3;
		this.erpin4 = erpin4;
	}

	/**
	 * Azalera.
	 *
	 * @return the azalera
	 */
	public abstract double azalera();

	/**
	 * Erregularra da.
	 *
	 * @return true, if erregularra
	 */
	public boolean erregularraDa() {
		return egiaztatuLaukia(erpin1, erpin2, erpin3, erpin4);
	}

	/**
	 * Egiaztatu laukia.
	 *
	 * @param erpin1
	 * @param erpin2
	 * @param erpin3
	 * @param erpin4
	 * @return true, if laukia
	 */
	private boolean egiaztatuLaukia(Puntua erpin1, Puntua erpin2, Puntua erpin3, Puntua erpin4) {
		Puntua auxVertex = erpin1.gertuena(new Puntua[] { erpin2, erpin3, erpin4 });
		if (auxVertex.equals(erpin2)) {
			return erpin1.distantzia(erpin3) == erpin2.distantzia(erpin4)
					&& erpin1.distantzia(erpin4) == erpin2.distantzia(erpin3)
					&& biderketaEskalarra(erpin1, auxVertex, erpin1.gertuena(new Puntua[] { erpin3, erpin4 }));
		} else if (auxVertex.equals(erpin3)) {
			return erpin1.distantzia(erpin2) == erpin3.distantzia(erpin4)
					&& erpin1.distantzia(erpin4) == erpin3.distantzia(erpin2)
					&& biderketaEskalarra(erpin1, auxVertex, erpin1.gertuena(new Puntua[] { erpin2, erpin4 }));
		} else if (auxVertex.equals(erpin4)) {
			return erpin1.distantzia(erpin2) == erpin4.distantzia(erpin3)
					&& erpin1.distantzia(erpin3) == erpin4.distantzia(erpin2)
					&& biderketaEskalarra(erpin1, auxVertex, erpin1.gertuena(new Puntua[] { erpin2, erpin3 }));
		} else {
			return false;
		}
	}

	/**
	 * Biderketa eskalarra.
	 *
	 * @param p1
	 * @param p2
	 * @param p3
	 * @return true, if biderketa eskalarra
	 */
	private boolean biderketaEskalarra(Puntua p1, Puntua p2, Puntua p3) {
		return (p3.getY() - p1.getY()) * (p2.getY() - p1.getY())
				+ (p3.getX() - p1.getX()) * (p2.getX() - p1.getX()) == 0;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		return (getIzena() + "; Erpinak: " + getErpin1().toString() + getErpin2().toString() + getErpin3().toString()
				+ getErpin4().toString());
	}

	/**
	 * Gets the erpin 1.
	 *
	 * @return erpin 1
	 */
	protected Puntua getErpin1() {
		return erpin1;
	}

	/**
	 * Gets the erpin 2.
	 *
	 * @return erpin 2
	 */
	protected Puntua getErpin2() {
		return erpin2;
	}

	/**
	 * Gets the erpin 3.
	 *
	 * @return erpin 3
	 */
	protected Puntua getErpin3() {
		return erpin3;
	}

	/**
	 * Gets the erpin 4.
	 *
	 * @return erpin 4
	 */
	protected Puntua getErpin4() {
		return erpin4;
	}

	/**
	 * Sets the erpin 1.
	 *
	 * @param erpin1 the new erpin 1
	 */
	protected void setErpin1(Puntua erpin1) {
		this.erpin1 = erpin1;
	}

	/**
	 * Sets the erpin 2.
	 *
	 * @param erpin2 the new erpin 2
	 */
	protected void setErpin2(Puntua erpin2) {
		this.erpin2 = erpin2;
	}

	/**
	 * Sets the erpin 3.
	 *
	 * @param erpin3 the new erpin 3
	 */
	protected void setErpin3(Puntua erpin3) {
		this.erpin3 = erpin3;
	}

	/**
	 * Sets the erpin 4.
	 *
	 * @param erpin4 the new erpin 4
	 */
	protected void setErpin4(Puntua erpin4) {
		this.erpin4 = erpin4;
	}
}
