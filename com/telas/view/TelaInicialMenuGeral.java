package com.telas.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;

public class TelaInicialMenuGeral extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicialMenuGeral frame = new TelaInicialMenuGeral();
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
	public TelaInicialMenuGeral() {
		setTitle("Gerenciador de Contas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnCadastros = new JMenu("CADASTROS");
		mnCadastros.setFont(new Font("Times New Roman", Font.BOLD, 13));
		menuBar.add(mnCadastros);
		
		JMenuItem mntmCadastroDeResidncia = new JMenuItem("- Resid\u00EAncia");
		mntmCadastroDeResidncia.setFont(new Font("Times New Roman", Font.BOLD, 12));
		mnCadastros.add(mntmCadastroDeResidncia);
		
		JMenuItem mntmCadastroDePessoas = new JMenuItem("- Pessoas");
		mntmCadastroDePessoas.setFont(new Font("Times New Roman", Font.BOLD, 12));
		mnCadastros.add(mntmCadastroDePessoas);
		
		JMenuItem mntmCadastroDeUsurios = new JMenuItem("- Usu\u00E1rios");
		mntmCadastroDeUsurios.setFont(new Font("Times New Roman", Font.BOLD, 12));
		mnCadastros.add(mntmCadastroDeUsurios);
		
		JMenuItem mntmDespesasFixas = new JMenuItem("- Desp. Fixas");
		mnCadastros.add(mntmDespesasFixas);
		mntmDespesasFixas.setFont(new Font("Times New Roman", Font.BOLD, 13));
		
		JMenuItem mntmDespesasVariaveis = new JMenuItem("- Desp. Variaveis");
		mnCadastros.add(mntmDespesasVariaveis);
		mntmDespesasVariaveis.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		JMenu mnCadastroDeDespesas = new JMenu("RELAT\u00D3RIOS");
		mnCadastroDeDespesas.setFont(new Font("Times New Roman", Font.BOLD, 13));
		menuBar.add(mnCadastroDeDespesas);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
