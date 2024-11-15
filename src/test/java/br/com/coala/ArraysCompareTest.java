package br.com.coala;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class ArraysCompareTest {

	@DisplayName("Teste Array")
	@Test
	void testArray() {
		
		
		int[] numbers = {25,8,21,32,3};
		int [] expectedArray = {3,8,21,25,32};
		
		Arrays.sort(numbers);
		
		assertArrayEquals(numbers, expectedArray);
	}
	
	@DisplayName("Teste performace sort")
	@Test
	//@Timeout(1)
	@Timeout(value = 15, unit = TimeUnit.MILLISECONDS)
	void teste() {
		int[] numbers = {25,8,21,32,3};
		
		for(int i = 0; i<100000; i++) {
			numbers[0] = i;
			Arrays.sort(numbers);
		}
		
	}


}
