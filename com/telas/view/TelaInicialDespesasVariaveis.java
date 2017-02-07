package com.telas.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;

public class TelaInicialDespesasVariaveis extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicialDespesasVariaveis frame = new TelaInicialDespesasVariaveis();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaInicialDespesasVariaveis() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMsDeReferncia = new JLabel("M\u00EAs De Refer\u00EAncia:");
		lblMsDeReferncia.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblMsDeReferncia.setBounds(241, 58, 126, 14);
		contentPane.add(lblMsDeReferncia);
		
		textField = new JTextField();
		textField.setBounds(377, 56, 126, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblManuteno = new JLabel("Valor Manuten\u00E7\u00E3o:");
		lblManuteno.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblManuteno.setBounds(10, 58, 116, 14);
		contentPane.add(lblManuteno);
		
		textField_1 = new JTextField();
		textField_1.setBounds(136, 56, 70, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblObservao = new JLabel("Observa\u00E7\u00F5es:");
		lblObservao.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblObservao.setBounds(10, 83, 91, 14);
		contentPane.add(lblObservao);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 108, 528, 95);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Valor Alimenta\u00E7\u00E3o:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 214, 116, 14);
		contentPane.add(lblNewLabel);
		
		textField_4 = new JTextField();
		textField_4.setBounds(10, 264, 528, 100);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblObservaes = new JLabel("Observa\u00E7\u00F5es:");
		lblObservaes.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblObservaes.setBounds(10, 239, 106, 14);
		contentPane.add(lblObservaes);
		
		textField_6 = new JTextField();
		textField_6.setBounds(136, 212, 70, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSalvar.setBounds(37, 375, 89, 23);
		contentPane.add(btnSalvar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLimpar.setBounds(213, 375, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnCancelar.setBounds(377, 376, 110, 23);
		contentPane.add(btnCancelar);
		
		JLabel lblValoresDeDespesas = new JLabel("Valores De Despesas Variaveis No M\u00EAs.");
		lblValoresDeDespesas.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblValoresDeDespesas.setBounds(118, 11, 317, 27);
		contentPane.add(lblValoresDeDespesas);
	}
}
