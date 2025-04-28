package br.dev.sidney.temperatura.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.dev.sidney.temperatura.model.Temperatura;

public class TelaConversor {
	
	//Torna privado os elementos da tela
	private JTextField textCelsius;
	private JLabel labelCelsius;
	private JButton buttonKelvin;
	private JButton buttonFahrenheit;
	private JLabel labelResultado;
	private JLabel labelMensagemErro;
	
	//Torna privado, defini cor nos padrões RGB, 255 Vermelho, 0 Verde e 0 Azul
	private Color labelsColor = new Color(255, 0, 0);

	public void criarTelaConversor() {
		
		
		//Configuração de Tela: Dimensões e Tamanho
		JFrame tela = new JFrame();
		Dimension tamanho = new Dimension();
		tamanho.setSize(415, 500);
		tela.setSize(tamanho);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Conversor de Temperatura");
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		tela.setResizable(false);
		
//		JLabel.setBounds(20, 320, 200, 100);
//		JLabel.setBounds(20, 440, 200, 100);

	

		
		// Criar um JLabel e um JTextField para o Celsius
		labelCelsius = new JLabel();
		labelCelsius.setText("Temperatura em graus celsius: ");
		labelCelsius.setBounds(20, 20, 200, 50);
		
		textCelsius = new JTextField();
		textCelsius.setHorizontalAlignment(JTextField.RIGHT);
		textCelsius.setBounds(20, 70, 360, 50);
		
		// Criar um JButton para o Fahrenheit e Kelvin
		//Criando um botão e definindo seu tamanho e localização na tela
		buttonFahrenheit = new JButton();
		buttonFahrenheit.setText("FAHRENHEIT");
		buttonFahrenheit.setBounds(20, 150, 175, 100);

		buttonKelvin = new JButton();
		buttonKelvin.setText("KELVIN");
		buttonKelvin.setBounds(200, 150, 175, 100);
		
		// Criar um JLabel para mostrar e exibir possiveis respostas e mensagem de erro
		labelResultado = new JLabel();
		labelResultado.setText("");
		labelResultado.setBounds(20, 260, 360, 50);
		
		labelMensagemErro = new JLabel();
		labelMensagemErro.setText("");
		labelMensagemErro.setBounds(20, 320, 360, 50);
		
		//Elementos da tela
		tela.getContentPane().add(labelCelsius);
		tela.getContentPane().add(textCelsius);
		tela.getContentPane().add(buttonFahrenheit);
		tela.getContentPane().add(buttonKelvin);
		labelMensagemErro.setForeground(labelsColor);

		//Define a ação do botão
		buttonFahrenheit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				//Protege o usuario de possiveis respostas que sejam exceção no programa
				//Executa
				try {
					
					Temperatura temperatura = new Temperatura();
					double fahreinheit = Double.parseDouble(textCelsius.getText());
					temperatura.setCelsius(fahreinheit);
					double temp = temperatura.converterParaFahreinheit();
					labelResultado.setText(temp + "° FAHRENHEIT");
					labelMensagemErro.setText("");
					
				//Caso ocorrer uma exceção o programa deve executar	
				} catch(Exception erro) {
					labelResultado.setText("");
					labelMensagemErro.setText("Ops! Ocorreu um Erro! Insira apenas números. ");
				}
			}

		});
		
		//Define a ação do botão
		buttonKelvin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				

				//Protege o usuario de possiveis respostas que sejam exceção no programa
				//Executa
				try {
					Temperatura temperatura = new Temperatura();
					double kelvin = Double.parseDouble(textCelsius.getText());
					temperatura.setCelsius(kelvin);
					double temp = temperatura.converterParaKelvin();
					labelResultado.setText(temp + " KELVIN");
					labelMensagemErro.setText("");
					
				//Caso ocorrer uma exceção o programa deve executar	
				} catch(Exception erro) {
					labelResultado.setText("");
					labelMensagemErro.setText("Ops! Ocorreu um Erro! Insira apenas números. ");
				}
				
				
			}
		});
		
		
		tela.getContentPane().add(labelResultado);
		tela.getContentPane().add(labelMensagemErro);
		
		// Tornar a tela vísivel deverá ser a último comando
		tela.setVisible(true);


	}

}
