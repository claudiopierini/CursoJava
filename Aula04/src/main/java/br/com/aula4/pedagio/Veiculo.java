/**
 * 
 */
package br.com.aula4.pedagio;

/**
 * @author java03
 *
 */
public abstract class Veiculo {
 int quantidadeEixo;

/**
 * @return the quantidadeEixo
 */
public int getQuantidadeEixo() {
	return quantidadeEixo;
}

/**
 * @param quantidadeEixo the quantidadeEixo to set
 */
public void setQuantidadeEixo(int quantidadeEixo) {
	this.quantidadeEixo = quantidadeEixo;
}

/**
 * @param quantidadeEixo
 */
public Veiculo(int quantidadeEixo) {
	this.quantidadeEixo = quantidadeEixo;
}
 
 
}
