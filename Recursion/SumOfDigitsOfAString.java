public class SumOfDigitsOfAString {

	public static void main(String[] args) {

		/* TODO 
			- implement "reading input from command line"
			- implement test cases
			- implement logging
			- how to scale performance of this code	 
		*/
			
		String input = "654321";
		System.out.println("INPUT = " + input);
		System.out.println("RESULT = " + calculateValue(input));
	}

	public static int calculateValue(String str){

		int n = str.length();
		if(n==0)
			return 0;
		else{
			/* TODO
				- Check why there is extra "-1" in the calculation below.
			*/
			int charToNum = (Character.getNumericValue(str.charAt(0)) - Character.getNumericValue(0) - 1 );
			System.out.println(str.charAt(0));
			System.out.println("charToNum: " + charToNum);
     		return calculateValue(str.substring(1, n)) + charToNum;
		}
	}

}