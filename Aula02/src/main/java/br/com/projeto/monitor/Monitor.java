/**
 * 
 */
package br.com.projeto.monitor;

/**
 * @author java03
 *
 */
public class Monitor {

	public String numerSerie;
	public String cor;
	public int polegadas;
	public boolean ligado;
	public int brilho;

	public void Ligar() {
		System.out.println("Ligando...");
		ligado = true;
	}

	public void Desligar() {
		System.out.println("Desligando...");
		ligado = false;
	}

	public int aumentarBrilho() {
		if (brilho < 100) {
			brilho++;
		}
		return brilho;
	}

	public int diminuirBrilho() {
		if (brilho > 0) {
			brilho--;			
		}
		return brilho;
	}
	
	public int trocarBrilho(int brilho) {
		this.brilho = brilho;
		return brilho;
	}

	/**
	 * @param numerSerie
	 * @param cor
	 * @param polegadas
	 * @param ligado
	 * @param brilho
	 */
	public Monitor(String numerSerie, String cor, int polegadas,
			boolean ligado, int brilho) {

		this.numerSerie = numerSerie;
		this.cor = cor;
		this.polegadas = polegadas;
		this.ligado = false;
		this.brilho = 50;
	}

	public Monitor() {
		
	}
	
	
	
}
