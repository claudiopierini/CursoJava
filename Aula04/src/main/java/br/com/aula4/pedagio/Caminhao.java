package br.com.aula4.pedagio;

public class Caminhao extends Veiculo implements PagaPedagio{

	public Caminhao() {
		super(4);
	}

	public int quantidadeEixo() {
		return super.getQuantidadeEixo();
	}
	
}
