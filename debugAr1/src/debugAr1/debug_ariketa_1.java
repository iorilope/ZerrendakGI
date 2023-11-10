package debugAr1;


// 1- Ematen duen errorea Index out of bounds da, honek esan nahi du Arrayeko luzeera pasatzen dela gure kasuan <= 6 ren erruz gertatzen da kasu honetan <6 izan beharko luke
// 3- I-ren for-a kanpoan dagoenez ez du i = 0 irakurtzen ezta i ++ ere beraz ez du testarray 0 0  balorerik ezarriko, gainera J ren posizioa ere 2. baloretik hasten da eta ez lehen baloretik Gainera i-ren balorea gutzienez beti 1 izango da  i +1 egiten baita 
// j aldagaiak 5 balorea  du, I aldagaiak ordea 0 balorea du, beraz (0 + 1) * j egiterakoan i eta j berdinak izango dira beraz posizio egokian txertatuko du






public class debug_ariketa_1 {

	public static void main(String[] args) {
		int[][] testArray = new int[5][6];

		for (int i = 0; i < 5; i++)
			//breakpoint-a ezarri
			for (int j = 1; j < 6; j++)
				testArray[i][j] = (i + 1) * j;

		printArray(testArray);
	}

	private static void printArray(int[][] array) {
		for (int i = 0; i < array.length; ++i)
			for (int j = 0; j < array[0].length; ++j) {
				System.out.print(array[i][j]);
				if (j < array[0].length - 1)
					System.out.print(", ");
				else
					System.out.print("\n");
			}
	}

}
