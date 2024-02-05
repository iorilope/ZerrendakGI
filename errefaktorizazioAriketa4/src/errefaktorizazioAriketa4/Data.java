/**
 * 
 */
package errefaktorizazioAriketa4;

/**
 * 
 * @author Ioritz Lopetegi
 */
public class Data {
	private int urtea;
	private int hilabetea;
	private int eguna;

	public Data(int urtea, int hilabetea, int eguna) {
		this.urtea = urtea;
		this.hilabetea = hilabetea;
		this.eguna = eguna;
	}

	public boolean egiaztatu() {
		if (eguna < 1 || eguna > 31)
			return false;
		if (hilabetea < 1 || hilabetea > 12)
			return false;
		// hilabeta batean egun kopurua zehaztu:
		int hilabeteEgunKop = 0;

		switch (hilabetea) {
		case 1, 3, 5, 7, 8, 10, 12:
			hilabeteEgunKop = 31;
		break;

		case 4, 6, 9, 11:
			hilabeteEgunKop = 30;
		break;

		case 2: // Bisurtea den egiaztatu
			if ((urtea % 400 == 0) || ((urtea % 4 == 0) && (urtea % 100 != 0)))
				hilabeteEgunKop = 29;
			else
				hilabeteEgunKop = 28;
			break;
		}

		return eguna <= hilabeteEgunKop;
	}

	public static void main(String[] args) {
		Data data = new Data(1978, 12, 30);
		System.out.println(data.egiaztatu());

	}

}
