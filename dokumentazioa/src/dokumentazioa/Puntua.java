/*
 * 2024(e)ko ots. 7(a)
 * Ioritz Lopetegi
 */
package dokumentazioa;

/**
 * 
 * @author Ioritz Lopetegi
 */

public class Puntua {

	/** The X */
	private double x;

	/** The Y */
	private double y;

	/**
	 * Instantiates a new puntua.
	 *
	 * @param x the x
	 * @param y the y
	 */
	public Puntua(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	/**
	 * Distantzia.
	 *
	 * @return the distantzia
	 */
	public double distantzia() {
		Puntua jatorria = new Puntua(0.0, 0.0);
		return distantzia(jatorria);
	}

	/**
	 * Gets the X
	 *
	 * @return the X
	 */
	public double getX() {
		return x;
	}

	/**
	 * Gets the Y
	 *
	 * @return the Y
	 */
	public double getY() {
		return y;
	}

	/**
	 * Distantzia.
	 *
	 * @param bestePuntua the beste_puntua
	 * @return the distantzia
	 */
	public double distantzia(Puntua bestePuntua) {
		return Math.sqrt(Math.pow(x - bestePuntua.getX(), 2) + Math.pow(y - bestePuntua.getY(), 2));
	}

	/**
	 * Kuadrantea.
	 *
	 * @return the kuadrantea int
	 */
	public int kuadrantea() {
		if (x > 0.0 && y > 0.0) {
			return 1;
		} else if (x < 0.0 && y > 0.0) {
			return 2;
		} else if (x < 0.0 && y < 0.0) {
			return 3;
		} else if (x > 0.0 && y < 0.0) {
			return 4;
		} else {
			// (x==0.0 || y==0.0)
			return 0;
		}
	}

	/**
	 * Gertuena.
	 *
	 * @param bestePuntua the beste puntua
	 * @return the gertuena dagoen puntua
	 */
	public Puntua gertuena(Puntua[] bestePuntua) {
		Puntua puntuGertuena = null;
		double disMinimoa = Double.MAX_VALUE;
		double unekoDistantzia;

		for (int i = 0; i < bestePuntua.length; i++) {
			unekoDistantzia = this.distantzia(bestePuntua[i]);
			if (unekoDistantzia <= disMinimoa) {
				disMinimoa = unekoDistantzia;
				puntuGertuena = bestePuntua[i];
			}
		}
		return puntuGertuena;
	}
}