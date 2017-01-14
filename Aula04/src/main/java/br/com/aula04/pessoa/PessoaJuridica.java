/**
 * 
 */
package br.com.aula04.pessoa;

/**
 * @author java03
 *
 */
public class PessoaJuridica extends Pessoa{
	private String cnpj,razaoSocial;

	/**
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}

	/**
	 * @param cnpj the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	/**
	 * @return the razaoSocial
	 */
	public String getRazaoSocial() {
		return razaoSocial;
	}

	/**
	 * @param razaoSocial the razaoSocial to set
	 */
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	/**
	 * @param nome
	 * @param cnpj
	 * @param razaoSocial
	 */
	public PessoaJuridica(String nome, String cnpj, String razaoSocial) {
		super(nome);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}
	
	
}
