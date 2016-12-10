/**
 * 
 */
package br.com.projeto.lampada;

/**
 * @author java03
 *
 */
public class Interruptor {

	public Lampada lampada;

	public Interruptor(Lampada lampada) {
		this.lampada = lampada;
	}

	public void apertar() {
		if (lampada.estaLigada()) {
			lampada.desligar();
		} else {
			lampada.ligar();
		}
	}
}