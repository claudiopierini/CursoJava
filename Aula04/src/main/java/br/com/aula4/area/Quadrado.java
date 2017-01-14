package br.com.aula4.area;

public class Quadrado implements AreaCalculavel{

	double lado = 0;
	
	/**
	 * @param lado
	 */
	public Quadrado(double lado) {
		this.lado = lado;
	}

	public double getArea() {

		return Math.pow(lado,2);
	}

}
