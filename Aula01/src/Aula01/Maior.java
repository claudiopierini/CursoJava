/**
 * 
 */
package Aula01;

import java.util.Scanner;

/**
 * @author java03
 *
 */
public class Maior {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro valor");
		int a = sc.nextInt();
		System.out.println("Digite o segundo valor");
		int b = sc.nextInt();
		System.out.println("Digite o terceiro valor");
		int c = sc.nextInt();
		int maior = 0;
		int menor = 0;

		if (a > b) {
			maior = a;
			menor = b;
		} else {
			maior = b;
			menor = a;
		}

		if (c >= maior)
			System.out.println(c + " " + maior + "" + menor);
		else if (c >= menor) {
			System.out.println(maior + " " + c + " " + menor);
		} else
			System.out.println(maior + " " + menor + " " + c);
		sc.close();
	}
}
