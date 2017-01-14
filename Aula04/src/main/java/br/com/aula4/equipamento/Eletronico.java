package br.com.aula4.equipamento;

public class Eletronico extends Equipamento{

	public Eletronico(double preco, String fabricante) {
		super(preco, fabricante);
		
	}
	/* (non-Javadoc)
	 * @see br.com.aula4.equipamento.Equipamento#calcularPrecoFinal()
	 */
	@Override
	public double calcularPrecoFinal() {
		return super.getPreco() * 1.10 ;
	}
}
