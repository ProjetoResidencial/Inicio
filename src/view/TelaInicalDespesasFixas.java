package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class TelaInicalDespesasFixas extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicalDespesasFixas frame = new TelaInicalDespesasFixas();
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
	public TelaInicalDespesasFixas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 519, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMs = new JLabel("M\u00EAs De Refer\u00EAncia:");
		lblMs.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblMs.setBounds(337, 9, 156, 14);
		contentPane.add(lblMs);
		
		JLabel lblAgua = new JLabel("Valor \u00C1gua:");
		lblAgua.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblAgua.setBounds(35, 61, 96, 27);
		contentPane.add(lblAgua);
		
		JLabel lblEnergia = new JLabel("Valor Energia:");
		lblEnergia.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblEnergia.setBounds(27, 105, 104, 14);
		contentPane.add(lblEnergia);
		
		JLabel lblTelefone = new JLabel("Valor Telefone:");
		lblTelefone.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblTelefone.setBounds(27, 151, 104, 14);
		contentPane.add(lblTelefone);
		
		JLabel lblAluguel = new JLabel("Valor Aluguel:");
		lblAluguel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblAluguel.setBounds(27, 193, 104, 14);
		contentPane.add(lblAluguel);
		
		JLabel lblNewLabel = new JLabel("Valor Internet:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(27, 266, 104, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblCondominio = new JLabel("Valor Condominio:");
		lblCondominio.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblCondominio.setBounds(27, 231, 131, 14);
		contentPane.add(lblCondominio);
		
		textField = new JTextField();
		textField.setBounds(339, 34, 154, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(158, 65, 154, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(158, 103, 154, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(158, 149, 154, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(158, 191, 154, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(158, 229, 154, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(158, 264, 154, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnSalvar.setBounds(27, 324, 89, 23);
		contentPane.add(btnSalvar);
		
		JButton btnNewButton = new JButton("Limpar");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(171, 324, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnCancelar.setBounds(320, 324, 104, 23);
		contentPane.add(btnCancelar);
		
		JLabel lblNewLabel_1 = new JLabel("Valores De Despesas Fixas No M\u00EAs.");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(35, 9, 246, 14);
		contentPane.add(lblNewLabel_1);
	}
}
