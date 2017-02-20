package com.telas.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class TelaInicialCadastroPessoa extends JFrame {

	private JPanel contentPane;
	private JLabel Nome;
	private JTextField TextoNome;
	private JLabel EstadoCivil;
	private JTextField TextoEstadoCivil;
	private JLabel DataNascimento;
	private JTextField TextoDataNasc;
	private JLabel Rg;
	private JTextField TextoRg;
	private JLabel Cpf;
	private JTextField TextoCpf;
	private JLabel Idade;
	private JTextField TextoIdade;
	private JLabel Cidade;
	private JTextField TextoCidade;
	private JLabel Endereco;
	private JTextField TextoEndereco;
	private JLabel Numero;
	private JTextField TextoNumero;
	private JLabel Uf;
	private JTextField TextoUf;

	private JLabel TituloCadastroDePessoa;
	private JLabel lblNewLabel;
	private JLabel lblSexo;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblDataDoCadastro;
	private JTextField TextoDataDoCadastro;
	


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicialCadastroPessoa frame = new TelaInicialCadastroPessoa();
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

		);

	}

	public void novo() {

		// este metodo seta tudo em branco, será chamando no botao novo

		TextoIdade.setText("");
		TextoCpf.setText("");
		TextoRg.setText("");
		TextoDataNasc.setText("");
		TextoNumero.setText("");
		TextoEndereco.setText("");
		TextoCidade.setText("");
		TextoEstadoCivil.setText("");
		TextoNome.setText("");
		TextoUf.setText("");
	}

	public TelaInicialCadastroPessoa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 908, 617);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel Nome = new JLabel("Nome:");
		Nome.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Nome.setBounds(24, 75, 39, 18);
		contentPane.add(Nome);

		TextoNome = new JTextField();
		TextoNome.setBounds(124, 75, 451, 20);
		contentPane.add(TextoNome);
		TextoNome.setColumns(10);

		JLabel Estadocivil = new JLabel("Estado Civil:");
		Estadocivil.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Estadocivil.setBounds(24, 245, 73, 18);
		contentPane.add(Estadocivil);

		TextoEstadoCivil = new JTextField();
		TextoEstadoCivil.setBounds(124, 245, 451, 20);
		contentPane.add(TextoEstadoCivil);
		TextoEstadoCivil.setColumns(10);

		JLabel Cidade = new JLabel("Cidade:");
		Cidade.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Cidade.setBounds(24, 196, 44, 18);
		contentPane.add(Cidade);

		TextoCidade = new JTextField();
		TextoCidade.setBounds(124, 196, 451, 20);
		contentPane.add(TextoCidade);
		TextoCidade.setColumns(10);

		JLabel Endereo = new JLabel("Endere\u00E7o:");
		Endereo.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Endereo.setBounds(21, 140, 59, 18);
		contentPane.add(Endereo);

		TextoEndereco = new JTextField();
		TextoEndereco.setBounds(124, 140, 451, 20);
		contentPane.add(TextoEndereco);
		TextoEndereco.setColumns(10);

		JLabel N = new JLabel("N\u00BA:");
		N.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		N.setBounds(609, 142, 37, 14);
		contentPane.add(N);

		TextoNumero = new JTextField();
		TextoNumero.setBounds(656, 140, 46, 20);
		contentPane.add(TextoNumero);
		TextoNumero.setColumns(10);

		Rg = new JLabel("Rg:");
		Rg.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Rg.setBounds(24, 302, 20, 18);
		contentPane.add(Rg);

		TextoRg = new JTextField();
		TextoRg.setBounds(124, 302, 172, 20);
		contentPane.add(TextoRg);
		TextoRg.setColumns(10);

		Cpf = new JLabel("Cpf:");
		Cpf.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Cpf.setBounds(357, 304, 55, 14);
		contentPane.add(Cpf);

		TextoCpf = new JTextField();
		TextoCpf.setBounds(403, 302, 216, 20);
		contentPane.add(TextoCpf);
		TextoCpf.setColumns(10);

		Idade = new JLabel("Idade:");
		Idade.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Idade.setBounds(32, 363, 36, 18);
		contentPane.add(Idade);

		TextoIdade = new JTextField();
		TextoIdade.setBounds(126, 363, 86, 20);
		contentPane.add(TextoIdade);
		TextoIdade.setColumns(10);

		DataNascimento = new JLabel("Data Nasc.");
		DataNascimento.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		DataNascimento.setBounds(24, 407, 73, 18);
		contentPane.add(DataNascimento);

		TextoDataNasc = new JTextField();
		TextoDataNasc.setBounds(123, 407, 188, 20);
		contentPane.add(TextoDataNasc);
		TextoDataNasc.setColumns(10);

		JButton BotaoSalvar = new JButton("Salvar");
		BotaoSalvar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				

				try {

					Class.forName("com.mysql.jdbc.Driver");

					Connection conector = DriverManager.getConnection("jdbc:mysql://localhost/login", "root", "");

					Statement stm;

					stm = conector.createStatement();

					stm.executeUpdate(
							"INSERT into cadastro_pessoa (nome, endereco, numero, cidade, estado_civil, rg, cpf, idade, data_nascimento, uf) VALUES ('"
									+ TextoNome.getText() + "','" + TextoEndereco.getText() + "','"
									+ TextoNumero.getText() + "','" + TextoCidade.getText() + "','"
									+ TextoEstadoCivil.getText() + "','" + TextoRg.getText() + "','"
									+ TextoCpf.getText() + "','" + TextoIdade.getText() + "','"
									+ TextoDataNasc.getText() + "','" + TextoUf.getText() + "')");

				} catch (Exception e1) {
					System.out.println("Erro: " + e1.getMessage());

				}

				JOptionPane.showMessageDialog(null, "Cadastro gravado!");

			}
		});

		TituloCadastroDePessoa = new JLabel("Cadastro De Pessoa");
		TituloCadastroDePessoa.setFont(new Font("Times New Roman", Font.BOLD, 31));
		TituloCadastroDePessoa.setBounds(227, 11, 340, 30);
		contentPane.add(TituloCadastroDePessoa);
		

		BotaoSalvar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		BotaoSalvar.setBounds(51, 545, 188, 23);
		contentPane.add(BotaoSalvar);

		JButton BotaoLimpar = new JButton("Limpar");
		BotaoLimpar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				TextoIdade.setText("");
				TextoCpf.setText("");
				TextoRg.setText("");
				TextoDataNasc.setText("");
				TextoNumero.setText("");
				TextoEndereco.setText("");
				TextoCidade.setText("");
				TextoEstadoCivil.setText("");
				TextoNome.setText("");
				TextoUf.setText("");
				TextoDataDoCadastro.setText("");
			}
		});

		JLabel Uf = new JLabel("Uf:");
		Uf.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Uf.setBounds(609, 198, 37, 14);
		contentPane.add(Uf);

		TextoUf = new JTextField();
		TextoUf.setBounds(656, 196, 86, 20);
		contentPane.add(TextoUf);
		TextoUf.setColumns(10);
		BotaoLimpar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		BotaoLimpar.setBounds(469, 545, 188, 23);
		contentPane.add(BotaoLimpar);

		JButton BotaoCancelar = new JButton("Cancelar");
		BotaoCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				TelaInicialMenuGeral tl = new TelaInicialMenuGeral();
				tl.show();
				tl.setExtendedState(new TelaInicialMenuGeral().MOVE_CURSOR);
				dispose();

			}
		});
		BotaoCancelar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		BotaoCancelar.setBounds(678, 545, 188, 23);
		contentPane.add(BotaoCancelar);

		JButton BotaoNovo = new JButton("Novo");
		BotaoNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// chamando metodo que seta campos em branco
				novo();

			}
		});
		BotaoNovo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		BotaoNovo.setBounds(253, 545, 188, 23);
		contentPane.add(BotaoNovo);
		
		lblNewLabel = new JLabel(" Ex: Ano-Mes-Dia");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel.setBounds(338, 409, 124, 14);
		contentPane.add(lblNewLabel);
		
		lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblSexo.setBounds(41, 464, 46, 14);
		contentPane.add(lblSexo);
		
		rdbtnNewRadioButton = new JRadioButton("Masculino");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		rdbtnNewRadioButton.setBounds(126, 460, 86, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("Feminino");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		rdbtnNewRadioButton_1.setBounds(227, 460, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		lblDataDoCadastro = new JLabel("Data Do Cadastro");
		lblDataDoCadastro.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblDataDoCadastro.setBounds(719, 437, 109, 14);
		contentPane.add(lblDataDoCadastro);
		
		TextoDataDoCadastro = new JTextField();
		TextoDataDoCadastro.setBounds(719, 462, 109, 20);
		contentPane.add(TextoDataDoCadastro);
		TextoDataDoCadastro.setColumns(10);
		
			
	
	}
}
