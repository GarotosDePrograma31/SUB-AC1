package binarySum;

public class BinarySum {
	
	
	public static int Binary(int [] A , int i ,int n) {
		if(n == 1) return A[i];
		return Binary(A,i,(n/2)) + Binary(A,i + (n/2),(n/2));
		
	}

}
