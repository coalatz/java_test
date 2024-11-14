package br.com.coala;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@Order(2)
@TestMethodOrder(MethodOrderer.MethodName.class)
class MethodOrderedRandonlybyNameTest {

	
	@Test
	void testB() {
		System.out.println("Teste B");
	}
	
	@Test
	void testC() {
		System.out.println("Teste C");
	}
	
	@Test
	void testD() {
		System.out.println("Teste D");
	}

	@Test
	void testA() {
		System.out.println("Teste A");
	}
}
