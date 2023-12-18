/**
 * 
 */
package kalkulagailua;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author Ioritz Lopetegi
 */
class KalkulagailuaExceptionTest {

	Kalkulagailua k1;
	int zenba1;
	int zenba2;

	@BeforeEach
	//Errore kontrola egiteko bigarren zenbakia 0 jarri zatiketan errorea ikusteko
	public void kalkulagailua(){
		zenba1 = 8;
		zenba2 = 0;
		k1 = new Kalkulagailua(zenba1, zenba2);

	}


	/**
	 * Test method for {@link kalkulagailua.Kalkulagailua#batu()}.
	 */
	@Test
	void testBatu() {
		try {
			k1.batu();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}


	/**
	 * Test method for {@link kalkulagailua.Kalkulagailua#kendu()}.
	 */
	@Test
	void testKendu() {
		try {
			k1.kendu();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Test method for {@link kalkulagailua.Kalkulagailua#biderkatu()}.
	 */
	@Test
	void testBiderkatu() {
		try {
			k1.biderkatu();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Test method for {@link kalkulagailua.Kalkulagailua#zatitu()}.
	 */
	@Test
	void testZatitu() {
		try {
			if (this.zenba2 == 0) {
	            throw new ArithmeticException("Ezin dateke zatiketa egin 0 ez den zenbaki batekin");
	        }

	        k1.zatitu();
	    } catch (ArithmeticException e) {
	       
	        System.err.println("Ezin dateke zatiketa egin 0 ez den zenbaki batekin");
	      
	    }
		}
	}




