/**
 * 
 */
package errekurtsibitatea1;

/**
 * 
 * @author Ioritz Lopetegi
 */
public class Berredura {

	/**
	 * @param args
	 */
	static int z1;
	static int berreketa = 2;
	
	public static void main(String[] args) {
		
		int berreketa = 1;
		int z1 = 2;
	
	   
	    int erantzuna = berredura(z1, berreketa);
	    System.out.println(erantzuna);
	}
	
	public static int berredura(int z1, int berreketa) {
	    if (z1 == 1) {
	    	  //System.out.println("asd");
	        return berreketa;
	    } else {
	        return berreketa * berredura(z1 - 1, berreketa); 
	    }
	}
	}
	
	
	


