package ErrefaktoriozazioaAriketa2;

public class Pertsona {
	String telefonoZenbakia;

	public Pertsona(String telefonoZenbakia) {
		super();
		this.telefonoZenbakia = telefonoZenbakia;
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

}
