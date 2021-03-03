package linearSum;

public class LinearSum {
	
	
	public static float somaVetor(int []A ,int n) {
		
		if (n == 1) return A[0];		
		
		else return somaVetor(A, n-1) + A[n-1];
		
	
	
		
	}
}
