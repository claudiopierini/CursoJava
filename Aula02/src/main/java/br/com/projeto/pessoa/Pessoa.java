/**
 * 
 */
package br.com.projeto.pessoa;

/**
 * @author java03
 *
 */
public class Pessoa {

	public String nome;
	public String CPF;
	public String RG;
	/**
	 * @param nome
	 * @param cPF
	 * @param rG
	 */
	public Pessoa(String nome, String cpf, String rg) {
		this.nome = nome;
		this.CPF = cpf;
		this.RG = rg;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", CPF=" + CPF + ", RG=" + RG + "]";
	}
}
