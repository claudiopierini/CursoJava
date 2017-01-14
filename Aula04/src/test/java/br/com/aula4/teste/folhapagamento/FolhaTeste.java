package br.com.aula4.teste.folhapagamento;

import org.junit.Assert;
import org.junit.Test;

import br.com.aula4.folhapagamento.FolhaPagamento;
import br.com.aula4.folhapagamento.Gerente;
import br.com.aula4.folhapagamento.Secretaria;
import br.com.aula4.folhapagamento.Supervisor;

public class FolhaTeste {
	
	FolhaPagamento folhapagamento = new FolhaPagamento();
	
	@Test
	public void  testaSemFuncionarios() {
		double total = folhapagamento.calcular();
		Assert.assertEquals(Double.valueOf(0), Double.valueOf(total));
	}

	@Test
	public void  testaCalcularFolha() {
		Gerente gerente = new Gerente("gerente", 1000);
		Supervisor supervisor = new Supervisor("supervisor",100 );
		Secretaria secretaria = new Secretaria("secretaria", 50);
		
		double total = folhapagamento.calcular(gerente, supervisor, secretaria);
		double totalesperado = 115 +110+100;
		
		Assert.assertEquals(Double.valueOf(totalesperado),Double.valueOf(total));
	}
	
}
