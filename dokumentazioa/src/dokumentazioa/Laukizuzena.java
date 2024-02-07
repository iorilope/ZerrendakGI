/*
 * 2024(e)ko ots. 7(a)
 * Ioritz Lopetegi
 */
package dokumentazioa;

/**
 * 
 * @author Ioritz Lopetegi
 */

public class Laukizuzena extends Laukia {

	/**
	 * Instantiates a new laukizuzena.
	 *
	 * @param izena
	 * @param erpin1
	 * @param erpin2
	 * @param erpin3
	 * @param vertex4
	 * @throws IrudiDesegokia
	 */
	public Laukizuzena(String izena, Puntua erpin1, Puntua erpin2, Puntua erpin3, Puntua vertex4)
			throws IrudiDesegokia {
		super(izena, erpin1, erpin2, erpin3, vertex4);
		if (erregularraDa() == false) {
			throw new IrudiDesegokia("Erpinak laukizuzenarekin bateraezinak dira.");
		}
	}

	/**
	 * Azalera.
	 *
	 * @return the azalera
	 */
	public double azalera() {
		Puntua[] erpinak234 = new Puntua[] { getErpin2(), getErpin3(), getErpin4() };
		Puntua erpinLaguntzailea = getErpin1().gertuena(erpinak234);
		Puntua[] besteErpinak = null;
		if (erpinLaguntzailea.equals(getErpin2())) {
			besteErpinak = new Puntua[] { getErpin3(), getErpin4() };
		} else if (erpinLaguntzailea.equals(getErpin3())) {
			besteErpinak = new Puntua[] { getErpin2(), getErpin4() };
		} else if (erpinLaguntzailea.equals(getErpin4())) {
			besteErpinak = new Puntua[] { getErpin2(), getErpin3() };
		}
		double oinarria = getErpin1().distantzia(erpinLaguntzailea);
		double altuera = erpinLaguntzailea.distantzia(erpinLaguntzailea.gertuena(besteErpinak));
		return oinarria * altuera;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		return ("Laukizuzena: " + super.toString());
	}
}
