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
class KalkulagailuaTest {
	Kalkulagailua k1;

	@BeforeEach
	public void kalkulagailua(){
		k1 = new Kalkulagailua(8, 5);

	}


	/**
	 * Test method for {@link kalkulagailua.Kalkulagailua#batu()}.
	 */
	@Test
	void testBatu() {
		k1.batu();
	}

	/**
	 * Test method for {@link kalkulagailua.Kalkulagailua#kendu()}.
	 */
	@Test
	void testKendu() {
		k1.kendu();
	}

	/**
	 * Test method for {@link kalkulagailua.Kalkulagailua#biderkatu()}.
	 */
	@Test
	void testBiderkatu() {
		k1.biderkatu();
	}

	/**
	 * Test method for {@link kalkulagailua.Kalkulagailua#zatitu()}.
	 */
	@Test
	void testZatitu() {
		k1.zatitu();
	}

}
