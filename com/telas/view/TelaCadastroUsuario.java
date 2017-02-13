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

public class TelaCadastroUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField TextoLogin;
	private JTextField TextoSenha;


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
		lblUsuario.setBounds(71, 68, 75, 17);
		contentPane.add(lblUsuario);

		TextoLogin = new JTextField();
		TextoLogin.setBounds(156, 66, 151, 20);
		contentPane.add(TextoLogin);
		TextoLogin.setColumns(10);

		JLabel lblSenha = new JLabel("SENHA:");
		lblSenha.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblSenha.setBounds(71, 118, 56, 14);
		contentPane.add(lblSenha);

		TextoSenha = new JTextField();
		TextoSenha.setBounds(156, 115, 151, 20);
		contentPane.add(TextoSenha);
		TextoSenha.setColumns(10);

		JButton BotaoSalvar = new JButton("Salvar");
		BotaoSalvar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		BotaoSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {

					Class.forName("com.mysql.jdbc.Driver");

					Connection conector = DriverManager.getConnection("jdbc:mysql://localhost/login", "root", "");

					Statement stm;

					stm = conector.createStatement();

					stm.executeUpdate ("INSERT into tbl_usuario (login, senha) VALUES ('"+TextoLogin.getText()+"' , '"+TextoSenha.getText()+"')");

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

				// tf_nome.setText(null);

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
