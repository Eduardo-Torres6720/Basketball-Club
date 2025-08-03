package br.com.basketballclub.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.basketballclub.model.Usuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerNumberModel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JCadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JCadastro frame = new JCadastro();
					frame.setLocationRelativeTo(null);
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
	public JCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 338);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(106, 11, 264, 277);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(44, 47, 46, 14);
		panel.add(lblNewLabel);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(44, 61, 170, 20);
		panel.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Idade:");
		lblNewLabel_1.setBounds(44, 138, 46, 14);
		panel.add(lblNewLabel_1);
		
		JSpinner spinnerIdade = new JSpinner();
		spinnerIdade.setModel(new SpinnerNumberModel(Integer.valueOf(10), Integer.valueOf(10), null, Integer.valueOf(1)));
		spinnerIdade.setBounds(44, 151, 46, 20);
		panel.add(spinnerIdade);
		
		JLabel lblNewLabel_2 = new JLabel("Tipo da conta:");
		lblNewLabel_2.setBounds(44, 181, 98, 14);
		panel.add(lblNewLabel_2);
		
		JComboBox comboBoxConta = new JComboBox();
		comboBoxConta.setModel(new DefaultComboBoxModel(new String[] {"Jogador", "Organizador"}));
		comboBoxConta.setBounds(44, 194, 120, 22);
		panel.add(comboBoxConta);
		
		JLabel lblNewLabel_3 = new JLabel("Cadastro");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(99, 11, 67, 14);
		panel.add(lblNewLabel_3);
		
		JButton btnNewButtonCadastrar = new JButton("Cadastrar");
		btnNewButtonCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textFieldNome.getText().isEmpty() &&
						!textFieldSenha.getText().isEmpty() &&
						textFieldSenha.getText().length() >= 4) {
					Usuario user = new Usuario(
							textFieldNome.getText(),
							textFieldSenha.getText(),
							(Integer) spinnerIdade.getValue(),
							comboBoxConta.getSelectedItem() == "Organizador"
							);
				} else {
					JOptionPane.showMessageDialog(btnNewButtonCadastrar, "Campos obrigatórios vazios ou inválidos", "Aviso", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButtonCadastrar.setBounds(87, 243, 104, 23);
		panel.add(btnNewButtonCadastrar);
		
		JLabel lblNewLabel_4 = new JLabel("Senha:");
		lblNewLabel_4.setBounds(44, 92, 46, 14);
		panel.add(lblNewLabel_4);
		
		textFieldSenha = new JTextField();
		textFieldSenha.setBounds(44, 106, 170, 20);
		panel.add(textFieldSenha);
		textFieldSenha.setColumns(10);

	}
}
