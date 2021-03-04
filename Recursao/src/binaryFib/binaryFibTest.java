package binaryFib;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class binaryFibTest {

	@Test
	void binaryFibTese() {
		BinaryFib f = new BinaryFib();
		assertEquals(1, f.Fib(1),"Deve ser 1");
		
	}

}
