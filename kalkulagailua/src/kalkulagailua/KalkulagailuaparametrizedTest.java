/**
 * 
 */
package kalkulagailua;

import java.util.stream.Stream;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * 
 * @author Ioritz Lopetegi
 */
class KalkulagailuaparametrizedTest {
	Kalkulagailua k1;
	private static Stream<Arguments> inputAndResults () {
		return Stream.of(
				Arguments.of(3,4),
				Arguments.of(4,1),
				Arguments.of(7,3),
				Arguments.of(8,1),
				//Aldatu baloreren bat 0-ra errore bat edukitzeko
				Arguments.of(9,2)
				);
	}

	
	
	/**
	 * Test method for {@link kalkulagailua.Kalkulagailua#batu()}.
	 */
	
	@ParameterizedTest
	@MethodSource("inputAndResults")
	void testBatu(int a, int b) {
		Kalkulagailua k1 = new Kalkulagailua(a,b);
		k1.batu();
		
	}

	/**
	 * Test method for {@link kalkulagailua.Kalkulagailua#kendu()}.
	 */
	@ParameterizedTest
	@MethodSource("inputAndResults")
	void testKendu(int a, int b) {
		Kalkulagailua k1 = new Kalkulagailua(a,b);
		k1.kendu();
	}

	/**
	 * Test method for {@link kalkulagailua.Kalkulagailua#biderkatu()}.
	 */
	@ParameterizedTest
	@MethodSource("inputAndResults")
	void testBiderkatu(int a, int b) {
		Kalkulagailua k1 = new Kalkulagailua(a,b);
		k1.biderkatu();
	}

	/**
	 * Test method for {@link kalkulagailua.Kalkulagailua#zatitu()}.
	 */
	@ParameterizedTest
	@MethodSource("inputAndResults")
	void testZatitu(int a, int b) {
		Kalkulagailua k1 = new Kalkulagailua(a,b);
		k1.zatitu();
	}

}
