package interfaz;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.controlador;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmMain extends JFrame {
	public static JLabel lblpreguntas;
	public static JButton btnSi;
	public static JButton btnNo;
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmMain frame = new frmMain();
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
	public frmMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblpreguntas = new JLabel("");
		lblpreguntas.setBounds(28, 47, 326, 118);
		contentPane.add(lblpreguntas);
		
		btnSi = new JButton("SI");
		
		btnSi.setBounds(55, 199, 89, 23);
		contentPane.add(btnSi);
		
		JButton btnNo = new JButton("NO");
		btnNo.setBounds(165, 199, 89, 23);
		contentPane.add(btnNo);
		controlador.mostrarPreguntas();
	}
}
