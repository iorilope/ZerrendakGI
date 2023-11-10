package debugAr2;

public class debug_ariketa_1 {

	//1 azaltzen den errorea zatiketa egiterakoan gertatzen da, zatiketa / 0 egiten baitu

	// aldagai estatikoak erakusteko 3 puntuetan sakatu 
	//3  Value of I = 4 value of Step = -468 Value of  result = 472 value of Load =  0	

	//5 F6 sakatzean step over egin dugu beraz process funtzioa saltatu du eta hurengo pausura joan da,Araztaileak 	total = (i * 100) / load; jarraituko du . Value of load = 0 da
	// 6 arazoa konpontzeko beran load = 2  ezarriko dugu 	 result-en balioa 100 baino handiago denean
	// process 1 denean Totala 5 izango da


	private static int load = 1;
	public static void main(String[] args) {
		int i;
		int total;

		i = process(1);

		total = (i * 100) / load;
		if (load == 0) {
			System.out.println("The value of total is infinity");
		}
		else {
			System.out.println("The value of total is "+total);
		}
	}

	private static int process(int step) {
		int i = 1;
		int result = step;
		for (; i <= 3; ++i) {
			result = result * i * step + step;
			if (result > 100) {
				load = 2;
				step = step - result;
			}
			else {
				load = load * result;
				++step;
			}
		}

		// What are the values of i, , step, result, and load?
		return result;	
	}

}
