package zerrendak7;

public class Zerrendak7 {


	public static void main(String[] args) {

		String []	ZerrendaGauzak= {"Kaixo","Ioritz","Patata","Taxia"};

		int kontagailua = 0;

		//Dena minuskulan jarri Ta 2 aldiz ez konprobatzeko

		for(int i=0;i<ZerrendaGauzak.length;i++){


			if(!ZerrendaGauzak[i].equals(ZerrendaGauzak[i].toLowerCase())) {



				ZerrendaGauzak[i] = ZerrendaGauzak[i].toLowerCase();

			}
		}


		//Erakutsi Minuskulaz
		for(int i=0;i<ZerrendaGauzak.length;i++) {

			System.out.println(ZerrendaGauzak[i]);



		}
		for (int i = 0; i < ZerrendaGauzak.length; i++) {

			if (ZerrendaGauzak[i].contains("ta")) {
				kontagailua++;
			} 

		}

		System.out.println();
		System.out.println(kontagailua + " TA daude");




	}

}
