package br.com.aula4.area;

public class Retangulo implements AreaCalculavel {

	double largura = 0;
	double altura = 0;
	
	
	/**
	 * @param largura
	 * @param altura
	 */
	public Retangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}


	public double getArea() {
		
		return largura * altura;
	}
}
