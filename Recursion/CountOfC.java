public class CountOfC {

	public static void main(String[] args) {

		String input = "abccccbdbdbsabdcbcbccccccc";

		System.out.println("RESULT = " + countC(input));
	}

	public static int countC(String str){
		
		int n = str.length();
		if(n == 0)
			return 0;
		else{
			if(str.charAt(0)=='c')
				return 1 + countC(str.substring(1, n));
			else 
				return countC(str.substring(1, n));
		}
	}
}