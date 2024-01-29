package ErrefaktoriozazioaAriketa2;

public class Pertsona {
	String telefonoZenbakia;
	private String izena;
	private int adina;

	public Pertsona(String telefonoZenbakia,String str1,int adina1) {
		this.telefonoZenbakia = telefonoZenbakia;
		setIzena(str1);
		setAdina(adina1);
	}

	public String getTelefonoZenbakia() {
		return telefonoZenbakia;
	}

	// Kode bikoiztua, pertsonan ere telefono zenbakia zehaten baitugu, hobeto
	// egongo litzateke pertsonatik kanpo
	public void setTelefonoZenbakia(String telefonoZenbakia) {
		this.telefonoZenbakia = telefonoZenbakia;
	}

	// Klase sinpleegia freeloader bakarrik set eta get dauzka

	public void printInformazioPertsonala() {

		// Mezuak gorde daitezke Informazio guztian mezu hauek ere erabiliko
		// baitugu,str eta izen aldagaiak utsik dijoatze beraz
		// soberan daude
		//printInformazio pertsonala eta yasta 
		System.out.println();
		System.out.println("Adina: " + getAdina());
		System.out.println("Zenbakia: " + telefonoZenbakia);
	}

	/**
	 * @return the izena
	 */
	public String getIzena() {
		return izena;
	}

	/**
	 * @param izena the izena to set
	 */
	public void setIzena(String izena) {
		this.izena = izena;
	}

	/**
	 * @return the adina
	 */
	public int getAdina() {
		return adina;
	}

	/**
	 * @param adina the adina to set
	 */
	 public void setAdina(int adina) {
		this.adina = adina;
	}
}
