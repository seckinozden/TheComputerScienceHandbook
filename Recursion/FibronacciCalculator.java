public class FibronacciCalculator {

	public static void main(String[] args) {

		/* TODO 
			- implement "reading input from command line"
			- implement test cases
			- implement logging
			- how to scale performance of this code	 
		*/
		System.out.println("Result = " + fibronacciValue(4));
	}

	public static int fibronacciValue(int num){
		if(num == 1)
			return 1;
		else
			return num + fibronacciValue(num-1);
	}

}