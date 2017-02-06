package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;

public class TelaInicialCadastroPessoa extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblRg;
	private JLabel lblCpf;
	private JLabel lblIdade;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JLabel lblDataNascimento;
	private JTextField textField_8;
	private JLabel lblCadastroDePessoa;

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
		setBounds(100, 100, 543, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNome.setBounds(24, 54, 55, 14);
		contentPane.add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(90, 52, 298, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Estado Civil:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel.setBounds(14, 182, 80, 14);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(104, 180, 287, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblCidade.setBounds(24, 140, 46, 14);
		contentPane.add(lblCidade);
		
		textField_2 = new JTextField();
		textField_2.setBounds(90, 138, 298, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblEndereo.setBounds(21, 93, 80, 14);
		contentPane.add(lblEndereo);
		
		textField_3 = new JTextField();
		textField_3.setBounds(90, 91, 287, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblN = new JLabel("N\u00BA:");
		lblN.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblN.setBounds(387, 93, 37, 14);
		contentPane.add(lblN);
		
		textField_4 = new JTextField();
		textField_4.setBounds(421, 91, 46, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		lblRg = new JLabel("Rg:");
		lblRg.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblRg.setBounds(51, 210, 28, 20);
		contentPane.add(lblRg);
		
		lblCpf = new JLabel("Cpf:");
		lblCpf.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblCpf.setBounds(237, 213, 55, 14);
		contentPane.add(lblCpf);
		
		lblIdade = new JLabel("Idade:");
		lblIdade.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblIdade.setBounds(39, 254, 55, 14);
		contentPane.add(lblIdade);
		
		textField_5 = new JTextField();
		textField_5.setBounds(90, 300, 147, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(90, 211, 125, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(279, 211, 125, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		lblDataNascimento = new JLabel("Data Nasc.");
		lblDataNascimento.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblDataNascimento.setBounds(14, 302, 80, 14);
		contentPane.add(lblDataNascimento);
		
		textField_8 = new JTextField();
		textField_8.setBounds(90, 252, 86, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnSalvar.setBounds(76, 363, 89, 23);
		contentPane.add(btnSalvar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnLimpar.setBounds(219, 363, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnCancelar.setBounds(360, 363, 89, 23);
		contentPane.add(btnCancelar);
		
		lblCadastroDePessoa = new JLabel("Cadastro De Pessoa");
		lblCadastroDePessoa.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCadastroDePessoa.setBounds(145, 11, 222, 30);
		contentPane.add(lblCadastroDePessoa);
	}
}
