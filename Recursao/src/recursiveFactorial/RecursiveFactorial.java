package recursiveFactorial;

public class RecursiveFactorial {

	public static int reverso(int n){
		
		if(n == 0) return 1;
		else return n * reverso(n - 1);		

	}
	

}
