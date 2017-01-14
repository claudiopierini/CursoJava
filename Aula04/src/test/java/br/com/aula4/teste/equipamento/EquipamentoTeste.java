/**
 * 
 */
package br.com.aula4.teste.equipamento;

import org.junit.Assert;
import org.junit.Test;

import br.com.aula4.equipamento.Cadeira;
import br.com.aula4.equipamento.Impressora;
import br.com.aula4.equipamento.Televisao;

/**
 * @author java03
 *
 */
public class EquipamentoTeste {

	@Test
	public void testarImpressora() {
		double preco = 400;
		Impressora impressora = new Impressora(preco, "HP");
		Assert.assertEquals(Double.valueOf(preco), Double.valueOf(impressora.calcularPrecoFinal()));
	}
	
	@Test
	public void testarTelevisao() {
		double preco = 2200;
		Televisao televisao = new Televisao(preco, "Sony");
		Assert.assertEquals(Double.valueOf(preco), Double.valueOf(televisao.calcularPrecoFinal()));
	}
	
	@Test
	public void testarCadeira() {
		double preco = 20;
		Cadeira cadeira = new Cadeira(preco, "Cadeira");
		Assert.assertEquals(Double.valueOf(preco), Double.valueOf(cadeira.calcularPrecoFinal()));
	}
}
