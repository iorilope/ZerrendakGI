package artzainJokoa;


import java.util.Scanner;

public class Nagusia {


	static Scanner sca = new Scanner(System.in);

	//Jokalari bakoitzaren sinboloak definituko ditugu
	static final char J1 = 'X';
	static final char J2 = 'O';
	static final char HUTSA = '-';

	//Zeinen txanda
	//true = J1, false = J2
	static boolean txanda;

	//Taula definituko dugu 3x3-koa izango da
	static char taula[][];

	public static void main(String[] args) {
		//Elementuak hasieratuko ditugu
		txanda = true;
		taula = new char[3][3];
		hasieratuTaula();

		int errenkada, zutabea;
		boolean egiaztatuPos, zuzen;

		while (!partidaBukatu()) {

			do {

				//Zeinen txanda den erakutsiko dugu
				erakutsiTxanda();

				//Taula bistaratuko dugu
				erakutsiTaula();

				zuzen = false;
				errenkada = eskatuZenb("Errenkada:");
				zutabea = eskatuZenb("Zutabea:");

				//Posizioa egiaztatuko dugu
				egiaztatuPos = egiaztatuPosizioa(errenkada, zutabea);

				//Egiaztatuko dugu posizio hori hutsa dagoela
				if (egiaztatuPos) {

					//Ez badago okupatuta, zuzen egin dugu
					if (!okupatutaDago(errenkada, zutabea)) {
						zuzen = true;
					} else {
						System.out.println("Leku hori beteta dago");
					}
				} else {
					System.out.println("Sartu dituzun datuak ez dira baliozkoak");
				}

				//Zuzena ez den bitartean ez dugu txanda aldatuko eta behin eta berriz sartzeko eskatuko diogu
			} while (!zuzen);

			//Txandaren arabera, X edo O txertatuko dugu
			txertatu(errenkada, zutabea);

			aldatuTxanda();
		}


		//Erakutsi taula
		erakutsiTaula();


		//Txapelduna erakutsi
		txapeldunaErakutsi();

	}

	/*
		 Hasieran definituta dagoen taula hasieratu behar duzu. Hau da, 
		 taulako lauki guztiak HUTSAK (begiratu goran HUTSA-ren definizioa) (- sinboloarekin)
		 egon behar dute
		 Aurrebaldintza: karakterez osatutako 3x3-ko taula bat.
		 Postbaldintza: Taulako lauki guztiak HUTSAk izan behar dute
	 */
	static void hasieratuTaula() {

		for (int i = 0; i < taula.length; i++) {

			for (int j = 0; j < taula.length; j++) {


				taula[i][j] =HUTSA;
			}
		}
	}

	/*
		 Hasieran definituta dagoen taula bistaratu nahi dugu
		 Aurrebaldintza: karakterez osatutako 3x3-ko taula bat.
		 Postbaldintza: Kontsolan taula inprimatuta azaldu behar du
	 */
	static void erakutsiTaula() {

		for (int i = 0; i < taula.length; i++) {

			for (int j = 0; j < taula[i].length; j++) {

				System.out.print(taula[i][j] + " ");
			}

			System.out.println();
		}


	}

	/*
		 Txanda erakusteko azpiprograma egingo dugu
		 Aurrebaldintza: txanda boolearra
		 Postbaldintza: txanda egiazkoa bada, "J1en txanda" inprimituko du,
		 bestela, "J2ren txanda"
	 */
	static void erakutsiTxanda() {

		if (txanda == true) {

			System.out.println("J1 en txanda da");

		}
		else {

			System.out.println("J2ren  txanda da");
		}


		//TODO
	}

	/*
		 Txanda aldatzeko azpiprograma
		 Aurrebaldintza: txanda boolearra
		 Postbaldintza: txanda egiazkoa bada, orain faltsua izan behar du 
		 	eta faltsua bada, orain egiazkoa
	 */
	static void aldatuTxanda() {

		if (txanda == true) {

			txanda = false;

		}
		else {
			txanda = true;

		}
	}

	/*
		 Eskanerretik irakurtzeko azpiprograma. String mezua-k string-a jaso 
		 baino lehen agertu behar duen mezua definitzen du
		 Aurrebaldintza: erabiltzaileak integer zenbaki bat sartu behar du
		 Postbaldintza: programak irakurtzen duen zenbakia itzuliko du
	 */
	static int eskatuZenb(String mezua) {



		System.out.println(mezua);
		int errenkada = sca.nextInt();
		return errenkada;




	}

	/*
		 Errenkada bat eta zutabe bat emanda, posizio horretan sinbolo bat txertatuko du, 
		 txandari dagokion jokalariarena. Hau da, J1en txanda bada, posizio horretan X 
		 bat txertatuko du. J2ren txanda bada, O bat.
		 Aurrebaldintza: Errenkada eta zutabea parametroak integerrak dira.
		 Postbaldintza: txandaren arabera errenkada eta posizio horretan dagokion sinboloa txertatuko du
	 */
	static void txertatu(int errenkada, int zutabea) {

		if (txanda == true) {
			taula[errenkada][zutabea] = J1;

		}
		else {

			taula[errenkada][zutabea] = J2;

		}


	}

