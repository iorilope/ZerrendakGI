package debug1;

public class Nagusia {

	public static void main(String[] args) {
	
		int iteration = 0;
		int mystery = 0;
		
		while(iteration < 100) {
			mystery = calculate(iteration, mystery);
			mystery = getNestedResult(iteration, mystery);
			iteration++;
		}
		System.out.println(mystery);
	}
	
	private static int calculate (int iteration, int mystery) {
		mystery += 3*Math.pow(iteration, 2)+ (iteration % 7);
		return mystery;
	}
	
	private static int getNestedResult(int iteration, int mystery) {
		if(mystery < iteration * 10)
			if(iteration > 20)
				if(iteration - mystery > 1000)
					mystery = 0;
				else
					mystery--;
			else
				mystery++;
		else
				mystery*=2;
		return mystery;
	}
	
}