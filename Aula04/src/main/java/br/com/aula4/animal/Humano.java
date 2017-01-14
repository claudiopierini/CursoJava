/**
 * 
 */
package br.com.aula4.animal;

/**
 * @author java03
 *
 */
public class Humano extends Mamifero implements AnimalInterface{

	@Override
	public void emitirSom() {
		System.out.println("humano");		
	}

	public void examinar() {
		emitirSom();		
	}

}
