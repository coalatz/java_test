package br.com.coala.math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.coala.SimpleMath;

@DisplayName("Teste classe SimpleMath")
class SimpleMathTest {
	
	SimpleMath math;	
	@BeforeAll
	static void setup() {
		System.out.println("este metodo esta sendo executado primeiro");
	}
	@AfterAll
	static void cleanup() {
		System.out.println("este metodo esta sendo executado por ultimo");
	}
	@BeforeEach
	void beforeEachMethod() {
		System.out.println("este metodo esta sendo executado depois de cada teste");
		 math = new SimpleMath(); 
	}
	@AfterEach
	void afterEachMethod() {
		System.out.println("este metodo esta sendo executado antes de cada teste");
	}
	
	
	@Test
	@DisplayName("Teste 6.2 + 2 = 8.2")
	void testSum() {
		
		System.out.println("Teste 6.2 + 2 = 8.2");
		//given
		double primeiroNumero = 6.2D;
		double segundoNumero = 2D;
		double expected = 8.2D;

		
		//when
		Double actual = math.sum(primeiroNumero, segundoNumero);
		
		//then
		assertEquals(expected, actual, () -> primeiroNumero + "+" + segundoNumero + "o testSum() nao produziu  " + expected);
		//assertNotNull(actual);
		//assertNotEquals(6.4, actual);
	}
	
	@Test
	@DisplayName("Teste 5 * 5 = 25")
	void testMult() {
		
		System.out.println("Teste 5 * 5 = 25");
		
		double primeiroNumero = 5.0D;
		double segundoNumero = 5.0D;
		
		Double actual = math.multiplication(primeiroNumero, segundoNumero);
		
		double expected = 25.0D;
		
		assertEquals(expected, actual, () -> primeiroNumero + " * " + segundoNumero + " o testMult() nao produziu " + expected );
	}
	
	@Test
	@DisplayName("Teste 2 / 2 = 0")
	void testDiv() {
		
		System.out.println("Teste 2 / 2 = 0");
				
		double primeiroNumero = 2.0D;
		double segundoNumero = primeiroNumero;
		double expected = math.division(segundoNumero, segundoNumero);
		double actual = 1.0D;
		
		assertEquals(expected, actual, () -> primeiroNumero + " / " + segundoNumero + " o testDiv() nao produziu " + expected );
		
	}
	
	@Test
	@DisplayName("Teste (10 + 5)/2 = 7.5")
	void testMedia() {
		
		System.out.println("Teste (10 + 5)/2 = 7.5");
		
		
		double primeiroNumero = 10.0D;
		double segundoNumero = 5.0D;
		double expected = math.mean(primeiroNumero, segundoNumero);
		double actual = 7.5D;
		
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Teste 25r = 5")
	void testRaiz() {
		
		System.out.println("Teste 25r = 5");
		
		
		double expected = math.squareRoot(25.0D);
		
		double actual = 5.0D;
		
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Teste 10 - 10 = 0")
	void testSub() {
		
		System.out.println("Teste 10 - 10 = 0");
		
		
		double expected = math.subtraction(10.0D, 10.0D);
		
		double actual = 0;
		
		assertEquals(expected, actual);
	}
	
	@DisplayName("Divisao por zero")
	@Test
	void testeDivsaoZero() {
		//given
		double primeiroNumero = 6.2D;
		double segundoNumero = 0D;
		
		var mensagemEsperada = "imporssivel dividir por zero";
				
		ArithmeticException atual = assertThrows(ArithmeticException.class, () -> {
			//when
			//then
			math.division(primeiroNumero, segundoNumero);
		}, () -> "Divisao por zero experado ArithmeticException");
		
		assertEquals(mensagemEsperada, atual.getMessage(), () -> "Experado mensagem de execessao");
		
	}



}
