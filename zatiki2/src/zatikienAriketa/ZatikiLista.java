package zatikienAriketa;

/**
 * @author
 */
public class ZatikiLista {
	
	@SuppressWarnings("serial")
	public class LekurikEz extends Exception {
		public LekurikEz(String s) {super(s);}
	}
	@SuppressWarnings("serial")
	public class ZatikirikEzPosizioHorretan extends Exception {
		public ZatikirikEzPosizioHorretan(String s) {super(s);}
	}
	
	
	public long zatiki;

	// zatiki-lista (50 osagaikoa) eta listan zenbat zatiki  
	// dauden gordetzen duen aldagaia [***]

	Zatiki[] zatikiaklist;
	public int zenbatzatiki = 0;

	/**
	 * Eraikitzailea [***]
	 * Oharra: ezinezkoa da klase honen instantziarik eraikitzea kanpotik
	 */

	public ZatikiLista () {
		zatikiaklist = new Zatiki[50];
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
	 * @throws LekurikEz 
	 */
	public void  erantsiZatikia(Zatiki	z) throws LekurikEz {
		if (zatikiaklist.length < 50) {
			throw new LekurikEz("Ez dago tokirik zerrendan");
			
		}

		zatikiaklist[zenbatzatiki] = z ;
		zenbatzatiki++;

	}

	/**
	 * zatikiaPosizioan [***]
	 * @param pos (0 eta KOP_MAX-en arteko zenbakia)
	 * @return pos posizioan dagoen zatikiaren berdina den zatikia (berria)
	 * @throws ZatikirikEzPosizioHorretan 
	 */

	public Zatiki zatikiaPosizioan(int pos) throws ZatikirikEzPosizioHorretan {

		if (pos < 0 || pos >50) {

			throw new ZatikirikEzPosizioHorretan("Zatikia ez dago posizio egokian");

		}

		return zatikiaklist[pos];


	}

}
