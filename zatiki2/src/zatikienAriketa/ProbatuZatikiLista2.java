package zatikienAriketa;

import java.util.Scanner;

/**
 * ProbatuZatikiLista: ZatikiLista klasea probatzeko programa 
 * @author
 */
public class ProbatuZatikiLista2 {

	/**
	 * main (metodo nagusia): zatiki segida bat irakurtzen du sarrera estandarretik,
	 * lerroko zatiki bat, eta lista batean sartzen ditu. Emaitzatzat, zatikirik 
	 * irakurri bada, zatiki guztien arteko handiena eta txikiena, eta beren 
	 * batura eta batezbestekoa inprimatzen ditu
	 */
	public static void main(String[] args) {

		//erazagutu z, Zatiki klaseko instantzia (ez dago hasieratu beharrik) [***]

		Zatiki z = new Zatiki();

		ZatikiLista zatikiListaa = new ZatikiLista();


		zatikiListaa.hustu();

		// Sarrera estandarretik irakurtzeko:
		Scanner kontsola = new Scanner(System.in);

		System.out.println
		("Idatzi zatikiak (z/i formatuan, bakoitza lerro batean); bukatzeko, CTRL+Z:");

		while (kontsola.hasNext()) {
			z = new Zatiki();  
			z.get(kontsola);
			zatikiListaa.erantsiZatikia(z);
			kontsola.nextLine();
		} //while 
		kontsola.close();

		System.out.print("Guztira " + zatikiListaa.zenbatZatiki() + " zatiki daude listan: ");

		if (zatikiListaa.zenbatZatiki() > 0) {

			//erazagutu eta hasieratu, 0/1 balioarekin, 
			//zatikienBatura, Zatiki klaseko instantzia [***]

			Zatiki zatikienBatura = new Zatiki();

			//listako lehen zatikia hartu handientzat eta txikientzat
			Zatiki zatikiHandiena = zatikiListaa.zatikiaPosizioan(0);
			Zatiki zatikiTxikiena = zatikiListaa.zatikiaPosizioan(0);				

			for (int i = 0; i < zatikiListaa.zenbatzatiki; i++) {
				 Zatiki unekoZatiki = zatikiListaa.zatikiaPosizioan(i);

				zatikienBatura = zatikienBatura.batu(zatikiListaa.zatikiaPosizioan(i));

				//handiena eta txikiena identifikatzeko:

				//zatikiHandiena listako i.a baino txikiagoa bada, i.a izango
				//da handiena hemendik aurrera: [***]
				if (unekoZatiki.handiagoaDa(zatikiHandiena)) {
		            zatikiHandiena = unekoZatiki;
		        }


				//zatikiTxikiena listako i.a baino handiagoa bada, i.a izango
				//da txikiena hemendik aurrera: [***]
				if (unekoZatiki.txikiagoaDa(zatikiTxikiena)) {
		            zatikiTxikiena = unekoZatiki;
		        }


				//inprimatu uneko zatikia [***]
				 System.out.println(unekoZatiki);


				System.out.print(" ");
			}
			System.out.println("Zatiki handiena: " + zatikiHandiena);
		    System.out.println("Zatiki txikiena: " + zatikiTxikiena);
			

			System.out.println();

			System.out.print("Beren batura da: "); 
			z.batu(z).put();
			System.out.println();

			System.out.print("Handiena da: ");
			zatikiHandiena.put();
			System.out.println();

			System.out.print("Txikiena da: ");
			zatikiTxikiena.put();
			System.out.println();

			System.out.print("Beren batezbestekoa da: ");

				Zatiki zatikienBatezbestekoa = 
					zatikienBatura.zati(new Zatiki(zatikiListaa.zenbatZatiki()));
				zatikienBatezbestekoa.put();		
			System.out.println();
		}
	}
}
