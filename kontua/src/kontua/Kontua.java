package kontua;


/**
 * Kontua inplementatzen duen klasea
 * 
 * @author 
 */

@SuppressWarnings("serial")
 class DirurikGabeException extends Exception {
    public DirurikGabeException() {
        super("Errorea: Dirurik Gabe,Ezin duzu kantitate hori atera");
    }
}
public class Kontua {

	// 
	/**
	 * klasearen barne-errepresentazioa (eremuak): 
	 * kontuaren diru kopurua (diru_kop) eta kontuaren zenbakia (ID)
	 */
	private float diru_kop;
	private String ID;

	/**
	 * Eraikitzailea: Kontu bat eraikitzen du, ID1 kontu zenbakia hartuz eta 
	 * diru_kop1 hasierako diru kantitatea hartuz
	 * @param ID1 karaktere sekuentzia
	 * @param diru_kop1 zenbaki postibo arrazionala
	 */
	public Kontua(String ID1, float diru_kop1) {
		ID = ID1;
		diru_kop = diru_kop1;
	}

	/**
	 * getDiru_kop:
	 * @return kontuan dagoen diru kopurua
	 */
	public float getDiru_kop() {
		return diru_kop;
	}

	/**
	 * getID:
	 * @return kontu zenbakia
	 */
	public String getID() {
		return ID;		
	}

	/**
	 * setDiru_kop:
	 * @param diru_kop1 ezartzen du kontuan
	 */
	public void setDiru_kop(float diru_kop1) {
		diru_kop = diru_kop1;
	}

	/**
	 * setID:
	 * @param ID1 ezartzen du kontu zenbakitzat
	 */
	public void setID(String ID1) {
		ID = ID1;		
	}

	/**
	 * informazioa:
	 * Kontuaren informazioa idazten du
	 */
	public void informazioa() {
		System.out.println("Zure zenbakia " + ID + " da eta " + diru_kop + "€ dituzu");
	}

	/**
	 * diruaSartu:
	 * @param kant gehitzen da kontuan
	 */
	public void diruaSartu(float kant) {
		diru_kop+=kant;
	}

	/**
	 * diruaAtera:
	 * @param kant kentzen da kontuan
	 * Oharra: kantitate negatiboa geratzen bada, salbuespen bat jaurti beharko du
	 * [***]
	 */
	
	public void diruaAtera(float kant) throws DirurikGabeException {
        if (diru_kop - kant < 0) {
            throw new DirurikGabeException();
        }

        diru_kop -= kant;
    }


}
