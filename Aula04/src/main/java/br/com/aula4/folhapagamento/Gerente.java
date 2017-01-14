/**
 * 
 */
package br.com.aula4.folhapagamento;

/**
 * @author java03
 *
 */
public class Gerente extends Funcionario{

	public Gerente(String nome, double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getPorcentagemAdicional() {
		return 0.15;
	}

}
