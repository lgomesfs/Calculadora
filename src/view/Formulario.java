package view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import business.*;

public class Formulario {
	private JFrame form;
	private JLabel lblVal1;
	private JLabel lblVal2;
	private JLabel lblResul;
	private JTextField txtVal1;
	private JTextField txtVal2;
	private JButton btnSoma;
	private JButton btnSubtracao;
	private JButton btnDivisao;
	private JButton btnVezes;
	Calculo calc = null;

	public Formulario() {
		inicializarComponentes();
	}

	private void inicializarComponentes() {

		form = new JFrame("Calculadora");
		form.setBounds(400, 250, 425, 400);
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		form.setLayout(null);

		Container painelDeConteudo = form.getContentPane();

		lblVal1 = new JLabel("Váriavel 1");
		lblVal1.setBounds(30, 60, 60, 30);
		painelDeConteudo.add(lblVal1);

		lblVal2 = new JLabel("Váriavel 2");
		lblVal2.setBounds(30, 90, 60, 30);
		painelDeConteudo.add(lblVal2);

		lblResul = new JLabel("Resultado:");
		lblResul.setBounds(30, 120, 60, 30);
		painelDeConteudo.add(lblResul);

		txtVal1 = new JTextField();
		txtVal1.setBounds(90, 60, 60, 25);
		painelDeConteudo.add(txtVal1);

		txtVal2 = new JTextField();
		txtVal2.setBounds(90, 90, 60, 25);
		painelDeConteudo.add(txtVal2);

		btnSoma = new JButton("Soma");
		btnSoma.setBounds(60, 150, 300, 30);
		btnSoma.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				float a = Float.parseFloat(txtVal1.getText());
				float b = Float.parseFloat(txtVal2.getText());
				calc = new Adicao(a, b);
				calc.calcular();
				lblResul.setText("Resultado: " + String.valueOf(calc.getResultado()));
			}
		});
		painelDeConteudo.add(btnSoma);

		btnSubtracao = new JButton("Subtracao");
		btnSubtracao.setBounds(60, 180, 300, 30);
		btnSubtracao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				float a = Float.parseFloat(txtVal1.getText());
				float b = Float.parseFloat(txtVal2.getText());
				calc = new Subtracao(a, b);
				calc.calcular();
				lblResul.setText("Resultado: " + String.valueOf(calc.getResultado()));
			}
		});
		painelDeConteudo.add(btnSubtracao);

		btnVezes = new JButton("Multiplicao");
		btnVezes.setBounds(60, 210, 300, 30);
		btnVezes.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				float a = Float.parseFloat(txtVal1.getText());
				float b = Float.parseFloat(txtVal2.getText());
				calc = new Multiplicacao(a, b);
				calc.calcular();
				lblResul.setText("Resultado: " + String.valueOf(calc.getResultado()));
			}
		});
		painelDeConteudo.add(btnVezes);

		btnDivisao = new JButton("Divisao");
		btnDivisao.setBounds(60, 240, 300, 30);
		btnDivisao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				float a = Float.parseFloat(txtVal1.getText());
				float b = Float.parseFloat(txtVal2.getText());
				calc = new Divisao(a, b);
				calc.calcular();
				lblResul.setText("Resultado: " + String.valueOf(calc.getResultado()));
			}
		});
		painelDeConteudo.add(btnDivisao);

		form.setVisible(true);

	}
}
