package br.com.aula4.pedagio;

public class Moto extends Veiculo implements PagaPedagio{

	public Moto() {
		super(2);
	}

	public int quantidadeEixo() {
		return super.getQuantidadeEixo();
	}

}
