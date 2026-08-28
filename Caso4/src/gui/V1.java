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
	private JTextArea txtS;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Cateto 1:");
			lblNewLabel.setBounds(10, 26, 44, 12);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("Cateto 2:");
			lblNewLabel_1.setBounds(10, 58, 44, 12);
			contentPane.add(lblNewLabel_1);
		}
		{
			txtCat1 = new JTextField();
			txtCat1.setBounds(64, 23, 96, 18);
			contentPane.add(txtCat1);
			txtCat1.setColumns(10);
		}
		{
			txtCat2 = new JTextField();
			txtCat2.setBounds(64, 55, 96, 18);
			contentPane.add(txtCat2);
			txtCat2.setColumns(10);
		}
		{
			btnNewButton = new JButton("Procesar");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(198, 22, 84, 20);
			contentPane.add(btnNewButton);
		}
		{
			txtS = new JTextArea();
			txtS.setBounds(10, 80, 416, 173);
			contentPane.add(txtS);
		}

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
	double cateto1=Double.parseDouble(txtCat1.getText());
	double cateto2=Double.parseDouble(txtCat2.getText());
	TrianguloRectangulo t=new TrianguloRectangulo(cateto1, cateto2);
	Imprimir("El cateto 1 es: "+t.getCateto1());
	Imprimir("El cateto 2 es: "+t.getCateto2());
	Imprimir("El area es: "+t.area());
	Imprimir("La hipotenusa 1 es: "+t.hipotenusa());
	Imprimir("El perimetro es: "+t.perimetro());
	}
	void Imprimir (String s) {
		txtS.append(s+"\n");
	}
}
