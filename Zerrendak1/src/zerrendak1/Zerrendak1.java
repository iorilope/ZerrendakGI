package zerrendak1;

import java.util.Random;


public class Zerrendak1 {

	public static void main(String[] args) {

		Random rand = new Random(); 
		int i ;
		int zerrenda [] = new int [10];

		for ( i = 0; i < zerrenda.length; i++) {

			zerrenda [i] = rand.nextInt(1000);

			System.out.println(zerrenda[i]);


		}








	}

}
