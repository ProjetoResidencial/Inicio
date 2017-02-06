package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class TelaInicialCadastroResidencia extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JLabel lblComplemento;
	private JTextField textField_8;
	private JButton btnSalvvar;
	private JButton btnNewButton;
	private JButton btnCancelar;
	private JLabel lblCadastroDeResidncia;

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

	/**
	 * Create the frame.
	 */
	public TelaInicialCadastroResidencia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 552, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCidade = new JLabel("Cidade: ");
		lblCidade.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblCidade.setBounds(10, 64, 77, 14);
		contentPane.add(lblCidade);
		
		textField = new JTextField();
		textField.setBounds(97, 62, 298, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblEndereo.setBounds(10, 100, 60, 14);
		contentPane.add(lblEndereo);
		
		textField_1 = new JTextField();
		textField_1.setBounds(83, 98, 312, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(432, 98, 52, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblN = new JLabel("N\u00BA");
		lblN.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblN.setBounds(403, 100, 19, 14);
		contentPane.add(lblN);
		
		JLabel lblCep = new JLabel("Cep:");
		lblCep.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblCep.setBounds(20, 134, 46, 14);
		contentPane.add(lblCep);
		
		textField_3 = new JTextField();
		textField_3.setBounds(69, 129, 157, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblTipoDeResidencia = new JLabel("Tipo De Residencia:");
		lblTipoDeResidencia.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTipoDeResidencia.setBounds(10, 177, 141, 14);
		contentPane.add(lblTipoDeResidencia);
		
		textField_4 = new JTextField();
		textField_4.setBounds(161, 175, 333, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblResidenciaPropria = new JLabel("Resid\u00EAncia Propria ? :");
		lblResidenciaPropria.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblResidenciaPropria.setBounds(10, 216, 144, 14);
		contentPane.add(lblResidenciaPropria);
		
		textField_5 = new JTextField();
		textField_5.setBounds(161, 214, 333, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNomeDoPredio = new JLabel("Nome Do Pr\u00EAdio:");
		lblNomeDoPredio.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNomeDoPredio.setBounds(17, 252, 112, 14);
		contentPane.add(lblNomeDoPredio);
		
		textField_6 = new JTextField();
		textField_6.setBounds(161, 250, 333, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNomeDoCondominio = new JLabel("Nome Do Condominio:");
		lblNomeDoCondominio.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNomeDoCondominio.setBounds(10, 293, 170, 14);
		contentPane.add(lblNomeDoCondominio);
		
		textField_7 = new JTextField();
		textField_7.setBounds(163, 291, 331, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		lblComplemento = new JLabel("Complemento:");
		lblComplemento.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblComplemento.setBounds(237, 129, 94, 14);
		contentPane.add(lblComplemento);
		
		textField_8 = new JTextField();
		textField_8.setBounds(341, 129, 192, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		btnSalvvar = new JButton("Salvar");
		btnSalvvar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSalvvar.setBounds(33, 337, 89, 23);
		contentPane.add(btnSalvvar);
		
		btnNewButton = new JButton("Limpar");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(208, 337, 89, 23);
		contentPane.add(btnNewButton);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnCancelar.setBounds(373, 337, 111, 23);
		contentPane.add(btnCancelar);
		
		lblCadastroDeResidncia = new JLabel("Cadastro De Resid\u00EAncia");
		lblCadastroDeResidncia.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCadastroDeResidncia.setBounds(154, 21, 268, 14);
		contentPane.add(lblCadastroDeResidncia);
	}

}
