package br.com.projeto.aluno;

public class Aluno {

	String nome;
	double[] notas;

	/**
	 * @param nome
	 * @param notas
	 */
	public Aluno() {
		this.notas = new double[3];
	}

	public double media() {
		double media = 0;

		for (double nota : notas) {
			media += nota;
		}

		return media / notas.length;
	}

}
