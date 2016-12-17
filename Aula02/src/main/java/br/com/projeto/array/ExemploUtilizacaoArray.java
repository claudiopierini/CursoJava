/**
 * 
 */
package br.com.projeto.array;

/**
 * @author java03
 *
 */
public class ExemploUtilizacaoArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int tamanho = 5;
		int valores[] = new int[tamanho];
		int outrosValores[] = { 1, 2, 3, 4, 5 };
		@SuppressWarnings("unused")
		String nome[] = new String[tamanho];

		System.out.println("Conteudo de valores");
		for (int i = 0; i < tamanho; i++) {
			System.out.println("[" + i + "] = " + valores);
		}
		System.out.println("Conteudo de outrosvalores");
		for (int i = 0; i < tamanho; i++) {
			System.out.println("[" + i + "] = " + outrosValores);
		}
	}
}
