package zerrendak5;

public class Zerrendak5 {

	public static void main(String[] args) {



		int []	zerrendaZenbaki= {1,2,3,4,5};

		int ZerrendaLuzeera = zerrendaZenbaki.length;

		int zenbakiak = 0;
		double batazbestekoa = 0;


		//		System.out.println(ZerrendaLuzeera);



		for (int a = 0; a < ZerrendaLuzeera; a++) {


			zenbakiak += zerrendaZenbaki[a];


		}

		batazbestekoa= zenbakiak / ZerrendaLuzeera;

		System.out.println(batazbestekoa);




	}

}
