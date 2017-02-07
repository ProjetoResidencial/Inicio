package com.telas.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroUsuario frame = new TelaCadastroUsuario();
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
	public TelaCadastroUsuario() {
		setFont(new Font("Times New Roman", Font.PLAIN, 12));
		setTitle("Cadastro De Usuario/Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("USU\u00C1RIO:");
		lblUsuario.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblUsuario.setBounds(117, 68, 75, 17);
		contentPane.add(lblUsuario);
		
		textField = new JTextField();
		textField.setBounds(202, 66, 151, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblSenha = new JLabel("SENHA:");
		lblSenha.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblSenha.setBounds(117, 118, 56, 14);
		contentPane.add(lblSenha);
		
		textField_1 = new JTextField();
		textField_1.setBounds(202, 115, 151, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(30, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1.setBounds(172, 227, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Cancelar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setBounds(313, 227, 89, 23);
		contentPane.add(btnNewButton_2);
	}
}
