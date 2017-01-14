/**
 * 
 */
package br.com.aula4.area;

/**
 * @author java03
 *
 */
public class Circulo implements AreaCalculavel {

	double raio = 0;

	/**
	 * @param raio
	 */
	public Circulo(double raio) {
		this.raio = raio;
	}

	public double getArea() {

		return raio * raio * Math.PI;
	}

}
