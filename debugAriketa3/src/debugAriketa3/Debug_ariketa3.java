/*
 * 2023(e)ko aza. 13(a)
 * Ioritz Lopetegi
 */
package debugAriketa3;



// TODO: Auto-generated Javadoc
//Hainbat arazo daude, lehenik Myobject gaizki idatzita zegoen mayuskula gabe beraz gure objetua ez da deketatzen, gainera i = 8 for-etik kanpoan dago

// var1 eta obj1 aldagaiek method2(obj1) exekutatu ostean var 1 = 2 eta obj1 Joe

//method1(var1) exekutatu ostean var 1 = -20 eta obj1 john


//False itzultzen du objetuaren balorea berdina delako baina objetua desberdina da hau da, beraien ID-a desberina da
/**
 * The Class Debug_ariketa3.
 */
public class Debug_ariketa3 {

	/** The var 1. */
	private static int var1;
	
	/** The obj 1. */
	//private static MyObject obj1;
	private static Myobject obj1;


	/**
	 * Method 1.
	 *
	 * @param var1 the var 1
	 */
	private static void method1 (int var1) {
		var1 = 10;
	}

	/**
	 * Method 2.
	 *
	 * @param obj2 the obj 2
	 */
	private static void method2 (Myobject obj2) {
		Myobject obj1 = new Myobject("joe");

		if (obj1 == obj2) 
			var1 = 20;
		else var1 = -20;

		obj2 = new Myobject("john");
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		var1 = 2;
		obj1 = new Myobject("joe");

		for (int i = 1; i < 2; ++i) {
			int var1 = i;
		}

		//i = 8;

		method2(obj1);

		// 8. What are the values of var1 and obj1.name?

		method1(var1);

		// 9. What are the values of var1 and obj1.name? 

	}


}
