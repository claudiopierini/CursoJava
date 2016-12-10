/**
 * 
 */
package br.com.projeto.interruptor.teste;

import org.junit.Assert;
import org.junit.Test;

import br.com.projeto.lampada.Interruptor;
import br.com.projeto.lampada.Lampada;

/**
 * @author java03
 *
 */
public class InterruptorTest {

	@Test
	public void testarLigar() {
		Lampada lampada = new Lampada("Philips", 60);
		Interruptor interruptor = new Interruptor(lampada);
		interruptor.apertar();

		Assert.assertTrue(lampada.estaLigada());
	}

	@Test
	public void testarDesligar() {
		Lampada lampada = new Lampada("Philips", 60);
		Interruptor interruptor = new Interruptor(lampada);
		
		interruptor.apertar();
		Assert.assertTrue(lampada.estaLigada());
		
		interruptor.apertar();
		Assert.assertFalse(lampada.estaLigada());
	}
}
