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
	private JPasswordField txtSenha;
	private JTextField txtLogin;

	/**
	 * Launch the application.
	 */
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

		JLabel lblNewLabel = new JLabel("Login:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(104, 82, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Senha:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(104, 113, 46, 14);
		contentPane.add(lblNewLabel_1);

		txtSenha = new JPasswordField();
		txtSenha.setBounds(160, 110, 124, 20);
		contentPane.add(txtSenha);

		JButton BotaoAcessar = new JButton("Acessar");
		BotaoAcessar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		BotaoAcessar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// se acesso for true, abre janela
				Acesso cl = new Acesso();
				
				cl.Acesso(txtLogin.getText(), txtSenha.getText());
				
				if (cl.acesso == true) {
					TelaInicialCadastroPessoa tl = new TelaInicialCadastroPessoa();
					tl.show();
					tl.setExtendedState(new TelaInicialCadastroPessoa().MAXIMIZED_BOTH);
					dispose();
				}
				// se acesso for false, simpa os campos e retorna no
				// inicio.(requestfocus)
				if (cl.acesso == false) {
					txtLogin.setText("");
					txtSenha.setText("");
					txtLogin.requestFocus();
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
		
		txtLogin = new JTextField();
		txtLogin.setBounds(160, 79, 124, 20);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel lblSejaBemVindo = new JLabel("Seja Bem Vindo!");
		lblSejaBemVindo.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblSejaBemVindo.setBounds(154, 11, 170, 20);
		contentPane.add(lblSejaBemVindo);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(313, 209, 100, 23);
		contentPane.add(btnNewButton);
	}
}
