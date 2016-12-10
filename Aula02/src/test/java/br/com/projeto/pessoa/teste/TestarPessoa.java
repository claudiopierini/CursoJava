/**
 * 
 */
package br.com.projeto.pessoa.teste;

import java.util.Scanner;

import br.com.projeto.pessoa.Pessoa;

/**
 * @author java03
 *
 */
public class TestarPessoa {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o nome da pessoa");
		String nome = sc.nextLine();
		System.out.println("digite o CPF da pessoa");
		String cpf = sc.nextLine();
		System.out.println("digite o RG da pessoa");
		String rg = sc.nextLine();
		sc.close();
		
		Pessoa pessoa = new Pessoa(nome, cpf, rg);
		System.out.println(pessoa);
	}
}
