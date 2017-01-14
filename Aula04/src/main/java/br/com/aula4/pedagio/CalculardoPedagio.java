package br.com.aula4.pedagio;

public class CalculardoPedagio implements PagaPedagio{
	double preco = 0;
	
	double calcular(){
		return preco;
		
	}

	public int quantidadeEixo() {
		return 0;
	}

	/**
	 * @param preco
	 */
	public CalculardoPedagio(double preco) {
		this.preco = preco;
	}
	
	
}
