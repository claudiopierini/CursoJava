/**
 * 
 */
package br.com.aula4.animal;

/**
 * @author java03
 *
 */
public class AnimalMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AnimalInterface baleia = new Baleia();
		AnimalInterface jacare = new Jacare();
		Humano humano = new Humano();
		Veterinario veterinario = new Veterinario();
		veterinario.examinar(jacare);
		veterinario.examinar(baleia);
		veterinario.examinar(humano);
		veterinario.examinar(veterinario);
	}

}
