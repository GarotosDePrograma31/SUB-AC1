package binarySum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class binarySumTest {

	@Test
	void BinarySumTeste() {
		BinarySum bin = new BinarySum();
		assertEquals(1, bin.Binary(new int [] {1}, 0, 1), "Deve ser 1");
		
		
	}

}
