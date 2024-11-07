package br.com.coala.math;

import br.com.coala.SimpleMath;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Teste classe SimpleMath")
class SimpleMathTest {

	@Test
	@DisplayName("Teste 6.2 + 2 = 8.2")
	void testSum() {
		SimpleMath math = new SimpleMath();
		
		double primeiroNumero = 6.2D;
		double segundoNumero = 2D;
		Double actual = math.sum(primeiroNumero, segundoNumero);
		double expected = 8.2D;
		
		assertEquals(expected, actual, () -> primeiroNumero + "+" + segundoNumero + "o testSum() nao produziu  " + expected);
		//assertNotNull(actual);
		//assertNotEquals(6.4, actual);
	}
	
	@Test
	@DisplayName("Teste 5 * 5 = 25")
	void testMult() {
		SimpleMath math = new SimpleMath();
		
		double primeiroNumero = 5.0D;
		double segundoNumero = 5.0D;
		
		Double actual = math.multiplication(primeiroNumero, segundoNumero);
		
		double expected = 25.0D;
		
		assertEquals(expected, actual, () -> primeiroNumero + " * " + segundoNumero + " o testMult() nao produziu " + expected );
	}
	
	@Test
	@DisplayName("Teste 2 / 2 = 0")
	void testDiv() {
		
		SimpleMath math = new SimpleMath();
		
		double primeiroNumero = 2.0D;
		double segundoNumero = primeiroNumero;
		double expected = math.division(segundoNumero, segundoNumero);
		double actual = 1.0D;
		
		assertEquals(expected, actual, () -> primeiroNumero + " / " + segundoNumero + " o testDiv() nao produziu " + expected );
		
	}
	
	@Test
	@DisplayName("Teste (10 + 5)/2 = 7.5")
	void testMedia() {
		
		SimpleMath math = new SimpleMath();
		
		double primeiroNumero = 10.0D;
		double segundoNumero = 5.0D;
		double expected = math.mean(primeiroNumero, segundoNumero);
		double actual = 7.5D;
		
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Teste 25r = 5")
	void testRaiz() {
		
		SimpleMath math = new SimpleMath();
		
		double expected = math.squareRoot(25.0D);
		
		double actual = 5.0D;
		
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Teste 10 - 10 = 0")
	void testSub() {
		
		SimpleMath math = new SimpleMath();
		
		double expected = math.subtraction(10.0D, 10.0D);
		
		double actual = 0;
		
		assertEquals(expected, actual);
	}

}
