/**
 * 
 */
package br.com.projeto.conta;

import java.util.Scanner;

/**
 * @author java03
 *
 */
public class Conta {

	Scanner sc = new Scanner(System.in);
	public double saldo;

	public double depositar(double valor) {
		System.out.println("Deseja depositar qual valor");
		valor = sc.nextDouble();
		return saldo = saldo + valor;
	}

	public double sacar(double valor) {
		System.out.println("Deseja sacar qual valor");
		valor = sc.nextDouble();
		if (saldo < 0) {
			System.out.println("Voce nao tem dinheiro");
			return saldo;
		} else
			return saldo - valor;
	}

	public void verSaldo() {
		System.out.println(saldo);
	}

	
	public Conta(double saldo) {
		this.saldo = saldo;
	}
	
}
