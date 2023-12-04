
package zatiki;
import java.util.*;

//Agian behar duzue:
import java.lang.Math;

/**
 * Zatiki klasea
 */
public class Zatiki {

	// klasearen barne-errepresentazioa (eremuak): zatikiaren
	// zenbakitzailea eta izendatzailea [***]



	public long zenbakitzailea;
	public long izendatzailea;
	public long zatikia;



	// Oharra: long erabiltzea komeni da, int "motzegia" geratzeko 
	// arriskua handiegia delako (eta Javak ez du, berez, overflow-errore
	// hori automatikoki detektatzen!)

	// eragiketa eraikitzaileak

	/**
	 * Eraikitzailea (parametrorik gabekoa): 0/1 zatikia eraikitzen du [***]
	 */


	Zatiki () {

		//zatikia = 0/1;
		this.zenbakitzailea = 0;
		this.zenbakitzailea = 1;


	}


	/**
	 * Eraikitzailea: zatiki bat eraikitzen du, z zenbakitzailetzat 
	 * eta i izendatzailetzat hartuz [***]
	 * @param z zenbaki osoa
	 * @param i zenbaki positiboa
	 */
	Zatiki (long z, long i) {

		this.zenbakitzailea = z;
		this.izendatzailea = i;






	}



	/**
	 * Eraikitzailea: z/1 zatikia eraikitzen du [***]
	 * Oharra: osoa zatiki bihurtzeko eragiketatzat har daiteke
	 * @param z zenbaki osoa
	 */
	Zatiki (long z) {

		this.zenbakitzailea = z;
		this.izendatzailea = 1;

	}




	//   deskonposatze-eragiketak (kontsulta)

	/**
	 * zenb [***]
	 * @return zatikiaren zenbakitzailea
	 */

	public long zenb () {
		return zenbakitzailea;
	}


	/**
	 * izend [***]
	 * @return zatikiaren izendatzailea
	 */

	public long izend () {
		return izendatzailea;
	}


	public String toString() {
		sinplifikatua();
		return zenbakitzailea + "/" + izendatzailea;                                                                                   
	}

	//   eragiketa aritmetikoak

	/**
	 * batu [***]
	 * @param bestea
	 * @return 
	 * @return zatikia + bestea (batura, sinplifikaturik)
	 * 
	 */


	public long mcd() {
		long u = (long) Math.abs(zenbakitzailea);
		long v = (long) Math.abs(izendatzailea); 
		if (v == 0) {
			return u;
		}
		long r;
		while (v != 0) {
			r = u % v;
			u = v;
			v = r;
		}
		return u;
	}


	public Zatiki sinplifikatua() {
		long n = mcd();
		long zenba1 = zenbakitzailea / n;
		long izena1 = izendatzailea / n;

		Zatiki zatikia = new Zatiki(zenba1,izena1);

		return zatikia;
	}
	public  Zatiki batu (Zatiki bestea) {

		Zatiki a1 = new Zatiki();
		a1.zenbakitzailea = this.zenbakitzailea * bestea.izendatzailea + this.izendatzailea * bestea.zenbakitzailea;
		a1.izendatzailea = this.izendatzailea * a1.izendatzailea;
		a1.sinplifikatua();                                                   
		return a1;
	}

	/**
	 * ken [***]
	 * @param bestea
	 * @return zatikia - bestea (kendura, sinplifikaturik)
	 */

	public  Zatiki kendu (Zatiki bestea) {

		Zatiki a1 = new Zatiki();
		a1.zenbakitzailea = this.zenbakitzailea * bestea.izendatzailea - this.izendatzailea * bestea.zenbakitzailea;
		a1.izendatzailea = this.izendatzailea * a1.izendatzailea;

		return a1;


	}


