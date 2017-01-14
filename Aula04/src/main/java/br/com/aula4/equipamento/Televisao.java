/**
 * 
 */
package br.com.aula4.equipamento;

/**
 * @author java03
 *
 */
public class Televisao  extends Eletronico{

	private int polegadas;
	
	public Televisao(double preco, String fabricante) {
		super(preco, fabricante);
		
	}

	/**
	 * @return the polegadas
	 */
	public int getPolegadas() {
		return polegadas;
	}

	/**
	 * @param polegadas the polegadas to set
	 */
	public void setPolegadas(int polegadas) {
		this.polegadas = polegadas;
	}
	
}
