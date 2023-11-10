package zerrendaTxapelketa;

import java.util.Random;

public class Txapelketa {



	public static void main(String[] args) {

		Random random = new Random();

		long startTime = System.nanoTime();

		int 	zerrendaZenbaki[]= new int [100000];

		//Balio random-ak esleitu gure array-era 
		for (int a = 0; a < zerrendaZenbaki.length; a++) {

			int intrandom = random.nextInt(100000);

			zerrendaZenbaki[a] = intrandom;

		}

		int temporala = 0;
		int luzeera = zerrendaZenbaki.length;

		//Lehen posiziotik azkenera

		for (int i = 0; i < luzeera; i++) {
			
			//Bigarren posiziotik azkenera

			for (int j = i + 1; j < luzeera; j++) {



				//Lehen zenbakia ondorengoa baino handiagoa den konprobatzen dugu

				if (zerrendaZenbaki[i] > zerrendaZenbaki[j]) {

					//Gure lehen zenbakia temporala bihurtzen dugu

					temporala = zerrendaZenbaki[i];

					//Gure lehen zenbakian balore txikiagoa gordetzen dugu

					zerrendaZenbaki[i] = zerrendaZenbaki[j];

					//Azkenik zenbaki handiagoa gure zerrendan sartzen dugu zenbaki txikiagoaren ondoren

					zerrendaZenbaki[j] = temporala;

				}
			}

			//Gure arraya ordenatuta inprimituko du, gure arrayaren luzeera arte( For-ean zehaztu behar noiz arte)

			//System.out.print(zerrendaZenbaki[i]);

		}

		//Gure programak gure array-a ordenatzeko behar duen denbora idazten dugu

		long endtime = System.nanoTime() - startTime;

		System.out.println();
		System.out.println("Denbora :" + (endtime/1e6) + "ms");

	}
}



