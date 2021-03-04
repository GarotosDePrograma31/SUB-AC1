package binaryFib;

public class BinaryFib {

	public static int Fib(int k) {
		if(k <= 1) return k;
		return Fib(k-1)+(k-2);
		
	}

}
