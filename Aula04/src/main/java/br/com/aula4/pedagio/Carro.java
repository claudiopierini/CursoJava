package br.com.aula4.pedagio;

public class Carro extends Veiculo implements PagaPedagio{

	public Carro() {
		super(2);


	}

	public int quantidadeEixo() {

		return super.getQuantidadeEixo();
	}

}
