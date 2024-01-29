package ErrefaktoriozazioaAriketa2;

import java.util.List;

public class Irakasle extends Pertsona {

	List<Mailegua> maileguak;

	public Irakasle(String telefonoZenbakia, String izena, int adina) {
		super(telefonoZenbakia, izena, adina);
	}

	public void printInformazioGuztia() {
		printInformazioPertsonala();
		
		for (Mailegua m : maileguak) {
			System.out.println(m);
		}
	}
}
