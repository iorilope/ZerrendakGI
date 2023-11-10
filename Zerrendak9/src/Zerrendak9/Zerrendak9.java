package Zerrendak9;

public class Zerrendak9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int kontagailua = 0;


		int[] zerrendaZenbaki = {1,2,3,2,5,6,7,8,9,10,1,2};

		// (2) i, i++ izan behar da sekuntzia gorakorra egoteko

		for (int i = 1; i < zerrendaZenbaki.length; i++) {

			if ((zerrendaZenbaki[i]) > zerrendaZenbaki[i- 1]) {

				kontagailua++;

				while (i < (zerrendaZenbaki.length-1) && zerrendaZenbaki[i]  > zerrendaZenbaki[i- 1]) {
					i++;

				}

			}

		}
		System.out.println("Sekuentzia gorakor kopurua: " + kontagailua);


	}

}
