package br.com.projeto.conta.teste;

import org.junit.Assert;

import br.com.projeto.conta.Conta;

public class ContaTest {

	public ContaTest() {
		Conta conta = new Conta(1000);
		
		conta.depositar(100);
		Assert.assertEquals(Double.valueOf(100), Double.valueOf(conta.saldo));
		conta.sacar(100);
		Assert.assertEquals(Double.valueOf(100), Double.valueOf(conta.saldo));
	}

}
