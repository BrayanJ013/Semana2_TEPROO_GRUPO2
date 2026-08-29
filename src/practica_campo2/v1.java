package practica_campo2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class v1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnSalir;
	private JTextArea txtS;
	private JTextField txtCat1;
	private JTextField txtCat2;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					v1 frame = new v1();
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
	public v1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 318, 570);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			btnNewButton = new JButton("limpiar");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(191, 24, 98, 23);
			contentPane.add(btnNewButton);
		}
		{
			btnNewButton_1 = new JButton("Hipotenusa");
			btnNewButton_1.setBounds(191, 100, 89, 23);
			contentPane.add(btnNewButton_1);
		}
		{
			btnNewButton_2 = new JButton("Area");
			btnNewButton_2.addActionListener(this);
			btnNewButton_2.setBounds(33, 100, 89, 23);
			contentPane.add(btnNewButton_2);
		}
		{
			btnNewButton_3 = new JButton("Perimetro");
			btnNewButton_3.setBounds(33, 134, 89, 23);
			contentPane.add(btnNewButton_3);
		}
		{
			btnSalir = new JButton("Salir");
			btnSalir.addActionListener(this);
			btnSalir.setBounds(191, 134, 89, 23);
			contentPane.add(btnSalir);
		}
		{
			txtS = new JTextArea();
			txtS.setBounds(10, 175, 276, 345);
			contentPane.add(txtS);
		}
		{
			txtCat1 = new JTextField();
			txtCat1.setBounds(75, 25, 86, 20);
			contentPane.add(txtCat1);
			txtCat1.setColumns(10);
		}
		{
			txtCat2 = new JTextField();
			txtCat2.setBounds(75, 56, 86, 20);
			contentPane.add(txtCat2);
			txtCat2.setColumns(10);
		}
		{
			lblNewLabel = new JLabel("Cateto 1:");
			lblNewLabel.setBounds(10, 28, 46, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("Cateto 2:");
			lblNewLabel_1.setBounds(10, 59, 46, 14);
			contentPane.add(lblNewLabel_1);
		}

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSalir) {
			do_btnSalir_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton_2) {
			do_btnNewButton_2_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
	}
	protected void do_btnNewButton_2_actionPerformed(ActionEvent e) {
	}
	protected void do_btnSalir_actionPerformed(ActionEvent e) {
			System.exit(0);
		
	}
}
