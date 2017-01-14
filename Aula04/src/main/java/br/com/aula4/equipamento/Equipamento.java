/**
 * 
 */
package br.com.aula4.equipamento;

/**
 * @author java03
 *
 */
public class Equipamento {

	private double preco;
	private String fabricante;
	
	public double calcularPrecoFinal(){
		
		return preco;
	}
	
	/**
	 * @return the preco
	 */
	public double getPreco() {
		return preco;
	}
	/**
	 * @param preco the preco to set
	 */
	public void setPreco(double preco) {
		this.preco = preco;
	}
	/**
	 * @return the fabricante
	 */
	public String getFabricante() {
		return fabricante;
	}
	/**
	 * @param fabricante the fabricante to set
	 */
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	/**
	 * @param preco
	 * @param fabricante
	 */
	public Equipamento(double preco, String fabricante) {
		this.preco = preco;
		this.fabricante = fabricante;
	}
	
}
