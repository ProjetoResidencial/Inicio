package com.telas.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.Statement;

public class TelaInicialDespesasFixas extends JFrame {

	private JPanel MesReferencia;
	private JTextField TextoMesDeReferencia;
	private JTextField TextoValorAgua;
	private JTextField TextoValorEnergia;
	private JTextField TextoValorTelefone;
	private JTextField TextoValorAluguel;
	private JTextField TextoValorCondominio;
	private JTextField TextoValorInternet;

	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicialDespesasFixas frame = new TelaInicialDespesasFixas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	

	public void novo(){
		
		TextoMesDeReferencia.setText("");
		TextoValorAgua.setText("");
		TextoValorEnergia.setText("");
		TextoValorTelefone.setText("");
		TextoValorAluguel.setText("");
		TextoValorCondominio.setText("");
		TextoValorInternet.setText("");
		
	}
	
	
	public TelaInicialDespesasFixas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 519, 397);
		MesReferencia = new JPanel();
		MesReferencia.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(MesReferencia);
		MesReferencia.setLayout(null);
		
		JLabel lblMs = new JLabel("M\u00EAs De Refer\u00EAncia:");
		lblMs.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblMs.setBounds(337, 9, 156, 14);
		MesReferencia.add(lblMs);
		
		JLabel ValorAgua = new JLabel("Valor \u00C1gua:");
		ValorAgua.setFont(new Font("Times New Roman", Font.BOLD, 15));
		ValorAgua.setBounds(35, 61, 96, 27);
		MesReferencia.add(ValorAgua);
		
		JLabel ValorEnergia = new JLabel("Valor Energia:");
		ValorEnergia.setFont(new Font("Times New Roman", Font.BOLD, 15));
		ValorEnergia.setBounds(27, 105, 104, 14);
		MesReferencia.add(ValorEnergia);
		
		JLabel ValorTelefone = new JLabel("Valor Telefone:");
		ValorTelefone.setFont(new Font("Times New Roman", Font.BOLD, 15));
		ValorTelefone.setBounds(27, 151, 104, 14);
		MesReferencia.add(ValorTelefone);
		
		JLabel ValorAlguel = new JLabel("Valor Aluguel:");
		ValorAlguel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		ValorAlguel.setBounds(27, 193, 104, 14);
		MesReferencia.add(ValorAlguel);
		
		JLabel ValorInternet = new JLabel("Valor Internet:");
		ValorInternet.setFont(new Font("Times New Roman", Font.BOLD, 15));
		ValorInternet.setBounds(27, 266, 104, 14);
		MesReferencia.add(ValorInternet);
		
		JLabel ValorCondominio = new JLabel("Valor Condominio:");
		ValorCondominio.setFont(new Font("Times New Roman", Font.BOLD, 15));
		ValorCondominio.setBounds(27, 231, 131, 14);
		MesReferencia.add(ValorCondominio);
		
		TextoMesDeReferencia = new JTextField();
		TextoMesDeReferencia.setBounds(339, 34, 154, 20);
		MesReferencia.add(TextoMesDeReferencia);
		TextoMesDeReferencia.setColumns(10);
		
		TextoValorAgua = new JTextField();
		TextoValorAgua.setBounds(158, 65, 154, 20);
		MesReferencia.add(TextoValorAgua);
		TextoValorAgua.setColumns(10);
		
		TextoValorEnergia = new JTextField();
		TextoValorEnergia.setBounds(158, 103, 154, 20);
		MesReferencia.add(TextoValorEnergia);
		TextoValorEnergia.setColumns(10);
		
		TextoValorTelefone = new JTextField();
		TextoValorTelefone.setBounds(158, 149, 154, 20);
		MesReferencia.add(TextoValorTelefone);
		TextoValorTelefone.setColumns(10);
		
		TextoValorAluguel = new JTextField();
		TextoValorAluguel.setBounds(158, 191, 154, 20);
		MesReferencia.add(TextoValorAluguel);
		TextoValorAluguel.setColumns(10);
		
		TextoValorCondominio = new JTextField();
		TextoValorCondominio.setBounds(158, 229, 154, 20);
		MesReferencia.add(TextoValorCondominio);
		TextoValorCondominio.setColumns(10);
		
		TextoValorInternet = new JTextField();
		TextoValorInternet.setBounds(158, 264, 154, 20);
		MesReferencia.add(TextoValorInternet);
		TextoValorInternet.setColumns(10);

				
		JButton BotaoSalvar = new JButton("Salvar");
		BotaoSalvar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		BotaoSalvar.setBounds(27, 324, 89, 23);
		MesReferencia.add(BotaoSalvar);
		BotaoSalvar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {		
				
					
				try {				
					
					Class.forName("com.mysql.jdbc.Driver");				
					
					Connection conector = DriverManager.getConnection("jdbc:mysql://localhost/login", "root", "");				
					
					Statement stm;
					
					stm =  conector.createStatement();
					
					
				stm.executeUpdate ("INSERT into despesas_fixas (mes_de_referencia,valor_agua,valor_energia,valor_telefone,valor_aluguel,valor_condominio,valor_internet) VALUES ('"+TextoMesDeReferencia.getText()+"','"+TextoValorAgua.getText()+"','"+TextoValorEnergia.getText()+"','"+TextoValorTelefone.getText()+"','"+TextoValorAluguel.getText()+"','"+TextoValorCondominio.getText()+"','"+TextoValorInternet.getText()+"')"); 
		
			
			
					} catch (Exception e1) {
								System.out.println("Erro: " + e1.getMessage());

					}
					
					JOptionPane.showMessageDialog(null, "Cadastro gravado!");
			

			}});
		
		
		
		JButton BotaoLimpar = new JButton("Limpar");
		BotaoLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextoMesDeReferencia.setText("");
				TextoValorAgua.setText("");
				TextoValorEnergia.setText("");
				TextoValorTelefone.setText("");
				TextoValorAluguel.setText("");
				TextoValorCondominio.setText("");
				TextoValorInternet.setText("");
			}
		});
		BotaoLimpar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		BotaoLimpar.setBounds(253, 324, 89, 23);
		MesReferencia.add(BotaoLimpar);
		
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
		BotaoCancelar.setBounds(372, 324, 104, 23);
		MesReferencia.add(BotaoCancelar);
		
		JLabel TextoTitulo = new JLabel("Valores De Despesas Fixas No M\u00EAs.");
		TextoTitulo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		TextoTitulo.setBounds(35, 9, 246, 14);
		MesReferencia.add(TextoTitulo);
		
		JButton BotaoNovo = new JButton("Novo");
		BotaoNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				novo();
			}
		});
		BotaoNovo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		BotaoNovo.setBounds(140, 324, 89, 23);
		MesReferencia.add(BotaoNovo);
	}
}
