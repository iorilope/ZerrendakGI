package zatiki;

import java.util.Scanner;


/**
 * ProbatuZatiki: Zatiki klasea probatzeko programa
 * @author
 */
public class ProbatuZatiki {

	/**
	 * main (metodo nagusia): bi zatiki irakurtzen ditu, beren ezaugarri 
	 * batzuk inprimatu, eta beren arteko eragiketa batzuk egin eta 
	 * emaitzak inprimatzen ditu
	 */
	public static void main(String[] args) {

		//erazagutu eta hasieratu f eta g, Zatiki klaseko instantziak [***]

		Zatiki f = new Zatiki ();
		Zatiki g = new Zatiki ();


		Scanner kontsola = new Scanner(System.in);

		System.out.println("Idatzi zatiki bat (z/i):");

		//irakurri f zatikia
		f.get(kontsola);
		kontsola.nextLine();

		//idatzi f eta bere ezaugarri batzuk
		System.out.print("F zatikia: ");
		f.put();
		System.out.println();
		System.out.print("Zenbakitzailea: ");
		System.out.println(f.zenb());
		System.out.print("Izendatzailea: ");
		System.out.println(f.izend());
		System.out.print("Zatikia sinplifikaturik: ");

		System.out.println(f.sinplifikatua());
		System.out.print("Zatikia oso bihurturik: ");
		System.out.println(f.zatikiaOso());      

		System.out.println("Idatzi beste zatiki bat (z/i):");

		//irakurri g zatikia [***]

		g.get(kontsola);
		kontsola.nextLine();

		//idatzi g eta bere ezaugarri batzuk
		System.out.print("G zatikia: ");
		//[***]
		g.put();
		System.out.println();
		System.out.print("Zatikia sinplifikaturik: ");
		//[***]
		System.out.println(g.sinplifikatua());
		System.out.println();

		//f eta g-ren artean eragiketa batzuk egin,
		//eta emaitzak idatzi
		System.out.print("F + G: ");
		f.batu(g).put();
		System.out.println();
		System.out.print("F - G: ");
		f.kendu(g).put();
		//[***]
		System.out.println();
		System.out.print("G - F: ");
		//[***]
		g.batu(f).put();
		System.out.println();
		System.out.print("F * G: ");
		f.bider(g).put();
		//[***]
		System.out.println();
		System.out.print("F / G: ");
		f.zati(g).put();
		//[***]
		System.out.println();
		System.out.print("G / F: ");
		g.zati(f).put();
		//[***]
		System.out.println();

		if (f.sinplifikatua().berdinaDa(g.sinplifikatua())) {
			System.out.println("F eta G berdinak dira");
		} else if (f.sinplifikatua().txikiagoaDa(g.sinplifikatua())) {
			System.out.println("F txikiagoa da G baino");
		} else {
			System.out.println("F handiagoa da G baino");
		}     
	}
}
