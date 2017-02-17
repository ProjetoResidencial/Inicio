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
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.UIManager;

public class TelaInicialCadastroResidencia extends JFrame {

	private JPanel contentPane;
	private JTextField TextoCidade;
	private JTextField TextoEndereco;
	private JTextField TextoN;
	private JTextField TextoCep;
	private JTextField TextoTipoDeResidencia;
	private JTextField TextoNomeDoPredio;
	private JTextField TextoNomeDoCondominio;
	private JLabel Complemento;
	private JTextField TextoComplemento;
	private JButton BotaoSalvar;
	private JButton BotaoLimpar;
	private JButton BotaoCancelar;
	private JLabel lblCadastroDeResidncia;
	private JButton BotaoNovo;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
	

	}
	
	
	
	

	public TelaInicialCadastroResidencia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 908, 617);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.background"));
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Cidade = new JLabel("Cidade: ");
		Cidade.setBounds(10, 78, 48, 18);
		Cidade.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		contentPane.add(Cidade);
		
		TextoCidade = new JTextField();
		TextoCidade.setBounds(73, 78, 298, 20);
		contentPane.add(TextoCidade);
		TextoCidade.setColumns(10);
		
		JLabel Endereo = new JLabel("Endere\u00E7o:");
		Endereo.setBounds(10, 125, 59, 18);
		Endereo.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		contentPane.add(Endereo);
		
		TextoEndereco = new JTextField();
		TextoEndereco.setBounds(73, 125, 414, 20);
		contentPane.add(TextoEndereco);
		TextoEndereco.setColumns(10);
		
		TextoN = new JTextField();
		TextoN.setBounds(557, 125, 52, 20);
		contentPane.add(TextoN);
		TextoN.setColumns(10);
		
		JLabel N = new JLabel("N\u00BA");
		N.setBounds(517, 127, 19, 14);
		N.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		contentPane.add(N);
		
		JLabel Cep = new JLabel("Cep:");
		Cep.setBounds(10, 176, 27, 18);
		Cep.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		contentPane.add(Cep);
		
		TextoCep = new JTextField();
		TextoCep.setBounds(73, 176, 134, 20);
		contentPane.add(TextoCep);
		TextoCep.setColumns(10);
		
		JLabel TipoDeResidencia = new JLabel("Tipo De Residencia:");
		TipoDeResidencia.setBounds(10, 245, 119, 18);
		TipoDeResidencia.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		contentPane.add(TipoDeResidencia);
		
		TextoTipoDeResidencia = new JTextField();
		TextoTipoDeResidencia.setBounds(149, 245, 346, 20);
		contentPane.add(TextoTipoDeResidencia);
		TextoTipoDeResidencia.setColumns(10);
		
		JLabel ResidenciaPropria = new JLabel("Quem Reside:");
		ResidenciaPropria.setBounds(10, 299, 103, 18);
		ResidenciaPropria.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		contentPane.add(ResidenciaPropria);
		
		JLabel NomeDoPredio = new JLabel("Nome Do Pr\u00EAdio:");
		NomeDoPredio.setBounds(10, 365, 103, 18);
		NomeDoPredio.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		contentPane.add(NomeDoPredio);
		
		TextoNomeDoPredio = new JTextField();
		TextoNomeDoPredio.setBounds(137, 365, 346, 20);
		contentPane.add(TextoNomeDoPredio);
		TextoNomeDoPredio.setColumns(10);
		
		JLabel NomeDoCondominio = new JLabel("Nome Do Condominio:");
		NomeDoCondominio.setBounds(10, 415, 134, 18);
		NomeDoCondominio.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		contentPane.add(NomeDoCondominio);
		
		TextoNomeDoCondominio = new JTextField();
		TextoNomeDoCondominio.setBounds(163, 415, 344, 20);
		contentPane.add(TextoNomeDoCondominio);
		TextoNomeDoCondominio.setColumns(10);
		
		Complemento = new JLabel("Complemento:");
		Complemento.setBounds(233, 176, 84, 18);
		Complemento.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		contentPane.add(Complemento);
		
		TextoComplemento = new JTextField();
		TextoComplemento.setBounds(349, 176, 312, 20);
		contentPane.add(TextoComplemento);
		TextoComplemento.setColumns(10);
		
		BotaoSalvar = new JButton("Salvar");
		BotaoSalvar.setBounds(20, 544, 187, 23);
		BotaoSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					try {				
					
					Class.forName("com.mysql.jdbc.Driver");				
					
					Connection conector = DriverManager.getConnection("jdbc:mysql://localhost/login", "root", "");				
					
					Statement stm;
					
					stm = conector.createStatement();
					
					
				stm.executeUpdate ("INSERT into cadastro_residencia (cidade, endereco, numero, cep, complemento, tipo_de_residencia, residencia_propria, nome_do_predio, nome_do_condominio) VALUES ('"+TextoCidade.getText()+"','"+TextoEndereco.getText()+"','"+TextoN.getText()+"','"+TextoCep.getText()+"','"+TextoComplemento.getText()+"','"+TextoTipoDeResidencia.getText()+"','"+JRadioButton.getText()+"','"+TextoNomeDoPredio.getText()+"','"+TextoNomeDoCondominio.getText()+"')"); 
		
			
			
					} catch (Exception e1) {
								System.out.println("Erro: " + e1.getMessage());

					}
					
					JOptionPane.showMessageDialog(null, "Cadastro gravado!");
			

			}});
				
		
				
			

		BotaoSalvar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		contentPane.add(BotaoSalvar);
		
		BotaoLimpar = new JButton("Limpar");
		BotaoLimpar.setBounds(475, 544, 187, 23);
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
				
			}
		
		});
		
		BotaoLimpar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		contentPane.add(BotaoLimpar);
		
		BotaoCancelar = new JButton("Cancelar");
		BotaoCancelar.setBounds(695, 544, 187, 23);
		BotaoCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaInicialMenuGeral tl = new TelaInicialMenuGeral();
				tl.show();
				tl.setExtendedState(new TelaInicialMenuGeral().MOVE_CURSOR);
				dispose();


			}
		});
		BotaoCancelar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		contentPane.add(BotaoCancelar);
		
		lblCadastroDeResidncia = new JLabel("Cadastro De Resid\u00EAncia");
		lblCadastroDeResidncia.setBounds(282, 11, 330, 30);
		lblCadastroDeResidncia.setFont(new Font("Times New Roman", Font.BOLD, 31));
		contentPane.add(lblCadastroDeResidncia);
		
		BotaoNovo = new JButton("Novo");
		BotaoNovo.setBounds(247, 544, 187, 23);
		BotaoNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				novo();
			}
		});
		BotaoNovo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		contentPane.add(BotaoNovo);
		
		textField = new JTextField();
		textField.setBounds(111, 299, 342, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblResidenciaPropria = new JLabel("Residencia Propria ?");
		lblResidenciaPropria.setBounds(10, 471, 145, 14);
		lblResidenciaPropria.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		contentPane.add(lblResidenciaPropria);
		
		JRadioButton RadioButomSim = new JRadioButton("Sim");
		buttonGroup.add(RadioButomSim);
		RadioButomSim.setBounds(161, 468, 59, 23);
		contentPane.add(RadioButomSim);
		
		JRadioButton RadioButomNao = new JRadioButton("Nao");
		buttonGroup.add(RadioButomNao);
		RadioButomNao.setBounds(247, 468, 70, 23);
		contentPane.add(RadioButomNao);
		
		
		
	}
}
