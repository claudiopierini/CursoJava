/**
 * 
 */
package Aula01;

import java.util.Scanner;

/**
 * @author java03
 *
 */
public class VerificaIdadeTernario {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a idade");
		int idade = sc.nextInt();
		System.out.println((idade >= 18) ? "Maior de idade": "Menor de idade" );
		sc.close();
	}

}
