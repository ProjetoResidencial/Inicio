package com.telas.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaInicialDespesasVariaveis extends JFrame {

	private JPanel contentPane;
	private JTextField TextoMesRefe;
	private JTextField TextoValorManutencao;
	private JTextField TxtGrandeMan;
	private JTextField TxtGrandeAlim;
	private JTextField TextoValorAlimentacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicialDespesasVariaveis frame = new TelaInicialDespesasVariaveis();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public void novo(){
		
		TextoMesRefe.setText("");
		TextoValorManutencao.setText("");
		TxtGrandeMan.setText("");
		TxtGrandeAlim.setText("");
		TextoValorAlimentacao.setText("");
		
	}
	
	
	public TelaInicialDespesasVariaveis() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel MesDeReferncia = new JLabel("M\u00EAs De Refer\u00EAncia:");
		MesDeReferncia.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		MesDeReferncia.setBounds(241, 58, 126, 14);
		contentPane.add(MesDeReferncia);
		
		TextoMesRefe = new JTextField();
		TextoMesRefe.setBounds(377, 56, 126, 20);
		contentPane.add(TextoMesRefe);
		TextoMesRefe.setColumns(10);
		
		JLabel ValorManutencao = new JLabel("Valor Manuten\u00E7\u00E3o:");
		ValorManutencao.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		ValorManutencao.setBounds(10, 58, 116, 14);
		contentPane.add(ValorManutencao);
		
		TextoValorManutencao = new JTextField();
		TextoValorManutencao.setBounds(136, 56, 70, 20);
		contentPane.add(TextoValorManutencao);
		TextoValorManutencao.setColumns(10);
		
		JLabel ObservacoesManutencao = new JLabel("Observa\u00E7\u00F5es:");
		ObservacoesManutencao.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		ObservacoesManutencao.setBounds(10, 83, 91, 14);
		contentPane.add(ObservacoesManutencao);
		
		TxtGrandeMan = new JTextField();
		TxtGrandeMan.setBounds(10, 108, 528, 95);
		contentPane.add(TxtGrandeMan);
		TxtGrandeMan.setColumns(10);
		
		JLabel ValorAlimentacao = new JLabel("Valor Alimenta\u00E7\u00E3o:");
		ValorAlimentacao.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		ValorAlimentacao.setBounds(10, 214, 116, 14);
		contentPane.add(ValorAlimentacao);
		
		TxtGrandeAlim = new JTextField();
		TxtGrandeAlim.setBounds(10, 264, 528, 100);
		contentPane.add(TxtGrandeAlim);
		TxtGrandeAlim.setColumns(10);
		
		JLabel ObservacoesAlimentacao = new JLabel("Observa\u00E7\u00F5es:");
		ObservacoesAlimentacao.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		ObservacoesAlimentacao.setBounds(10, 239, 106, 14);
		contentPane.add(ObservacoesAlimentacao);
		
		TextoValorAlimentacao = new JTextField();
		TextoValorAlimentacao.setBounds(136, 212, 70, 20);
		contentPane.add(TextoValorAlimentacao);
		TextoValorAlimentacao.setColumns(10);
		
		JButton BotaoSalvar = new JButton("Salvar");
		BotaoSalvar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		BotaoSalvar.setBounds(37, 375, 89, 23);
		contentPane.add(BotaoSalvar);
		
		JButton BotaoLimpar = new JButton("Limpar");
		BotaoLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextoMesRefe.setText("");
				TextoValorManutencao.setText("");
				TxtGrandeMan.setText("");
				TxtGrandeAlim.setText("");
				TextoValorAlimentacao.setText("");
			}
		});
		BotaoLimpar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		BotaoLimpar.setBounds(278, 375, 89, 23);
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
		BotaoCancelar.setBounds(412, 375, 110, 23);
		contentPane.add(BotaoCancelar);
		
		JLabel TituloValoresDeDespesas = new JLabel("Valores De Despesas Variaveis No M\u00EAs.");
		TituloValoresDeDespesas.setFont(new Font("Times New Roman", Font.BOLD, 15));
		TituloValoresDeDespesas.setBounds(118, 11, 317, 27);
		contentPane.add(TituloValoresDeDespesas);
		
		JButton BotaoNovo = new JButton("Novo");
		BotaoNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				novo();
			}
		});
		BotaoNovo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		BotaoNovo.setBounds(155, 375, 89, 23);
		contentPane.add(BotaoNovo);
	}
}
