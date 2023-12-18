package kalkulagailua;


public class Kalkulagailua {

	private int zenb1;
	private int zenb2;

	public Kalkulagailua(int a, int b) {
		zenb1 = a;
		zenb2 = b;
	}

	public int batu() {
		int ema = zenb1 + zenb2;
		return ema;
	}

	public int kendu() {
		int ema = zenb1 - zenb2;
		return ema;
	}

	public int biderkatu() {
		int ema = zenb1 * zenb2;
		return ema;
	}

	public int zatitu() {
		int ema = zenb1 / zenb2;
		return ema;
	}

}
