/**
 * 
 */
package br.com.aula04.pessoa;

import java.util.Date;

/**
 * @author java03
 *
 */
public class PessoaFisica extends Pessoa {
	
	
	private String cpf, rg;
	private Date dataNascimento;
	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}
	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	/**
	 * @return the rg
	 */
	public String getRg() {
		return rg;
	}
	/**
	 * @param rg the rg to set
	 */
	public void setRg(String rg) {
		this.rg = rg;
	}
	/**
	 * @return the dataNascimento
	 */
	public Date getDataNascimento() {
		return dataNascimento;
	}
	/**
	 * @param dataNascimento the dataNascimento to set
	 */
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	/**
	 * @param nome
	 * @param cpf
	 * @param rg
	 * @param dataNascimento
	 */
	public PessoaFisica(String nome, String cpf, String rg, Date dataNascimento) {
		super(nome);
		this.cpf = cpf;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
	}

	
}
