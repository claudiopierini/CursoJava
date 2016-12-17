/**
 * 
 */
package br.com.projeto.usuario;

/**
 * @author java03
 *
 */
public class Usuario {

	private String nome;
	private String email;
	private String senha;

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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		if (ValidadorSenha.validar(senha)) {
			this.senha = senha;	
		}
	}

	/**
	 */
	public Usuario() {
		
	}
}
