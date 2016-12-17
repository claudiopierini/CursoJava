/**
 * 
 */
package br.com.projeto.aluno;

import java.util.Scanner;

/**
 * @author java03
 *
 */
public class ExercicioArray2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de alunos");
		int qtdAluno = sc.nextInt();
		@SuppressWarnings("unused")
		double media = 0;
		Aluno[] aluno = new Aluno[qtdAluno];

		for (int i = 0; i < aluno.length; i++) {
			aluno[i] = new Aluno();
			System.out.println("Nome: ");
			sc.nextLine();
			aluno[i].nome = sc.nextLine();
			
			for (int j = 0; j < aluno[i].notas.length; j++) {
				aluno[i].notas[j] = sc.nextDouble();
				media = aluno[i].media();
			}
		}
		for (int i = 0; i < aluno.length; i++) {
			System.out.print("Aluno " + aluno[i].nome);
			for (int j = 0; j < aluno[i].notas.length; j++) {
				System.out.print(" " + aluno[i].notas[j]);
			}
			System.out.print(" " + aluno[i].media() );
			System.out.println();
		}
		sc.close();
	}
}
