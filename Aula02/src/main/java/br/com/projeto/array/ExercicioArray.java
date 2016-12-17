/**
 * 
 */
package br.com.projeto.array;

import java.util.Scanner;

/**
 * @author java03
 *
 */
public class ExercicioArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[3];
		int media = 0;
		for (int i = 0 ; i < array.length; i++) {
			System.out.println("Digite a nota " + i);
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			media += array[i];
		}

		System.out.println("Media = " + media/ array.length);
		sc.close();
	}

}
