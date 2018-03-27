package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

import controlador.controlador;

import javax.swing.JLabel;
import javax.swing.JButton;

public class frmMain extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
					frame.setBounds(100, 100, 460, 414);
					frame.setLocationRelativeTo(null);
					frame.setTitle("Akinator Paises");
					frame.setResizable(false);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.getContentPane().setLayout(null);
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
		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e1) {
			e1.printStackTrace();
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblpreguntas = new JLabel("");
		lblpreguntas.setBounds(28, 47, 326, 118);
		contentPane.add(lblpreguntas);
		
		btnSi = new JButton("SI");
		
		btnSi.setBounds(106, 238, 89, 23);
		contentPane.add(btnSi);
		
		JButton btnNo = new JButton("NO");
		btnNo.setBounds(239, 238, 89, 23);
		contentPane.add(btnNo);
		//controlador.crearListaPaises();
		controlador.mostrarPreguntas();
		
	}
}
