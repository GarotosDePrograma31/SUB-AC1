package reverseArray;

public class ReverseArray {
	
	public static void reverso(int[] A , int i, int j){
		if (i < j){
			int tmp = A[i];
			A[i] = A[j];
			A[j] = A[tmp];
			reverso(A, ++i, --j);			
		}		
	}	
}
