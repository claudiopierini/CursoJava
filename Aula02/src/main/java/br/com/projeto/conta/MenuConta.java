package br.com.projeto.conta;

import java.util.Scanner;

public class MenuConta {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int opcao = mostrarMenu(scanner);
		
		switch (opcao) {
		case 1:
			System.out.println("Ler valor do saque e sacar");
			
			break;
		case 2:
			System.out.println("Ler valor do deposito e depositar");
			break;
		case 3:
			System.out.println("Mostrar saldo");
			break;
		case 4:
			System.out.println("Sair");
			break;
		default:
			System.out.println("Opcao invalida!");
			break;
		}
		scanner.close();
	}

	private static int mostrarMenu(Scanner scanner) {
		System.out.println("1. Sacar");
		System.out.println("2. Depositar");
		System.out.println("3. Ver saldo");
		System.out.println("4. Sair");
		return scanner.nextInt();
	}
	
}