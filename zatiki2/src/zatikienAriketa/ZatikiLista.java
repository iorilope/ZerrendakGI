package zatikienAriketa;

/**
 * @author
 */
public class ZatikiLista {
	public long zatiki;


	// zatiki-lista (50 osagaikoa) eta listan zenbat zatiki  
	// dauden gordetzen duen aldagaia [***]

	Zatiki[] zatikiaklist = new Zatiki[50];
	 public int zenbatzatiki = 0;



	/**
	 * Eraikitzailea [***]
	 * Oharra: ezinezkoa da klase honen instantziarik eraikitzea kanpotik
	 */

	public ZatikiLista () {

	}


	/**
	 * hustu [***]
	 * Eragina: lista husten du
	 **/

	public  void hustu () {
		zenbatzatiki= 0;
	}


	/**
	 * zenbatZatiki [***]
	 * @return zenbatZatiki (listan dagoen zatiki kopurua)
	 */
	public int zenbatZatiki() {

		return zenbatzatiki;


	}

	/**
	 * erantsiZatikia [***]
	 * Eragina: z zatikia eransten du listaren bukaeran
	 * @param z
	 */
	public void  erantsiZatikia(Zatiki	z) {

		zatikiaklist[zenbatzatiki] = z ;
		zenbatzatiki++;

	}

	/**
	 * zatikiaPosizioan [***]
	 * @param pos (0 eta KOP_MAX-en arteko zenbakia)
	 * @return pos posizioan dagoen zatikiaren berdina den zatikia (berria)
	 */

	public Zatiki zatikiaPosizioan(int pos) {

		if (pos < 0 || pos >50) {

			System.out.println("Posizioak 0-50 artean egon behar du");

		}

		return zatikiaklist[pos];


	}

}
