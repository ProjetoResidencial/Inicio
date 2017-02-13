package com.telas.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.banco.dao.Acesso;

import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;

public class TelaInicialLogin extends JFrame {

	private JPanel contentPane;
	private JPasswordField TextoSenha;
	private JTextField TextoLogin;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicialLogin frame = new TelaInicialLogin();
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
	public TelaInicialLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel Login = new JLabel("Login:");
		Login.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Login.setBounds(104, 82, 46, 14);
		contentPane.add(Login);

		JLabel Senha = new JLabel("Senha:");
		Senha.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Senha.setBounds(104, 113, 46, 14);
		contentPane.add(Senha);

		TextoSenha = new JPasswordField();
		TextoSenha.setBounds(160, 110, 124, 20);
		contentPane.add(TextoSenha);

		JButton BotaoAcessar = new JButton("Acessar");
		BotaoAcessar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		BotaoAcessar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// se acesso for true, abre janela
				Acesso cl = new Acesso();
				
				cl.Acesso(TextoLogin.getText(), TextoSenha.getText());
				
				// se o acesso for verdadeiro, abre a tela de cadastro de pessoa
				if (cl.acesso == true) {
					TelaInicialMenuGeral tl = new TelaInicialMenuGeral();
					tl.show();
					tl.setExtendedState(new TelaInicialMenuGeral().MOVE_CURSOR);
					dispose();
				}
				// se acesso for false, simpa os campos e retorna no
				// inicio.(requestfocus)
				if (cl.acesso == false) {
					TextoLogin.setText("");
					TextoSenha.setText("");
					TextoLogin.requestFocus();
				}

				cl.acesso = false;

			}
		});
		BotaoAcessar.setBounds(54, 209, 89, 23);
		contentPane.add(BotaoAcessar);

		JButton BotaoCancelar = new JButton("Cancelar");
		BotaoCancelar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		BotaoCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// quando clica em cancelar, fecha tela
				System.exit(0);

			}
		});
		BotaoCancelar.setBounds(184, 209, 100, 23);
		contentPane.add(BotaoCancelar);
		
		TextoLogin = new JTextField();
		TextoLogin.setBounds(160, 79, 124, 20);
		contentPane.add(TextoLogin);
		TextoLogin.setColumns(10);
		
		JLabel TituSejaBemVindo = new JLabel("Seja Bem Vindo!");
		TituSejaBemVindo.setFont(new Font("Times New Roman", Font.BOLD, 19));
		TituSejaBemVindo.setBounds(154, 11, 170, 20);
		contentPane.add(TituSejaBemVindo);
		
		JButton BotaoCadastrar = new JButton("Cadastrar");
		BotaoCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastroUsuario tl = new TelaCadastroUsuario();
				tl.show();
				tl.setExtendedState(new TelaCadastroUsuario().MOVE_CURSOR);
				dispose();
				
			}
		});
		BotaoCadastrar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		BotaoCadastrar.setBounds(313, 209, 100, 23);
		contentPane.add(BotaoCadastrar);
	}
}
