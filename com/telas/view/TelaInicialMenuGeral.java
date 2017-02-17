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
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Dialog.ModalExclusionType;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Henrique\\Desktop\\fundo-azul-1.jpg"));
		setBackground(SystemColor.windowBorder);
		setTitle("Gerenciador de Contas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu MenuCadastros = new JMenu("CADASTROS");
		MenuCadastros.setFont(new Font("Times New Roman", Font.BOLD, 13));
		menuBar.add(MenuCadastros);
		
		JMenuItem mntmCadastroDePessoas = new JMenuItem("--> Pessoas");
		mntmCadastroDePessoas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicialCadastroPessoa tl = new TelaInicialCadastroPessoa();
				tl.show();
				tl.setExtendedState(new TelaInicialCadastroPessoa().MOVE_CURSOR);
				//dispose();
			}
		});
		mntmCadastroDePessoas.setFont(new Font("Times New Roman", Font.BOLD, 15));
		MenuCadastros.add(mntmCadastroDePessoas);
		
		JMenuItem mntmDespesas = new JMenuItem("--> Despesas");
		mntmDespesas.setFont(new Font("Times New Roman", Font.BOLD, 15));
		mntmDespesas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroDeDespesas tl = new CadastroDeDespesas();
				tl.show();
				tl.setExtendedState(new CadastroDeDespesas().MOVE_CURSOR);
				
			}
		});
		MenuCadastros.add(mntmDespesas);
		
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
