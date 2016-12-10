package br.com.projeto.monitor.teste;

import org.junit.Assert;
import org.junit.Test;

public class Aula02Test {

	@Test
	public void testarSoma() {
		int a = 10;
		int b = 20;
		int resultado = a + b;
		Assert.assertEquals(30, resultado);
	}

	@Test
	public void testarSubtracao() {
		int a = 10;
		int b = 20;
		@SuppressWarnings("unused")
		int resultado = a - b;
	}
}
