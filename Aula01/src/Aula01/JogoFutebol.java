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
public class JogoFutebol {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro time");
		String time1 = sc.nextLine();
		System.out.println("Digite o segundo time");
		String time2 = sc.nextLine();
		System.out.println("Digite a quantidade de jogos");
		int n = sc.nextInt();
		
		int marcados = new Random().nextInt(10) + 1;
		int sofridos = new Random().nextInt(10) + 1;
		
		for (int i = 0; i < n; i++) {
			@SuppressWarnings("unused")
			int saldo = marcados - sofridos;
			System.out.println(marcados > sofridos ? time1: time2);
		}
		sc.close();
	}
}