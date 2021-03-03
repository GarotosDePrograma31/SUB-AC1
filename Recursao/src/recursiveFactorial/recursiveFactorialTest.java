package recursiveFactorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class recursiveFactorialTest {

	@Test
	void recursiveFactorialTeste() {
		RecursiveFactorial rec = new RecursiveFactorial();
		assertEquals(6.0, rec.reverso(3), "Deve ser 6!");
		
	}

}
