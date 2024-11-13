package br.com.coala.math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import br.com.coala.SimpleMath;

@DisplayName("Teste classe SimpleMath")
class SimpleMathTestS4 {
	
	SimpleMath math;	
	
	@BeforeEach
	void beforeEachMethod() {
		System.out.println("este metodo esta sendo executado depois de cada teste");
		 math = new SimpleMath(); 
	}

	
	@DisplayName("Teste Divisao")
	@ParameterizedTest
	//@MethodSource("testeDivisaoParametros")
	//@MethodSource()
	/**@CsvSource({
		"6.2D, 2.0D, 3.1D",
		"71D, 14D, 5.07D",
		"18.3D, 3.1D, 5.90D"
		})**/
	@CsvFileSource(resources = "/testDivision.csv")
	void testeDivisaoParametros(double primeiroNumero, double segundoNumero) {
		
		System.out.println("Teste " + primeiroNumero + " / " +  segundoNumero);		
		double expected = math.division(primeiroNumero, segundoNumero); 
		double actual = math.division(primeiroNumero, segundoNumero);
		
		assertEquals(expected, actual, 2D, 
				() -> primeiroNumero + " / " + segundoNumero + " o testDiv() nao produziu " + expected );
		
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"coala, felipe, gay"})
	void testValueSource(String nomes) {
		System.out.println(nomes);
		assertNotNull(nomes);
	}
	
	/**
	public static Stream<Arguments> testeDivisaoParametros() {
		return Stream.of(
				Arguments.of(6.2D, 2.0D, 3.1D),
				Arguments.of(71D, 14D, 5.07D),
				Arguments.of(18.3D, 3.1D, 5.90D)
				
				);
	}
	**/
}
