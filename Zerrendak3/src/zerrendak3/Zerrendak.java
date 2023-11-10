package zerrendak3;

import java.util.Random;

public class Zerrendak {

	public static void main(String[] args) {


		Random rand = new Random(); 
		int[] zerrenda = new int[10];

		int min = Integer.MAX_VALUE;
		int minposizioa = 0;

		for (int i = 1; i < zerrenda.length; i++) {


			zerrenda[i] = rand.nextInt(100);

			if (zerrenda[i] < min) {

				min = zerrenda[i];




				minposizioa= i + 1;
			}


		}






		System.out.println("Sortutako zenbaki minimoa ondorengoa da: " + min + " zenbakiaren posizioa ondorengoa da: " + minposizioa);








	}

}
