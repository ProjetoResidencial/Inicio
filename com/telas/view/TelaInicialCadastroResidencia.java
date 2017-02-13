package com.telas.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class TelaInicialCadastroResidencia extends JFrame {

	private JPanel contentPane;
	private JTextField TextoCidade;
	private JTextField TextoEndereco;
	private JTextField TextoN;
	private JTextField TextoCep;
	private JTextField TextoTipoDeResidencia;
	private JTextField TextoResidenciaPropria;
	private JTextField TextoNomeDoPredio;
	private JTextField TextoNomeDoCondominio;
	private JLabel Complemento;
	private JTextField TextoComplemento;
	private JButton BotaoSalvar;
	private JButton BotaoLimpar;
	private JButton BotaoCancelar;
	private JLabel lblCadastroDeResidncia;
	private JButton BotaoNovo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicialCadastroResidencia frame = new TelaInicialCadastroResidencia();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void novo() {

		TextoCidade.setText("");
		TextoEndereco.setText("");
		TextoN.setText("");
		TextoCep.setText("");
		TextoTipoDeResidencia.setText("");
		TextoNomeDoPredio.setText("");
		TextoNomeDoCondominio.setText("");
		TextoComplemento.setText("");
		TextoResidenciaPropria.setText("");

	}

	public TelaInicialCadastroResidencia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 552, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Cidade = new JLabel("Cidade: ");
		Cidade.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Cidade.setBounds(10, 64, 77, 14);
		contentPane.add(Cidade);
		
		TextoCidade = new JTextField();
		TextoCidade.setBounds(97, 62, 298, 20);
		contentPane.add(TextoCidade);
		TextoCidade.setColumns(10);
		
		JLabel Endereo = new JLabel("Endere\u00E7o:");
		Endereo.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Endereo.setBounds(10, 100, 60, 14);
		contentPane.add(Endereo);
		
		TextoEndereco = new JTextField();
		TextoEndereco.setBounds(83, 98, 312, 20);
		contentPane.add(TextoEndereco);
		TextoEndereco.setColumns(10);
		
		TextoN = new JTextField();
		TextoN.setBounds(432, 98, 52, 20);
		contentPane.add(TextoN);
		TextoN.setColumns(10);
		
		JLabel N = new JLabel("N\u00BA");
		N.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		N.setBounds(403, 100, 19, 14);
		contentPane.add(N);
		
		JLabel Cep = new JLabel("Cep:");
		Cep.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Cep.setBounds(20, 134, 46, 14);
		contentPane.add(Cep);
		
		TextoCep = new JTextField();
		TextoCep.setBounds(69, 129, 157, 20);
		contentPane.add(TextoCep);
		TextoCep.setColumns(10);
		
		JLabel TipoDeResidencia = new JLabel("Tipo De Residencia:");
		TipoDeResidencia.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		TipoDeResidencia.setBounds(10, 177, 141, 14);
		contentPane.add(TipoDeResidencia);
		
		TextoTipoDeResidencia = new JTextField();
		TextoTipoDeResidencia.setBounds(161, 175, 333, 20);
		contentPane.add(TextoTipoDeResidencia);
		TextoTipoDeResidencia.setColumns(10);
		
		JLabel ResidenciaPropria = new JLabel("Resid\u00EAncia Propria ? :");
		ResidenciaPropria.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		ResidenciaPropria.setBounds(10, 216, 144, 14);
		contentPane.add(ResidenciaPropria);
		
		TextoResidenciaPropria = new JTextField();
		TextoResidenciaPropria.setBounds(161, 214, 333, 20);
		contentPane.add(TextoResidenciaPropria);
		TextoResidenciaPropria.setColumns(10);
		
		JLabel NomeDoPredio = new JLabel("Nome Do Pr\u00EAdio:");
		NomeDoPredio.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		NomeDoPredio.setBounds(17, 252, 112, 14);
		contentPane.add(NomeDoPredio);
		
		TextoNomeDoPredio = new JTextField();
		TextoNomeDoPredio.setBounds(161, 250, 333, 20);
		contentPane.add(TextoNomeDoPredio);
		TextoNomeDoPredio.setColumns(10);
		
		JLabel NomeDoCondominio = new JLabel("Nome Do Condominio:");
		NomeDoCondominio.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		NomeDoCondominio.setBounds(10, 293, 170, 14);
		contentPane.add(NomeDoCondominio);
		
		TextoNomeDoCondominio = new JTextField();
		TextoNomeDoCondominio.setBounds(163, 291, 331, 20);
		contentPane.add(TextoNomeDoCondominio);
		TextoNomeDoCondominio.setColumns(10);
		
		Complemento = new JLabel("Complemento:");
		Complemento.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Complemento.setBounds(237, 129, 94, 14);
		contentPane.add(Complemento);
		
		TextoComplemento = new JTextField();
		TextoComplemento.setBounds(341, 129, 192, 20);
		contentPane.add(TextoComplemento);
		TextoComplemento.setColumns(10);
		
		BotaoSalvar = new JButton("Salvar");
		BotaoSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					try {				
					
					Class.forName("com.mysql.jdbc.Driver");				
					
					Connection conector = DriverManager.getConnection("jdbc:mysql://localhost/login", "root", "");				
					
					Statement stm;
					
					stm = conector.createStatement();
					
					
				stm.executeUpdate ("INSERT into cadastro_residencia (cidade, endereco, numero, cep, complemento, tipo_de_residencia, residencia_propria, nome_do_predio, nome_do_condominio) VALUES ('"+TextoCidade.getText()+"','"+TextoEndereco.getText()+"','"+TextoN.getText()+"','"+TextoCep.getText()+"','"+TextoComplemento.getText()+"','"+TextoTipoDeResidencia.getText()+"','"+TextoResidenciaPropria.getText()+"','"+TextoNomeDoPredio.getText()+"','"+TextoNomeDoCondominio.getText()+"')"); 
		
			
			
					} catch (Exception e1) {
								System.out.println("Erro: " + e1.getMessage());

					}
					
					JOptionPane.showMessageDialog(null, "Cadastro gravado!");
			

			}});
				
				
				
			

		BotaoSalvar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		BotaoSalvar.setBounds(33, 337, 89, 23);
		contentPane.add(BotaoSalvar);
		
		BotaoLimpar = new JButton("Limpar");
		BotaoLimpar.addActionListener(new ActionListener() {

	public void actionPerformed(ActionEvent e) {
				TextoCidade.setText("");
				TextoEndereco.setText("");
				TextoN.setText("");
				TextoCep.setText("");
				TextoTipoDeResidencia.setText("");
				TextoNomeDoPredio.setText("");
				TextoNomeDoCondominio.setText("");
				TextoComplemento.setText("");
				TextoResidenciaPropria.setText("");
			}
		
		});
		
		BotaoLimpar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		BotaoLimpar.setBounds(272, 338, 89, 23);
		contentPane.add(BotaoLimpar);
		
		BotaoCancelar = new JButton("Cancelar");
		BotaoCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaInicialMenuGeral tl = new TelaInicialMenuGeral();
				tl.show();
				tl.setExtendedState(new TelaInicialMenuGeral().MOVE_CURSOR);
				dispose();


			}
		});
		BotaoCancelar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		BotaoCancelar.setBounds(396, 338, 111, 23);
		contentPane.add(BotaoCancelar);
		
		lblCadastroDeResidncia = new JLabel("Cadastro De Resid\u00EAncia");
		lblCadastroDeResidncia.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCadastroDeResidncia.setBounds(154, 21, 268, 14);
		contentPane.add(lblCadastroDeResidncia);
		
		BotaoNovo = new JButton("Novo");
		BotaoNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				novo();
			}
		});
		BotaoNovo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		BotaoNovo.setBounds(154, 337, 89, 23);
		contentPane.add(BotaoNovo);
	}

}
