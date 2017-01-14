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
public class Media {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc =  new  Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		System.out.println("Digite o nome");
		String nome = sc.nextLine();
		System.out.println("Digite a primeira nota");
		double nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota");
		double nota2 = sc.nextDouble();
		System.out.println("Digite a terceira nota");
		double nota3 = sc.nextDouble();
		System.out.println((nota1 + nota2 + nota3 / 3) >= 7 ? nome + "Aprovado": nome + "Reprovado");
		sc.close();
	}

}
