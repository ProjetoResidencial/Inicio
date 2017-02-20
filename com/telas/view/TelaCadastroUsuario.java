package com.telas.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class TelaCadastroUsuario extends JFrame {

	public JPanel contentPane;
	public JPasswordField TextoSenha;
	public JTextField TextoLogin;

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

	public void novo() {

		TextoLogin.setText("");
		TextoSenha.setText("");

	}

	public TelaCadastroUsuario() {
		setFont(new Font("Times New Roman", Font.PLAIN, 12));
		setTitle("Cadastro De Usuario/Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 313);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblUsuario = new JLabel("USU\u00C1RIO:");
		lblUsuario.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblUsuario.setBounds(88, 69, 58, 14);
		contentPane.add(lblUsuario);

		TextoLogin = new JTextField();
		TextoLogin.setBounds(160, 66, 124, 20);
		contentPane.add(TextoLogin);
		TextoLogin.setColumns(10);

		JLabel Senha = new JLabel("SENHA:");
		Senha.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Senha.setBounds(88, 113, 62, 14);
		contentPane.add(Senha);

		TextoSenha = new JPasswordField();
		TextoSenha.setBounds(160, 110, 124, 20);
		contentPane.add(TextoSenha);

		JButton BotaoSalvar = new JButton("Salvar");
		BotaoSalvar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		BotaoSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {

					Class.forName("com.mysql.jdbc.Driver");

					Connection conector = DriverManager.getConnection("jdbc:mysql://localhost/login", "root", "");

					Statement stm;

					stm = conector.createStatement();

					stm.executeUpdate("INSERT into tbl_usuario (login, senha) VALUES ('" + TextoLogin.getText() + "','"
							+ TextoSenha.getText() + "')");

				} catch (Exception e1) {
					System.out.println("Erro: " + e1.getMessage());

				}

				JOptionPane.showMessageDialog(null, "Cadastro gravado!");

			}
		});

		BotaoSalvar.setBounds(10, 227, 89, 23);
		contentPane.add(BotaoSalvar);

		JButton BotaoLimpar = new JButton("Limpar");
		BotaoLimpar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		BotaoLimpar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				TextoLogin.setText("");
				TextoSenha.setText("");

			}
		});
		BotaoLimpar.setBounds(221, 227, 103, 23);
		contentPane.add(BotaoLimpar);

		JButton BotaoCancelar = new JButton("Cancelar");
		BotaoCancelar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		BotaoCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				TelaInicialLogin tl = new TelaInicialLogin();
				tl.show();
				tl.setExtendedState(new TelaInicialLogin().MOVE_CURSOR);
				dispose();
			}
		});
		BotaoCancelar.setBounds(334, 227, 109, 23);
		contentPane.add(BotaoCancelar);

		JButton BotaoNovo = new JButton("Novo");
		BotaoNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				novo();
			}
		});
		BotaoNovo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		BotaoNovo.setBounds(109, 227, 102, 23);
		contentPane.add(BotaoNovo);

	}
}
