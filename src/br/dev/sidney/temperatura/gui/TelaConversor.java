package br.dev.sidney.temperatura.gui;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.dev.sidney.temperatura.model.Temperatura;

public class TelaConversor {

	private JTextField textCelsius;
	private JLabel labelCelsius;
	private JButton buttonKelvin;
	private JButton buttonFahrenheit;
	private JLabel labelResultado;
	private JLabel labelMensagemErro;

	public void criarTelaConversor() {
		
		
		//Configuração de Tela: Dimensões e Tamanho
		JFrame tela = new JFrame();
		Dimension tamanho = new Dimension();
		tamanho.setSize(400, 700);
		tela.setSize(tamanho);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Conversor de Temperatura");
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		tela.setResizable(false);
		

	

		
		// Criar um JLabel e um JTextField para o Celsius
		labelCelsius = new JLabel();
		labelCelsius.setText("Temperatura em graus celsius: ");
		labelCelsius.setBounds(50, 40, 150, 30);
		
		textCelsius = new JTextField();
		textCelsius.setHorizontalAlignment(JTextField.RIGHT);
		textCelsius.setBounds(210, 40, 60, 30);
		
		buttonFahrenheit = new JButton();
		buttonFahrenheit.setText("FAHRENHEIT");
		buttonFahrenheit.setBounds(50, 160, 105, 30);

		buttonKelvin = new JButton();
		buttonKelvin.setText("KELVIN");
		buttonKelvin.setBounds(165, 160, 105, 30);
		
		//Elementos da tela
		tela.getContentPane().add(labelCelsius);
		tela.getContentPane().add(textCelsius);
		tela.getContentPane().add(buttonFahrenheit);
		tela.getContentPane().add(buttonKelvin);
		tela.getContentPane().add(labelResultado);
		
		// Tornar a tela vísivel deverá ser a último comando
		tela.setVisible(true);


	}

}
