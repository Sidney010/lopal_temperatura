package br.dev.sidney.temperatura.model;

public class Temperatura {
	
	private double celsius;

	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
	
	public void converterParaKelvin() {
		
		double kelvin = celsius - 273;
		
	}
	
	public void converterParaFahreinheit() {
		
		double fahreinheit = celsius*1.8 + 32;
		
	}
	

}
