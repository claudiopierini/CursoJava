/**
 * 
 */
package Aula01;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author java03
 *
 */
public class Media2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		System.out.println("Digite o nome");
		String nome = sc.nextLine();
		System.out.println("Digite a primeira nota");
		double nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota");
		double nota2 = sc.nextDouble();
		System.out.println("Digite a terceira nota");
		double nota3 = sc.nextDouble();
		
		if ((nota1 + nota2 + nota3 / 3) >= 7) {
			System.out.println(nome + "Aprovado");
		} else if ((nota1 + nota2 + nota3 / 3) >= 4) {
			System.out.println(nome + "Exame");
		} else
			System.out.println(nome + "Reprovado");
		sc.close();
	}

}
