package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clase.TrianguloRectangulo;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtCat1;
	private JTextField txtCat2;
	private JButton btnNewButton;
	private JButton btnHipotenusa;
	private JButton btnLimpiar;
	private JTextArea txtS;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V1 frame = new V1();
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
	public V1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 251, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Cateto 1:");
			lblNewLabel.setBounds(10, 26, 60, 12);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("Cateto 2:");
			lblNewLabel_1.setBounds(10, 58, 60, 12);
			contentPane.add(lblNewLabel_1);
		}
		{
			txtCat1 = new JTextField();
			txtCat1.setBounds(80, 23, 54, 18);
			contentPane.add(txtCat1);
			txtCat1.setColumns(10);
		}
		{
			txtCat2 = new JTextField();
			txtCat2.setBounds(80, 55, 54, 18);
			contentPane.add(txtCat2);
			txtCat2.setColumns(10);
		}
		{
			btnNewButton = new JButton("Area");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(20, 81, 85, 25);
			contentPane.add(btnNewButton);
		}
		{
			btnHipotenusa = new JButton("Hipotenusa");
			btnHipotenusa.addActionListener(this);
			btnHipotenusa.setBounds(124, 81, 87, 25);
			contentPane.add(btnHipotenusa);
		}
		{
			btnLimpiar = new JButton("Limpiar");
			btnLimpiar.addActionListener(this);
			btnLimpiar.setBounds(138, 20, 73, 25);
			contentPane.add(btnLimpiar);
		}
		{
			txtS = new JTextArea();
			txtS.setBounds(20, 154, 191, 284);
			contentPane.add(txtS);
		}
		{
			btnNewButton_1 = new JButton("Perimetro");
			btnNewButton_1.addActionListener(this);
			btnNewButton_1.setBounds(18, 117, 87, 23);
			contentPane.add(btnNewButton_1);
		}

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_1) {
			do_btnNewButton_1_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
		if (e.getSource() == btnHipotenusa) {
			do_btnHipotenusa_actionPerformed(e);
		}
		if (e.getSource() == btnLimpiar) {
			do_btnLimpiar_actionPerformed(e);
		}
	}
	protected void do_btnLimpiar_actionPerformed(ActionEvent e) {
	txtCat1.setText("");
	txtCat2.setText("");
	txtS.setText("");
	}
	protected void do_btnHipotenusa_actionPerformed(ActionEvent e) {
	double cateto1=Double.parseDouble(txtCat1.getText());
	double cateto2=Double.parseDouble(txtCat2.getText());
	TrianguloRectangulo t=new TrianguloRectangulo(cateto1, cateto2);
	Imprimir("La hipotenusa es: "+t.hipotenusa());
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
	double cateto1=Double.parseDouble(txtCat1.getText());
	double cateto2=Double.parseDouble(txtCat2.getText());
	TrianguloRectangulo t=new TrianguloRectangulo(cateto1, cateto2);
	Imprimir("El cateto 1 es: "+t.getCateto1());
	Imprimir("El cateto 2 es: "+t.getCateto2());
	Imprimir("El area es: "+t.area());
	}
	void Imprimir (String s) {
		txtS.append(s+"\n");
	}
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
		double cateto1=Double.parseDouble(txtCat1.getText());
		double cateto2=Double.parseDouble(txtCat2.getText());
		TrianguloRectangulo t=new TrianguloRectangulo(cateto1, cateto2);
		Imprimir("El perimetro es: "+t.perimetro());
	}
}	