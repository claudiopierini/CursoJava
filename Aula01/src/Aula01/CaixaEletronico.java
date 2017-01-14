/**
 * 
 */
package Aula01;

import java.util.Scanner;

/**
 * @author java03
 *
 */
public class CaixaEletronico {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do saque");
		int valor = sc.nextInt();

		int n100 = valor / 100;
		valor = valor % 100;
		int n50 = valor / 50;
		valor = valor % 50;
		int n20 = valor / 20;
		valor = valor % 20;
		int n10 = valor / 10;
		valor = valor % 10;
		int n5 = valor / 5;
		valor = valor % 5;

		if (valor != 0){
			System.out.println("Impossivel sacar o valor");
		} else {
			
		if (n100 > 0)
			System.out.println("Notas de 100 " + n100);
		if (n50 > 0)
			System.out.println("Notas de 50 " + n50);
		if (n20 > 0)
			System.out.println("Notas de 20 " + n20);
		if (n10 > 0)
			System.out.println("Notas de 10 " + n10);
		if (n5 > 0)
			System.out.println("Notas de 5 " + n5);
		}
		sc.close();
	}
}