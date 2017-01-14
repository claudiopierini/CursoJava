/**
 * 
 */
package Aula01;

import java.util.Scanner;

/**
 * @author java03
 *
 */
public class ExercicioSwitch2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero mes");
		int mes = sc.nextInt();

		switch (mes) {
		case 1:
			System.out.println("Janeiro");
			
		case 2:
			System.out.println("Fevereiro");
			
		case 3:
			System.out.println("Marco");
			
		case 4:
			System.out.println("Abril");
			
		case 5:
			System.out.println("Maio");
			
		case 6:
			System.out.println("Junho");
			
		case 7:
			System.out.println("Julho");
			
		case 8:
			System.out.println("Agosto");
			
		case 9:
			System.out.println("Setembro");
			
		case 10:
			System.out.println("Outubro");
			
		case 11:
			System.out.println("Novembro");
			
		case 12:
			System.out.println("Dezembro");
			break;
		default:
			System.out.println("Mes invalido");
			break;
		}
		sc.close();
	}
}
