package br.com.coala;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestMethodOrder;

//@Order(3)
@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MethodOrderedRandonlyByOrderTest {
	int num = 0;

	@Test
	@Order(3)
	void testA() {
		num ++;
		System.out.println("Teste A");
		System.out.println(num);
	}
	
	@Test
	@Order(2)
	void testB() {
		num ++;
		System.out.println("Teste B");
		System.out.println(num);
	}
	
	@Test
	@Order(1)
	void testC() {
		num ++;
		System.out.println("Teste C");
		System.out.println(num);
	}
	
	@Test
	@Order(4)
	void testD() {
		num ++;
		System.out.println("Teste D");
		System.out.println(num);
	}

}
