/**
 * 
 */
package kontua;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;


/**
 * 
 * @author Ioritz Lopetegi
 */
class KontuaTest {

	Kontua k1;
	/**
	 * Test method for {@link kontua.Kontua#Kontua(java.lang.String, float)}.
	 */

	//3.puntuan eskatzen du erabiltzeko hau aldatzeko gure kontua metodo bakoitzean sortu beharko genuke
	@BeforeEach
	public void sortuKontuak(){
		k1 = new Kontua("ID1",2000);
	}


	/**
	 * Test method for {@link kontua.Kontua#getDiru_kop()}.
	 */
	@Test
	void testGetDiru_kop() {
		//k1 = new Kontua("ID1",2000);
		assertEquals(k1.getDiru_kop(),2000);

		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link kontua.Kontua#getID()}.
	 */
	@Test
	void testGetID() {
		//k1 = new Kontua("ID1",2000);
		assertEquals(k1.getID(), "ID1");
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link kontua.Kontua#setDiru_kop(float)}.
	 */
	@Test
	void testSetDiru_kop() {
		//k1 = new Kontua("ID1",2000);
		k1.setDiru_kop(3000);
		assertEquals(k1.getDiru_kop(), 2000);
		fail("Not yet implemented");

	}

	/**
	 * Test method for {@link kontua.Kontua#setID(java.lang.String)}.
	 */
	@Test
	void testSetID() {
		//k1 = new Kontua("ID1",2000);
		k1.setID("ID2");
		assertEquals(k1.getID(),"ID1");
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link kontua.Kontua#informazioa()}.
	 */
	@Test
	//k1 = new Kontua("ID1",2000);
	void testInformazioa() {
		k1.informazioa();
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link kontua.Kontua#diruaSartu(float)}.
	 */
	@Test
	//k1 = new Kontua("ID1",2000);
	void testDiruaSartu() {
		k1.diruaSartu(300);
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link kontua.Kontua#diruaAtera(float)}.
	 * @throws DirurikGabeException 
	 */
	@Test
	//k1 = new Kontua("ID1",2000);
	void testDiruaAtera() throws DirurikGabeException {
		k1.diruaAtera(1000);
		fail("Not yet implemented");
	}
}

//Before each erabiliz gero diru kopurua ehazten da metodo bakoitza hasterakoan Before all egiten badugu dirua sartzerakoan edo 
//SetDiura egiterakoan gure kopurua aldatu egingo da eta ez du balio berdina erabiliko metodo guztietan