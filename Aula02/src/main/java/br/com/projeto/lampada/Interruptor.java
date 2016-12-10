/**
 * 
 */
package br.com.projeto.lampada;

/**
 * @author java03
 *
 */
public class Interruptor {

	Lampada lampada = new Lampada(100, "Philips");
	
	public void apertar() {
		if (lampada.ligar()) {
			lampada.desligar(true);
		} 
	}
}
