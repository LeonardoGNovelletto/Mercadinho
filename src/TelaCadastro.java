import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;



public class TelaCadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfCusto;
	private JTextField tfVenda;
	private JTextField tfQnt;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					TelaCadastro frame = new TelaCadastro();
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
	public TelaCadastro() {
		
		setTitle("Cadastro de Produtos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNome.setBounds(25, 39, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblCusto = new JLabel("Custo");
		lblCusto.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCusto.setBounds(25, 64, 46, 14);
		contentPane.add(lblCusto);
		
		JLabel lblVenda = new JLabel("Venda");
		lblVenda.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblVenda.setBounds(25, 89, 46, 14);
		contentPane.add(lblVenda);
		
		JLabel lblQnt = new JLabel("Quantidade");
		lblQnt.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblQnt.setBounds(25, 117, 80, 14);
		contentPane.add(lblQnt);
		
		tfNome = new JTextField();
		tfNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfNome.setBounds(81, 38, 86, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		tfCusto = new JTextField();
		tfCusto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfCusto.setColumns(10);
		tfCusto.setBounds(81, 63, 86, 20);
		contentPane.add(tfCusto);
		
		tfVenda = new JTextField();
		tfVenda.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfVenda.setColumns(10);
		tfVenda.setBounds(81, 88, 86, 20);
		contentPane.add(tfVenda);
		
		tfQnt = new JTextField();
		tfQnt.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfQnt.setColumns(10);
		tfQnt.setBounds(111, 116, 56, 20);
		contentPane.add(tfQnt);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCadastrar.setBounds(61, 161, 110, 23);
		contentPane.add(btnCadastrar);

	}
}