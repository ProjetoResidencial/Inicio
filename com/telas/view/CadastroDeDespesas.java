package com.telas.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JSlider;
import javax.swing.JList;
import java.awt.Panel;
import java.awt.Choice;
import javax.swing.JMenu;
import javax.swing.JOptionPane;

import java.awt.Label;
import javax.swing.JToolBar;
import javax.swing.JInternalFrame;
import javax.swing.JEditorPane;
import javax.swing.JSplitPane;
import javax.swing.JPasswordField;
import java.awt.TextField;
import javax.swing.JProgressBar;
import javax.swing.JLayeredPane;
import javax.swing.JTextPane;
import javax.swing.Box;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class CadastroDeDespesas extends JFrame {

	private JPanel contentPane;
	private JTextField TextoAgua;
	private JTextField TextoEnergia;
	private JTextField TextoAluguel;
	private JTextField TextoCondominio;
	private JTextField TextoInternet;
	private JTextField TextoAlimentacao;
	private JTextField TextoManutencao;
	private JTextField ObservacaoDeAlimentacao;
	private JTextField ObservacaoDeManutencao;
	private JTextField ObservacoesDespesasFixas;

	
		
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroDeDespesas frame = new CadastroDeDespesas();
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CadastroDeDespesas() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAluguel = new JLabel("Aluguel : ");
		lblAluguel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblAluguel.setBounds(32, 173, 64, 18);
		contentPane.add(lblAluguel);

		JLabel Agua = new JLabel("\u00C1gua :");
		Agua.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Agua.setBounds(51, 91, 43, 18);
		contentPane.add(Agua);

		JLabel lblEnergia = new JLabel("Energia : ");
		lblEnergia.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblEnergia.setBounds(32, 133, 64, 18);
		contentPane.add(lblEnergia);

		JLabel lblCondominio = new JLabel("Condominio : ");
		lblCondominio.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblCondominio.setBounds(4, 211, 92, 18);
		contentPane.add(lblCondominio);

		JLabel lblInternet = new JLabel("Internet : ");
		lblInternet.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblInternet.setBounds(29, 252, 67, 18);
		contentPane.add(lblInternet);

		JLabel lblNewLabel = new JLabel("CADASTRO DE DESPESAS");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(237, 11, 258, 14);
		contentPane.add(lblNewLabel);

		TextoAgua = new JTextField();
		TextoAgua.setBounds(122, 91, 86, 20);
		contentPane.add(TextoAgua);
		TextoAgua.setColumns(10);

		Choice MoradorChoice = new Choice();
		MoradorChoice.setBounds(77, 46, 460, 20);
		contentPane.add(MoradorChoice);

		JLabel lblMorador = new JLabel("Morador:");
		lblMorador.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblMorador.setBounds(10, 46, 75, 20);
		contentPane.add(lblMorador);

		Choice DatasChoice = new Choice();
		DatasChoice.setBounds(570, 46, 86, 20);
		contentPane.add(DatasChoice);

		DatasChoice.add("Janeiro");
		DatasChoice.add("Fevereiro");
		DatasChoice.add("Mar�o");
		DatasChoice.add("Abril");
		DatasChoice.add("Maio");
		DatasChoice.add("Junho");
		DatasChoice.add("Julho");
		DatasChoice.add("Agosto");
		DatasChoice.add("Setembro");
		DatasChoice.add("Outubro");
		DatasChoice.add("Novembro");
		DatasChoice.add("Dezembro");

		JLabel lblMs = new JLabel("M\u00EAs");
		lblMs.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblMs.setBounds(580, 26, 46, 14);
		contentPane.add(lblMs);

		TextoEnergia = new JTextField();
		TextoEnergia.setBounds(122, 133, 86, 20);
		contentPane.add(TextoEnergia);
		TextoEnergia.setColumns(10);

		TextoAluguel = new JTextField();
		TextoAluguel.setBounds(122, 173, 86, 20);
		contentPane.add(TextoAluguel);
		TextoAluguel.setColumns(10);

		TextoCondominio = new JTextField();
		TextoCondominio.setBounds(122, 211, 86, 20);
		contentPane.add(TextoCondominio);
		TextoCondominio.setColumns(10);

		TextoInternet = new JTextField();
		TextoInternet.setBounds(122, 252, 86, 20);
		contentPane.add(TextoInternet);
		TextoInternet.setColumns(10);

		JLabel lblAlimentao = new JLabel("Alimenta\u00E7\u00E3o : ");
		lblAlimentao.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblAlimentao.setBounds(432, 93, 105, 14);
		contentPane.add(lblAlimentao);

		TextoAlimentacao = new JTextField();
		TextoAlimentacao.setBounds(529, 91, 86, 20);
		contentPane.add(TextoAlimentacao);
		TextoAlimentacao.setColumns(10);

		JLabel lblManuteno = new JLabel("Manuten\u00E7\u00E3o : ");
		lblManuteno.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblManuteno.setBounds(432, 264, 102, 14);
		contentPane.add(lblManuteno);

		TextoManutencao = new JTextField();
		TextoManutencao.setBounds(529, 262, 86, 20);
		contentPane.add(TextoManutencao);
		TextoManutencao.setColumns(10);

		ObservacaoDeAlimentacao = new JTextField();
		ObservacaoDeAlimentacao.setBounds(432, 145, 312, 108);
		contentPane.add(ObservacaoDeAlimentacao);
		ObservacaoDeAlimentacao.setColumns(10);

		ObservacaoDeManutencao = new JTextField();
		ObservacaoDeManutencao.setBounds(432, 314, 312, 90);
		contentPane.add(ObservacaoDeManutencao);
		ObservacaoDeManutencao.setColumns(10);

		JLabel lblObservaes = new JLabel("Observa\u00E7\u00F5es : ");
		lblObservaes.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblObservaes.setBounds(435, 120, 102, 14);
		contentPane.add(lblObservaes);

		JLabel lblObservaes_1 = new JLabel("Observa\u00E7\u00F5es : ");
		lblObservaes_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblObservaes_1.setBounds(432, 289, 106, 14);
		contentPane.add(lblObservaes_1);

		ObservacoesDespesasFixas = new JTextField();
		ObservacoesDespesasFixas.setBounds(20, 312, 314, 90);
		contentPane.add(ObservacoesDespesasFixas);
		ObservacoesDespesasFixas.setColumns(10);

		JLabel ObservacoesDeDespesasFixas = new JLabel("Observa\u00E7\u00F5es de Despesas Fixas : ");
		ObservacoesDeDespesasFixas.setFont(new Font("Times New Roman", Font.BOLD, 15));
		ObservacoesDeDespesasFixas.setBounds(24, 283, 225, 14);
		contentPane.add(ObservacoesDeDespesasFixas);

		JButton BotaoSalvar = new JButton("SALVAR");
		BotaoSalvar.setBounds(53, 428, 155, 23);
		contentPane.add(BotaoSalvar);
		BotaoSalvar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				

				try {

					Class.forName("com.mysql.jdbc.Driver");

					Connection conector = DriverManager.getConnection("jdbc:mysql://localhost/login", "root", "");

					Statement stm;

					stm = conector.createStatement();

					stm.executeUpdate(
							"INSERT into cadastro_despesas ( agua, energia, aluguel, condominio, internet, alimentacao, manutencao, obs_despesas_fixas, obs_alimentacao, obs_manutencao) VALUES ('"
									+ TextoAgua.getText() + "','" + TextoEnergia.getText() + "','"
									+ TextoAluguel.getText() + "','" + TextoCondominio.getText() + "','"
									+ TextoInternet.getText() + "','" + TextoAlimentacao.getText() + "','"
									+ TextoManutencao.getText() + "','" + ObservacaoDeAlimentacao.getText() + "','"
									+ ObservacaoDeManutencao.getText() + "','" + ObservacoesDespesasFixas.getText() + "')");

				} catch (Exception e1) {
					System.out.println("Erro: " + e1.getMessage());

				}

				JOptionPane.showMessageDialog(null, "Cadastro gravado!");

			}
		});

		
		
		
		
		
		JButton BotaoLimpar = new JButton("LIMPAR");
		BotaoLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				TextoAgua.setText("");
				TextoEnergia.setText("");
				TextoAluguel.setText("");
				TextoCondominio.setText("");
				TextoAlimentacao.setText("");
				TextoManutencao.setText("");
				TextoInternet.setText("");
				ObservacaoDeAlimentacao.setText("");
				ObservacaoDeManutencao.setText("");
				ObservacoesDespesasFixas.setText("");

			}
		});
		
		BotaoLimpar.setBounds(281, 428, 173, 23);
		contentPane.add(BotaoLimpar);

		JButton BotaoCancelar = new JButton("CANCELAR");
		BotaoCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicialMenuGeral tl = new TelaInicialMenuGeral();
				tl.show();
				tl.setExtendedState(new TelaInicialMenuGeral().MOVE_CURSOR);
				dispose();
			}
		});
		BotaoCancelar.setBounds(522, 428, 173, 23);
		contentPane.add(BotaoCancelar);
	}
}
