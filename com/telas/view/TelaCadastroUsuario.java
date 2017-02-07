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
	private JTextField TextoUsuario;
	private JTextField TextoSenha;

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
		
		TextoUsuario = new JTextField();
		TextoUsuario.setBounds(202, 66, 151, 20);
		contentPane.add(TextoUsuario);
		TextoUsuario.setColumns(10);
		
		JLabel lblSenha = new JLabel("SENHA:");
		lblSenha.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblSenha.setBounds(117, 118, 56, 14);
		contentPane.add(lblSenha);
		
		TextoSenha = new JTextField();
		TextoSenha.setBounds(202, 115, 151, 20);
		contentPane.add(TextoSenha);
		TextoSenha.setColumns(10);
		
		JButton BotaoSalvar = new JButton("Salvar");
		BotaoSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//evento do botao salvar
			}
		});
		BotaoSalvar.setBounds(30, 227, 89, 23);
		contentPane.add(BotaoSalvar);
		
		JButton BotaoLimpar = new JButton("Limpar");
		BotaoLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextoUsuario.setText("");
				TextoSenha.setText("");
				
				
				
					//tf_nome.setText(null);
				
				
			}
		});
		BotaoLimpar.setBounds(172, 227, 89, 23);
		contentPane.add(BotaoLimpar);
		
		JButton BotaoCancelar = new JButton("Cancelar");
		BotaoCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		BotaoCancelar.setBounds(313, 227, 89, 23);
		contentPane.add(BotaoCancelar);
	}
}
