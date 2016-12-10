/**
 * 
 */
package br.com.projeto.lampada;

/**
 * @author java03
 *
 */
public class Lampada {

	public double watts;
	public String fabricante;
	
	public boolean ligar() {
		System.out.println("Ligando");
		return false;		
	}
	
	public void desligar(boolean b) {
		System.out.println("Desligando");
		
	}

	/**
	 * @param watts
	 * @param fabricante
	 */
	public Lampada(double watts, String fabricante) {

		this.watts = watts;
		this.fabricante = fabricante;
	}
}
