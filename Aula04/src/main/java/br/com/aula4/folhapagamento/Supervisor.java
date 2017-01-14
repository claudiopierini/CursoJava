package br.com.aula4.folhapagamento;

public class Supervisor extends Funcionario{

	public Supervisor(String nome, double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getPorcentagemAdicional() {

		return 0.10;
	}

}
