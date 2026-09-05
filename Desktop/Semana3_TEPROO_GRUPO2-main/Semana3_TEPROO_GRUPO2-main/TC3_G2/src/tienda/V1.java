package tienda;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class V1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtCod;
	private JTextField txtPre;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField txtPro;
	private JTextField txtStock;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JScrollPane scrollPane;
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
		setBounds(100, 100, 506, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Codigo:");
			lblNewLabel.setBounds(22, 10, 44, 12);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("Precio:");
			lblNewLabel_1.setBounds(22, 46, 44, 12);
			contentPane.add(lblNewLabel_1);
		}
		{
			txtCod = new JTextField();
			txtCod.setBounds(63, 7, 96, 18);
			contentPane.add(txtCod);
			txtCod.setColumns(10);
		}
		{
			txtPre = new JTextField();
			txtPre.setBounds(63, 43, 96, 18);
			contentPane.add(txtPre);
			txtPre.setColumns(10);
		}
		{
			lblNewLabel_2 = new JLabel("Producto:");
			lblNewLabel_2.setBounds(198, 13, 44, 12);
			contentPane.add(lblNewLabel_2);
		}
		{
			lblNewLabel_3 = new JLabel("Stock:");
			lblNewLabel_3.setBounds(198, 46, 44, 12);
			contentPane.add(lblNewLabel_3);
		}
		{
			txtPro = new JTextField();
			txtPro.setBounds(252, 10, 96, 18);
			contentPane.add(txtPro);
			txtPro.setColumns(10);
		}
		{
			txtStock = new JTextField();
			txtStock.setBounds(252, 43, 96, 18);
			contentPane.add(txtStock);
			txtStock.setColumns(10);
		}
		{
			btnNewButton = new JButton("Reportar");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(10, 86, 73, 20);
			contentPane.add(btnNewButton);
		}
		{
			btnNewButton_1 = new JButton("Adicionar");
			btnNewButton_1.setBounds(93, 86, 84, 20);
			contentPane.add(btnNewButton_1);
		}
		{
			btnNewButton_2 = new JButton("Elimminar");
			btnNewButton_2.setBounds(187, 86, 79, 20);
			contentPane.add(btnNewButton_2);
		}
		{
			btnNewButton_3 = new JButton("Buscar");
			btnNewButton_3.setBounds(276, 86, 72, 20);
			contentPane.add(btnNewButton_3);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(20, 116, 370, 120);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}	
		
		JButton btnNewButton_4 = new JButton("Modificar");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(358, 85, 89, 23);
		contentPane.add(btnNewButton_4);
		Listado();
	}
	ArregloProducto ap=new ArregloProducto();
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		try {
			txtS.setText("");
			Listado();
			Imprimir("");
			Imprimir("Cantidad de productos: "+ap.Tamaño());
			Imprimir("Valor total del inventario: "+ap.TotalInventario());
			
		} catch (Exception e2) {
			MostrarError();
		}
	}
	void Imprimir (String s) {		
		txtS.append(s+"\n");
	}
	void Listado() {
		Imprimir("Codigo\tProducto\tPrecio\tStock\tImporte");
		for(int i=0;i<ap.Tamaño();i++) {
			Producto p=ap.Obtener(i);
			Imprimir(p.getCod()+"\t"+p.getDes()+"\t"+p.getPre()+"\t"+p.getStock()+"\t"+p.Importe());
		}
	}
	void MostrarError() {
		JOptionPane.showMessageDialog(this, "Error, Datos incorrectos");
	}
}
