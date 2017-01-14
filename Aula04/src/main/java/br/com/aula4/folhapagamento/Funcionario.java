/**
 * 
 */
package br.com.aula4.folhapagamento;

/**
 * @author java03
 *
 */
public abstract class Funcionario {

	private String nome;
	private double salario;
	
	public double getSalarioComBonificacao() {
		return getSalario() * (1 + getPorcentagemAdicional());
		} 
	
	abstract double getPorcentagemAdicional();
	
	/**
	 * @param nome
	 * @param salario
	 */
	public Funcionario(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
	
	/**
	 * @return the nome
	 */
	
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}
	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}

	
}
