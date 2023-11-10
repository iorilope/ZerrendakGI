package zerrendak4;

import java.util.Scanner;


public class Zerrenda4 {


	public static void main(String[] args) {

		int[] zerrenda = {1,2,3,4,5,6,7,8,9,10};

		Scanner sc = new Scanner(System.in);

		System.out.println("Sartu zenbaki bat");
		int zenbakia = sc.nextInt();

		for (int x = 0; x < zerrenda.length; x++) {
			if (zerrenda[x] == zenbakia) {
				System.out.println("Value exists in array!");
			}else{
				System.out.println("Value doesn't exists in array!");
			}
		}







	}

}
