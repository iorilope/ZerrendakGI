package ErrefaktoriozazioaAriketa2;

import java.util.List;

public class Irakasle extends Pertsona {
	String str;
	int adina;
	String telefonoZenbaki;
	// Aldagaiaren izena objetutko atributuaren izen berdina du aldatzea komeni da
	// eta beste bi aldagaiak ez dira erabiltzen Pertsona klasean
	List<Mailegua> maileguak;

	public Irakasle(String telefonoZenbakia) {
		super(telefonoZenbakia);
	}

	public void printInformazioPertsonala() {

		// Mezuak gorde daitezke Informazoia guztian mezu hauek ere erabiliko
		// baitugu,str eta izen aldagaiak utsik dijoatze beraz
		// soberan daude
		//System.out.println("Izena: " + str);
		//System.out.println("Adina: " + adina);
		System.out.println("Zenbakia: " + telefonoZenbaki);
	}

	public void printInformazioGuztia() {
		//System.out.println("Izena: " + str);
		//System.out.println("Adina: " + adina);
		System.out.println("Zenbakia: " + this.telefonoZenbaki);
		for (Mailegua m : maileguak) {
			System.out.println(m);
		}
	}
}
