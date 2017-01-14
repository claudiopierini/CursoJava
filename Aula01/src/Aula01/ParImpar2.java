package Aula01;

import java.util.Scanner;

public class ParImpar2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do primeiro jogador");
		String nome = sc.nextLine();
		System.out.println("Digite o nome do segundo jogador");
		String nome1 = sc.nextLine();
		System.out.println("Digite o valor do primeiro jogador");
		int valor = sc.nextInt();
		System.out.println("Digite o valor do segundo jogador");
		int valor1 = sc.nextInt();
		
		System.out.println((valor % 2 == 0 || valor1 % 2 == 0) ? "Par" + nome : "Impar" + nome1);
		sc.close();
	}
}