	/**
	 * bider [***]
	 * @param bestea
	 * @return zatikia * bestea (biderkadura, sinplifikaturik)
	 */
	public Zatiki bider (Zatiki bestea) {

		Zatiki a1 = new Zatiki();
		a1.zenbakitzailea = this.zenbakitzailea * bestea.zenbakitzailea;
		a1.izendatzailea = this.izendatzailea * bestea.izendatzailea;

		return a1;

	}

	/**
	 * zati [***]
	 * @param bestea
	 * @return zatikia / bestea (zatidura, sinplifikaturik)
	 */

	public Zatiki zati (Zatiki bestea) {

		Zatiki a1 = new Zatiki();
		a1.zenbakitzailea = this.zenbakitzailea * bestea.izendatzailea;
		a1.izendatzailea = this.izendatzailea * bestea.zenbakitzailea;

		return a1;

	}



	//   konparatze-eragiketak

	/**
	 * berdinaDa [***]
	 * @param bestea
	 * @return true, zatikia eta bestea berdinak edo baliokideak badira; false, bestela
	 */

	public boolean berdinaDa (Zatiki bestea) {

		if (this.zenbakitzailea == bestea.zenbakitzailea && this.izendatzailea == bestea.izendatzailea) {

			return true;
		}

		else {
			return false;
		}
	}


	/**
	 * txikiagoaDa [***]
	 * @param bestea
	 * @return true, zatikia < bestea bada; false, bestela
	 */

	public boolean txikiagoaDa (Zatiki bestea) {

		if (this.zenbakitzailea * bestea.izendatzailea < this.izendatzailea * bestea.zenbakitzailea) {

			return true;
		}

		else {
			return false;
		}
	}


	/**
	 * handiagoaDa [***]
	 * @param bestea
	 * @return true, zatikia > bestea bada; false, bestela
	 */


	public boolean handiagoaDa (Zatiki bestea) {

		if (this.zenbakitzailea * bestea.izendatzailea > this.izendatzailea * bestea.zenbakitzailea) {

			return true;
		}

		else {
			return false;
		}
	}



	//   bestelako eragiketak

	/**
	 * zatikiaOso [***]
	 * @return zatikiaren zenbakitzailearen eta izendatzailearen 
	 * arteko zatidura osoa
	 */

	public long zatikiaOso () {


		long osoa = (zenbakitzailea / izendatzailea);

		long  ZenbakiOsoa = Math.round(osoa);

		return ZenbakiOsoa;

	}



	/**
	 * sinplifikatua [***]
	 * @return zatikia sinplifikaturik
	 */

	public long sinplifikatua2 () {
		return izendatzailea;
	}
	public long sinplifikatua3 () {
		return zenbakitzailea;
	}


	// sarrera-irteerako eragiketak

	/**
	 * put[***]
	 * Eragina: zatikia idazten du irteera estandarrean, z/i formatuan 
	 */

	public void put () {
		System.out.println(zenbakitzailea + "/" + izendatzailea);
	
	}

	/**
	 * get
	 * Eragina: zatikiaren zenbakitzailea eta izendatzailea 
	 *          sarreratik irakurritakoez aldatzen ditu. 
	 * Oharra: zatikiak z/i formatuan etorri behar du, lerro batean
	 * Oharra: irakurritako izendatzailea negatiboa bada, zeinua  
	 *         aldatzen zaie bai zenbakitzaileari bai izendatzaileari
	 * @param sarrera, nondik zatikia irakurriko baita         
	 */
	public void get(Scanner sarrera) {
		long i; //izendatzailea irakurtzeko

		sarrera.useDelimiter("[/\\s]"); // bereizletzat / (slash-a), zuriuneak eta lerro-bukaerak hartzeko

		this.zenbakitzailea = sarrera.nextInt();
		i = sarrera.nextInt(); //slash-aren ondorengo zenbakia irakurri (izendatzailea)
		if (i < 0) { //zeinuak aldatu
			this.izendatzailea = -i;
			this.zenbakitzailea = -this.zenbakitzailea;
		}
		else
			this.izendatzailea = i;
	} // get

}
