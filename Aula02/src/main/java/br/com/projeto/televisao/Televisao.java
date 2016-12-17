package br.com.projeto.televisao;

public class Televisao {

	public String marca;
	public String modelo;
	public int tela;

	public void ligar() {
		System.out.println("Ligar");
	}

	public void desligar() {
		System.out.println("Desligar");
	}

	public void aumentarVolume() {
		System.out.println("Aumentar Volume");
	}

	public void diminuirVolume() {
		System.out.println("Diminuir Volume");
	}

	public void aumentarCanal() {
		System.out.println("Aumentar Canal");
	}

	public void diminuirCanal() {
		System.out.println("Diminuir Canal");
	}

	protected void ajustarVoltagem() {
		System.out.println("Ajustar Voltagem");
	}

	protected void ligarTela() {
		System.out.println("Ligar Tela");
	}

	protected void regularDiodos() {
		System.out.println("Regular Diodos");
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca
	 *            the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo
	 *            the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the tela
	 */
	public int getTela() {
		return tela;
	}

	/**
	 * @param tela
	 *            the tela to set
	 */
	public void setTela(int tela) {
		this.tela = tela;
	}

	/**
	 * @param marca
	 * @param modelo
	 * @param tela
	 */
	public Televisao(String marca, String modelo, int tela) {
		this.marca = marca;
		this.modelo = modelo;
		this.tela = tela;
	}

	/**
	 * 
	 */
	public Televisao() {
	}

}
