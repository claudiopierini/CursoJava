/**
 * 
 */
package Aula01;

import java.util.Scanner;

/**
 * @author java03
 *
 */
public class ComparaStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro nome");
		String nome1 = sc.nextLine();
		System.out.println("Digite o segundo nome");
		String nome2 = sc.nextLine();
		System.out.println(nome1.equalsIgnoreCase(nome2));
		sc.close();
	}

}
