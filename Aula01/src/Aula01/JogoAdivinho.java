/**
 * 
 */
package Aula01;

import java.util.Random;
import java.util.Scanner;

/**
 * @author java03
 *
 */
public class JogoAdivinho {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int cont = 0;
		int numero = new Random().nextInt(10) + 1;
		int chute;
		do {
			System.out.println("Digite um numero");
			chute = sc.nextInt();
			if (chute != numero) {
				System.out.println("Chute errado, tente novamente");	
			}
			cont++;
		} while (chute !=  numero);
		System.out.println("Voce acertou em " + cont + "tentativas");
		sc.close();
	}
}
