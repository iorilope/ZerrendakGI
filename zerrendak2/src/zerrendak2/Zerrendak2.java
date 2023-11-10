package zerrendak2;


import java.util.Random;



public class Zerrendak2 {

	public static void main(String[] args) {





		Random rand = new Random(); 
		int[] zerrenda = new int[10];

		int max = zerrenda[0];
		int maxposizioa = 0;

		for (int i = 0; i < zerrenda.length; i++) {
			zerrenda[i] = rand.nextInt(100);
		}


		for ( int i = 1; i < zerrenda.length; i++) {

			if (zerrenda[i] > max) {

				max = zerrenda[i];
				maxposizioa= i + 1;
			}

		}  



		System.out.println("Sortutako zenbaki maximoa ondorengoa da: " + max + " zenbakiaren posizioa ondorengoa da: " + maxposizioa);









	}





}


