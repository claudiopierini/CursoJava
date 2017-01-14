/**
 * 
 */
package br.com.aula4.animal;

/**
 * @author java03
 *
 */
public class Baleia extends Mamifero implements AnimalInterface {

	@Override
	public void emitirSom() {
		System.out.println("baleia");
	}

	public void examinar() {
		emitirSom();
	}

}
