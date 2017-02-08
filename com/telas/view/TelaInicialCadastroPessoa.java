package com.telas.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaInicialCadastroPessoa extends JFrame {

	private JPanel contentPane;
	private JTextField TextoNome;
	private JTextField TextoEstadoCivil;
	private JTextField TextoCidade;
	private JTextField TextoEndereco;
	private JTextField TextoNumero;
	private JLabel Rg;
	private JLabel Cpf;
	private JLabel Idade;
	private JTextField TextoDataNasc;
	private JTextField TextoRg;
	private JTextField TextoCpf;
	private JLabel DataNascimento;
	private JTextField TextoIdade;
	private JLabel TituloCadastroDePessoa;
	private JTextField TextoUf;

	/**
	 * Launch the application.
	 */
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
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaInicialCadastroPessoa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 677, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Nome = new JLabel("Nome:");
		Nome.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Nome.setBounds(24, 54, 55, 14);
		contentPane.add(Nome);
		
		TextoNome = new JTextField();
		TextoNome.setBounds(90, 52, 298, 20);
		contentPane.add(TextoNome);
		TextoNome.setColumns(10);
		
		JLabel Estadocivil = new JLabel("Estado Civil:");
		Estadocivil.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Estadocivil.setBounds(14, 182, 80, 14);
		contentPane.add(Estadocivil);
		
		TextoEstadoCivil = new JTextField();
		TextoEstadoCivil.setBounds(104, 180, 287, 20);
		contentPane.add(TextoEstadoCivil);
		TextoEstadoCivil.setColumns(10);
		
		JLabel Cidade = new JLabel("Cidade:");
		Cidade.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Cidade.setBounds(24, 140, 46, 14);
		contentPane.add(Cidade);
		
		TextoCidade = new JTextField();
		TextoCidade.setBounds(90, 138, 339, 20);
		contentPane.add(TextoCidade);
		TextoCidade.setColumns(10);
		
		JLabel Endereo = new JLabel("Endere\u00E7o:");
		Endereo.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Endereo.setBounds(21, 93, 80, 14);
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
		Rg.setBounds(51, 210, 28, 20);
		contentPane.add(Rg);
		
		Cpf = new JLabel("Cpf:");
		Cpf.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Cpf.setBounds(237, 213, 55, 14);
		contentPane.add(Cpf);
		
		Idade = new JLabel("Idade:");
		Idade.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Idade.setBounds(39, 254, 55, 14);
		contentPane.add(Idade);
		
		TextoDataNasc = new JTextField();
		TextoDataNasc.setBounds(90, 300, 147, 20);
		contentPane.add(TextoDataNasc);
		TextoDataNasc.setColumns(10);
		
		TextoRg = new JTextField();
		TextoRg.setBounds(90, 211, 125, 20);
		contentPane.add(TextoRg);
		TextoRg.setColumns(10);
		
		TextoCpf = new JTextField();
		TextoCpf.setBounds(279, 211, 125, 20);
		contentPane.add(TextoCpf);
		TextoCpf.setColumns(10);
		
		DataNascimento = new JLabel("Data Nasc.");
		DataNascimento.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		DataNascimento.setBounds(14, 302, 80, 14);
		contentPane.add(DataNascimento);
		
		TextoIdade = new JTextField();
		TextoIdade.setBounds(90, 252, 86, 20);
		contentPane.add(TextoIdade);
		TextoIdade.setColumns(10);
		
		JButton BotaoSalvar = new JButton("Salvar");
		BotaoSalvar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		BotaoSalvar.setBounds(51, 363, 114, 23);
		contentPane.add(BotaoSalvar);
		
		JButton BotaoLimpar = new JButton("Limpar");
		BotaoLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DataNascimento.setText("");
				TextoIdade.setText("");
				TextoCpf.setText("");
				TextoRg.setText("");
				TextoDataNasc.setText("");
				Idade.setText("");
				Cpf.setText("");
				Rg.setText("");
				TextoNumero.setText("");
				TextoEndereco.setText("");
				TextoCidade.setText("");
				TextoEstadoCivil.setText("");
				TextoNome.setText("");
			}
		});
		BotaoLimpar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		BotaoLimpar.setBounds(219, 363, 136, 23);
		contentPane.add(BotaoLimpar);
		
		JButton BotaoCancelar = new JButton("Cancelar");
		BotaoCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		BotaoCancelar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		BotaoCancelar.setBounds(426, 363, 131, 23);
		contentPane.add(BotaoCancelar);
		
		TituloCadastroDePessoa = new JLabel("Cadastro De Pessoa");
		TituloCadastroDePessoa.setFont(new Font("Times New Roman", Font.BOLD, 18));
		TituloCadastroDePessoa.setBounds(145, 11, 222, 30);
		contentPane.add(TituloCadastroDePessoa);
		
		JLabel Uf = new JLabel("Uf:");
		Uf.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Uf.setBounds(454, 140, 37, 14);
		contentPane.add(Uf);
		
		TextoUf = new JTextField();
		TextoUf.setBounds(501, 138, 86, 20);
		contentPane.add(TextoUf);
		TextoUf.setColumns(10);
	}
}
