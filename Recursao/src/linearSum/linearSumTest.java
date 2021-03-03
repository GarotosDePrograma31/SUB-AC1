package linearSum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class linearSumTest {

	@Test
	void linearTeste() {
		LinearSum lin = new LinearSum();
		assertEquals(4, lin.somaVetor(new int [] {2, 2}, 2), "Deve ser 4!");
		
	}

}
