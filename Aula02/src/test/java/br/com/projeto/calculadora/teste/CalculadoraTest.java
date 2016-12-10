package br.com.projeto.calculadora.teste;

import org.junit.Assert;
import org.junit.Test;

import br.com.projeto.calculadora.Calculadora;

public class CalculadoraTest {

	Calculadora calculadora = new Calculadora();
	private double resultado;

	@Test
	public void testarSoma() {
		resultado = calculadora.soma(10, 10);
		Assert.assertEquals(Double.valueOf(20), Double.valueOf(resultado));
	}

	@Test
	public void testarSubtracao() {
		resultado = calculadora.subtracao(20, 10);
		Assert.assertEquals(Double.valueOf(10), Double.valueOf(resultado));
	}

	@Test
	public void testarMultiplicacao() {
		resultado = calculadora.multiplicacao(5, 5);
		Assert.assertEquals(Double.valueOf(25), Double.valueOf(resultado));
	}

	@Test
	public void testarDivisao() {
		resultado = calculadora.divisao(20, 10);
		Assert.assertEquals(Double.valueOf(2), Double.valueOf(resultado));
	}
}
