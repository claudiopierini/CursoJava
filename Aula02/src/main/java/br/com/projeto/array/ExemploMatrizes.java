package br.com.projeto.array;

public class ExemploMatrizes {
	public static void main(String[] args) {
		int valores[][] = new int[3][3];

		for (int linha = 0; linha < valores.length; linha++) {
			for (int coluna = 0; coluna < valores[linha].length; coluna++) {
				System.out.print("[" + linha + "][" + coluna + "] = ");
				System.out.print(valores[linha][coluna]);
			}
			System.out.println();
		}
	}
}
