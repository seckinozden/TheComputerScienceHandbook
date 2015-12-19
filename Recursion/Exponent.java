public class Exponent {

	public static void main(String[] args) {

		int base = 2;
		int force = 4;

		System.out.println("RESULT = " + exponent(base, force));
	}

	public static int exponent(int b, int n){

		if(n==0) return 1;
		if(n % 2 == 0 ) return exponent(b,n/2) * exponent(b,n/2);
		else return exponent(b,n/2) * exponent(b,n/2) * b;

	}
}