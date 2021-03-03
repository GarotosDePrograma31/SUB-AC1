package reverseArray;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import recursiveFactorial.RecursiveFactorial;

class reverseArrayTest {

	@Test
	void recursiveFactorialTeste() {
		ReverseArray rev = new ReverseArray();
		assertEquals([3,2,1], rev.reverso(new int [] {1,2,3} , 0 , 2), "Deve ser [1,2,3]");
		
	}

}
