package zerrendak8;

import java.util.Scanner;

public class Zerrendak8 {

	public static void main(String[] args) {



		String []	zerrendaHitza= {"Kaixo"};

		for(int i=0;i<zerrendaHitza.length;i++){


			if(!zerrendaHitza[i].equals(zerrendaHitza[i].toLowerCase())) {



				zerrendaHitza[i] = zerrendaHitza[i].toLowerCase();

			}
		}

		int kontagailua = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Zein karaktere sekuentzia konprobatu nahi duzu?");
		String sekuentzia = sc.next();


		for (int i = 0; i < zerrendaHitza.length; i++) {

			if (zerrendaHitza[i].contains(sekuentzia)) {

				System.out.println("Sekuentzian dago");



			} 


			else {

				System.out.println("Sekuentzian ez dago");
			}

		}









	}

}
