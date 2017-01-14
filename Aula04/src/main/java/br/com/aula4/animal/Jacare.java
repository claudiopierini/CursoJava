/**
 * 
 */
package br.com.aula4.animal;

/**
 * @author java03
 *
 */
public class Jacare extends Reptil implements AnimalInterface{

	@Override
	public void emitirSom() {
		System.out.println("jacare");		
	}

	public void examinar() {
		emitirSom();
	}

}
