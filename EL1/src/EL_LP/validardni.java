package EL_LP;

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

public class validardni extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblDni;
	private JTextField txtDni;
	private JButton btnIngresar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					validardni frame = new validardni();
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
	public validardni() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblDni = new JLabel("DNI");
		lblDni.setBounds(63, 48, 46, 14);
		contentPane.add(lblDni);
		
		txtDni = new JTextField();
		txtDni.setBounds(101, 45, 144, 20);
		contentPane.add(txtDni);
		txtDni.setColumns(10);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(this);
		btnIngresar.setBounds(291, 44, 89, 23);
		contentPane.add(btnIngresar);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnIngresar) {
			actionPerformedBtnIngresar(arg0);
		}
	}
	protected void actionPerformedBtnIngresar(ActionEvent arg0) {
		
		
		
		
		
		try {
			int dni= Integer.parseInt(txtDni.getText());
			
			if(dni>9 && dni<7){
				System.out.println("correcto");
			}
			else{
				System.out.println("incorecto");
			}
			JOptionPane.showMessageDialog(null, "correcto");
		} catch (NumberFormatException e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "Formato incorrecto");
		}
	}
	
}