	/*
		 Errenkada bat eta zutabe bat emanda, posizio hori existitzen den itzuliko duen programa idatzi.
		 Adibidez, erabiltzaileak errenkada=5 eta zutabea=5 sartzen badu, false itzuli beharko da.
		 Aldiz, errenkada=0 eta zutabea=2, true itzuli beharko da
		 Aurrebaldintza: Errenkada eta zutabea parametroak integerrak dira.
		 Postbaldintza: true itzuli baldin eta sartutako errenkada eta zutabea 
		 0-2 balioen artean dagoen, bestela, false.
	 */
	static boolean egiaztatuPosizioa(int errenkada, int zutabea) {

		if (errenkada < 0 || errenkada > 2 || zutabea < 0 || zutabea >2 ) {

			return false;

		}
		else {

			return true;
		}
	}

	/*
		 Errenkada bat eta zutabe bat emanda, posizio hori hutsa dagoen ala ez 
		 esaten digun programa idatzi
		 Aurrebaldintza: Errenkada eta zutabea parametroak integerrak dira.
		 Postbaldintza: hutsa badago, false itzuli beharko du eta beteta badago true 
		 0-2 balioen artean dagoen, bestela, false.
	 */
	static boolean okupatutaDago(int errenkada, int zutabea) {

		if (taula[errenkada][zutabea] == HUTSA) {

			return false;

		}
		else {

			return true;
		}




	}

	/*
		 Taula guztia beteta dagoen ala ez esaten digun programa idatzi
		 Aurrebaldintza: -
		 Postbaldintza: taula beteta badago, true itzuliko du. 
		 	Aldiz, lauikiren bat HUTSA badago, false itzuliko du.
	 */
	static boolean denaBeteta() {

		for (int i = 0; i < taula.length; i++) {

			for (int j = 0; j < taula[i].length; j++) {

				if (taula[i][j] == HUTSA) {

					return false;

				}

			}


		}

		return true;

	}

	/*
		 Errenkada batean 3 sinbolo berdin dauden egiaztatzen duen programa idatzi
		 Aurrebaldintza: -
		 Postbaldintza: errenkaren batean 3 sinbolo berdin badaude sinbolo hori 
		 	itzuliko du, bestela HUTSA itzuliko du
	 */
	static char batEtorriErrenkadan() {



		char karakterea = HUTSA;


		for (int i = 0; i < taula.length; i++) {

			for (int j = 0; j < taula[i].length - 2; j++) {

				if (taula[i][j] == taula[i][j + 1] && taula[i][j] == taula[i][j + 2]) {

					karakterea = taula[i][j];
					return karakterea;
				}

			}

		}
		return HUTSA;
	}






	/*
		 Zutabe batean 3 sinbolo berdin dauden egiaztatzen duen programa idatzi
		 Aurrebaldintza: -
		 Postbaldintza: zutaberen batean 3 sinbolo berdin badaude sinbolo hori 
		 	itzuliko du, bestela HUTSA itzuliko du
	 */
	static char batEtorriZutabean() {
		char karakterea = HUTSA;


		for (int j = 0; j < taula.length; j++) {



			if (taula[0][j] == taula[1][j] && taula[0][j] == taula[2][j]) {


				karakterea = taula[0][j];

				return karakterea;
			}
		}

		return HUTSA;
	}


	/*
		 Diagonal batean 3 sinbolo berdin dauden egiaztatzen duen programa idatzi
		 Aurrebaldintza: -
		 Postbaldintza: diagonalen batean 3 sinbolo berdin badaude sinbolo hori 
		 	itzuliko du, bestela HUTSA itzuliko du
	 */
	static char batEtorriDiagonalean() {


		char karakterea = HUTSA;






		if (taula[0][0] == taula[1][1 ] && taula[0][0] == taula[2][2] || taula[0][2] == taula[1][1] &&  taula[2][0] == taula[1][1]) {

			karakterea = taula[1][1];
			return karakterea;
		}
		return HUTSA;




	}



	/*
		 Partida bukatuta dagoen ala ez esaten digun programa idatzi.
		 Partida bukatuta egongo da taula osoa beteta badago edota 
		 3 sinbolo errenkadan, zutabean edo diagonalean aurkitu diren
		 Aurrebaldintza: -
		 Postbaldintza: partida bukatuta badago, true itzuliko du, bestela false
	 */
	static boolean partidaBukatu() {

		if (batEtorriErrenkadan() == 'X'|| batEtorriZutabean() == 'X' || batEtorriDiagonalean() == 'X' || denaBeteta() == true ||
				batEtorriErrenkadan() == 'O'|| batEtorriZutabean() == 'O' || batEtorriDiagonalean() == 'O') {

			return true;

		}
		else {
			return false;
		}



		//TODO
	}

	/*
		 Txapelduna kontsolan idazten duen programa idatzi. Ez badago txapeldunik berdinketa izango da
		 Aurrebaldintza: -
		 Postbaldintza: J1-ek irabazten badu,"Txapelduna X da" idatziko du, J2-k irabazten badu, 
		 	"Txapelduna O da" idatziko du. Berdinketa badago, "Berdinketa idatziko du"
	 */
	static void txapeldunaErakutsi() {

		char irabazlea = batEtorriErrenkadan();
		if (irabazlea != HUTSA) {
			System.out.println("Irabazlea " + irabazlea + " !");
			return;
		}

		irabazlea = batEtorriZutabean();
		if (irabazlea != HUTSA) {
			System.out.println("Irabazlea " + irabazlea + " !");
			return;
		}

		irabazlea = batEtorriDiagonalean();
		if (irabazlea != HUTSA) {
			System.out.println("Irabazlea " + irabazlea + " !");
			return;
		}

		else {
			System.out.println("Berdinketa!");
		}

	}

}


