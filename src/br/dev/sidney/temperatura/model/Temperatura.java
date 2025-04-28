package br.dev.sidney.temperatura.model;

public class Temperatura {
	
	//Torna a celsius privado
	private double celsius;
	
	//Metodos Get e Set para acessar e atribuir valores
	
	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
	
	
	public double converterParaKelvin() {
		
		double kelvin = celsius + 273;
		return kelvin;
		
	}
	
	public double converterParaFahreinheit() {
		
		double fahreinheit = celsius*1.8 + 32;
		return fahreinheit;
		
	}
	

}
