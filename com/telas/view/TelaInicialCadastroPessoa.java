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
		setBounds(100, 100, 677, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel Nome = new JLabel("Nome:");
		Nome.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Nome.setBounds(24, 54, 39, 18);
		contentPane.add(Nome);

		TextoNome = new JTextField();
		TextoNome.setBounds(90, 52, 298, 20);
		contentPane.add(TextoNome);
		TextoNome.setColumns(10);

		JLabel Estadocivil = new JLabel("Estado Civil:");
		Estadocivil.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Estadocivil.setBounds(14, 182, 73, 18);
		contentPane.add(Estadocivil);

		TextoEstadoCivil = new JTextField();
		TextoEstadoCivil.setBounds(104, 180, 287, 20);
		contentPane.add(TextoEstadoCivil);
		TextoEstadoCivil.setColumns(10);
				
						JLabel Cidade = new JLabel("Cidade:");
						Cidade.setFont(new Font("Times New Roman", Font.PLAIN, 15));
						Cidade.setBounds(24, 140, 44, 18);
						contentPane.add(Cidade);
		
				TextoCidade = new JTextField();
				TextoCidade.setBounds(90, 138, 339, 20);
				contentPane.add(TextoCidade);
				TextoCidade.setColumns(10);
		
				JLabel Endereo = new JLabel("Endere\u00E7o:");
				Endereo.setFont(new Font("Times New Roman", Font.PLAIN, 15));
				Endereo.setBounds(21, 93, 59, 18);
				contentPane.add(Endereo);

		TextoEndereco = new JTextField();
		TextoEndereco.setBounds(90, 91, 380, 20);
		contentPane.add(TextoEndereco);
		TextoEndereco.setColumns(10);

		JLabel N = new JLabel("N\u00BA:");
		N.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		N.setBounds(504, 93, 37, 14);
		contentPane.add(N);

		TextoNumero = new JTextField();
		TextoNumero.setBounds(541, 91, 46, 20);
		contentPane.add(TextoNumero);
		TextoNumero.setColumns(10);

		Rg = new JLabel("Rg:");
		Rg.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Rg.setBounds(51, 210, 20, 18);
		contentPane.add(Rg);
		
				TextoRg = new JTextField();
				TextoRg.setBounds(90, 211, 125, 20);
				contentPane.add(TextoRg);
				TextoRg.setColumns(10);

		Cpf = new JLabel("Cpf:");
		Cpf.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Cpf.setBounds(237, 213, 55, 14);
		contentPane.add(Cpf);
		
				TextoCpf = new JTextField();
				TextoCpf.setBounds(279, 211, 125, 20);
				contentPane.add(TextoCpf);
				TextoCpf.setColumns(10);

		Idade = new JLabel("Idade:");
		Idade.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Idade.setBounds(39, 254, 36, 18);
		contentPane.add(Idade);
		
				TextoIdade = new JTextField();
				TextoIdade.setBounds(90, 252, 86, 20);
				contentPane.add(TextoIdade);
				TextoIdade.setColumns(10);
		
				DataNascimento = new JLabel("Data Nasc.");
				DataNascimento.setFont(new Font("Times New Roman", Font.PLAIN, 15));
				DataNascimento.setBounds(14, 302, 68, 18);
				contentPane.add(DataNascimento);

		TextoDataNasc = new JTextField();
		TextoDataNasc.setBounds(90, 300, 147, 20);
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
					
				stm.executeUpdate ("INSERT into cadastro_pessoa (nome, endereco, numero, cidade, estado_civil, rg, cpf, idade, data_nascimento, uf) VALUES ('"+TextoNome.getText()+"','"+TextoEndereco.getText()+"','"+TextoNumero.getText()+"','"+TextoCidade.getText()+"','"+TextoEstadoCivil.getText()+"','"+TextoRg.getText()+"','"+TextoCpf.getText()+"','"+TextoIdade.getText()+"','"+TextoDataNasc.getText()+"','"+TextoUf.getText()+"')"); 
		
			
			
					} catch (Exception e1) {
								System.out.println("Erro: " + e1.getMessage());

					}
					
					JOptionPane.showMessageDialog(null, "Cadastro gravado!");
			

			}});
			
			
		
				TituloCadastroDePessoa = new JLabel("Cadastro De Pessoa");
				TituloCadastroDePessoa.setFont(new Font("Times New Roman", Font.BOLD, 18));
				TituloCadastroDePessoa.setBounds(145, 11, 222, 30);
				contentPane.add(TituloCadastroDePessoa);
			
				
		
		BotaoSalvar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		BotaoSalvar.setBounds(39, 363, 114, 23);
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
			}
		});
		
				JLabel Uf = new JLabel("Uf:");
				Uf.setFont(new Font("Times New Roman", Font.PLAIN, 15));
				Uf.setBounds(454, 140, 37, 14);
				contentPane.add(Uf);
		
				TextoUf = new JTextField();
				TextoUf.setBounds(501, 138, 86, 20);
				contentPane.add(TextoUf);
				TextoUf.setColumns(10);
		BotaoLimpar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		BotaoLimpar.setBounds(339, 363, 131, 23);
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
		BotaoCancelar.setBounds(506, 363, 131, 23);
		contentPane.add(BotaoCancelar);

		JButton BotaoNovo = new JButton("Novo");
		BotaoNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// chamando metodo que seta campos em branco
				novo();

			}
		});
		BotaoNovo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		BotaoNovo.setBounds(181, 363, 114, 23);
		contentPane.add(BotaoNovo);
	}
		}
