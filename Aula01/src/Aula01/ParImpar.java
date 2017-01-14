/**
 * 
 */
package Aula01;

import java.util.Scanner;

/**
 * @author java03
 *
 */
public class ParImpar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor");
		int valor = sc.nextInt();
		System.out.println((valor % 2 == 0) ? "numero par" : "numero impar");
		sc.close();
	}

}
