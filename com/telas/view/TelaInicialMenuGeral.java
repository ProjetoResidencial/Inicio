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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

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
		
		JMenu MenuCadastros = new JMenu("CADASTROS");
		MenuCadastros.setFont(new Font("Times New Roman", Font.BOLD, 13));
		menuBar.add(MenuCadastros);
		
		JMenuItem mntmCadastroDeResidncia = new JMenuItem("- Resid\u00EAncia");
		mntmCadastroDeResidncia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicialCadastroResidencia tl = new TelaInicialCadastroResidencia();
				tl.show();
				tl.setExtendedState(new TelaInicialCadastroResidencia().MOVE_CURSOR);
				dispose();
			}
		});
		mntmCadastroDeResidncia.setFont(new Font("Times New Roman", Font.BOLD, 12));
		MenuCadastros.add(mntmCadastroDeResidncia);
		
		JMenuItem mntmCadastroDePessoas = new JMenuItem("- Pessoas");
		mntmCadastroDePessoas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicialCadastroPessoa tl = new TelaInicialCadastroPessoa();
				tl.show();
				tl.setExtendedState(new TelaInicialCadastroPessoa().MOVE_CURSOR);
				dispose();
			}
		});
		mntmCadastroDePessoas.setFont(new Font("Times New Roman", Font.BOLD, 12));
		MenuCadastros.add(mntmCadastroDePessoas);
		
		JMenuItem mntmCadastroDeUsurios = new JMenuItem("- Usu\u00E1rios");
		mntmCadastroDeUsurios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastroUsuario tl = new TelaCadastroUsuario ();
				tl.show();
				tl.setExtendedState(new TelaCadastroUsuario().MOVE_CURSOR);
				dispose();
				
				
			}
		});
		mntmCadastroDeUsurios.setFont(new Font("Times New Roman", Font.BOLD, 12));
		MenuCadastros.add(mntmCadastroDeUsurios);
		
		JMenuItem mntmDespesasFixas = new JMenuItem("- Desp. Fixas");
		mntmDespesasFixas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicialDespesasFixas tl = new TelaInicialDespesasFixas ();
				tl.show();
				tl.setExtendedState(new TelaInicialDespesasFixas().MOVE_CURSOR);
				dispose();
				
			}
		});
		MenuCadastros.add(mntmDespesasFixas);
		mntmDespesasFixas.setFont(new Font("Times New Roman", Font.BOLD, 13));
		
		JMenuItem mntmDespesasVariaveis = new JMenuItem("- Desp. Variaveis");
		mntmDespesasVariaveis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicialDespesasVariaveis tl = new TelaInicialDespesasVariaveis ();
				tl.show();
				tl.setExtendedState(new TelaInicialDespesasVariaveis().MOVE_CURSOR);
				//dispose fecha tela anterior
				//dispose();
				
			}
		});
		MenuCadastros.add(mntmDespesasVariaveis);
		mntmDespesasVariaveis.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		JMenu MenuRelatorios = new JMenu("RELAT\u00D3RIOS");
		MenuRelatorios.setFont(new Font("Times New Roman", Font.BOLD, 13));
		menuBar.add(MenuRelatorios);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton BotaoCancelar = new JButton("Cancelar");
		BotaoCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		BotaoCancelar.setBounds(335, 206, 89, 23);
		contentPane.add(BotaoCancelar);
	}
}
