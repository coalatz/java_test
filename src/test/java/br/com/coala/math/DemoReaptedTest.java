package br.com.coala.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

import br.com.coala.SimpleMath;

class DemoReaptedTest {

	SimpleMath math;
	
		@BeforeEach
		void beforeEachMethod() {
			System.out.println("este metodo esta sendo executado depois de cada teste");
			 math = new SimpleMath(); 
		}
	
	@DisplayName("Divisao por zero")
	@RepeatedTest( value = 3, name = "{displayName}. {currentRepetition} " + "{totalRepetitions}!")
	void testeDivsaoZero( RepetitionInfo repetitionInfo, TestInfo testInfo ) {
		//given
		
		System.out.println("Divisao por zero test " + repetitionInfo.getTotalRepetitions() + testInfo.getTestMethod().get().getName() );
		double primeiroNumero = 6.2D;
		double segundoNumero = 0D;
		
		var mensagemEsperada = "imporssivel dividir por zero";
				
		ArithmeticException atual = assertThrows(ArithmeticException.class, () -> {
			//when
			//then
			math.division(primeiroNumero, segundoNumero);
		}, () -> "Divisao por zero experado ArithmeticException");
		
		assertEquals(mensagemEsperada, atual.getMessage(), () -> "Esperado mensagem de execessao");
		
	}
	

}
