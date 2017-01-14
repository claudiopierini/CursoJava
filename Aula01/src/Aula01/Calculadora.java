/**
 * 
 */
package Aula01;

import java.util.Scanner;

/**
 * @author java03
 *
 */
public class Calculadora {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro valor");
		int numero1 = sc.nextInt();
		System.out.println("Digite o primeiro valor");
		int numero2 = sc.nextInt();
		double numero3 = (double)numero1;
		double numero4 = (double)numero2;

		System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
		System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
		System.out.println(numero1 + " * " + numero2 + " = " + (numero1 * numero2));
		System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
		System.out.println(numero1 + " % " + numero2 + " = " + (numero1 % numero2));

		System.out.println(numero3 + " + " + numero4 + " = " + (numero3 + numero4));
		System.out.println(numero3 + " - " + numero4 + " = " + (numero3 - numero4));
		System.out.println(numero3 + " * " + numero4 + " = " + (numero3 * numero4));
		System.out.println(numero3 + " / " + numero4 + " = " + (numero3 / numero4));
		System.out.println(numero3 + " % " + numero4 + " = " + (numero3 % numero4));
		sc.close();
	}

}
