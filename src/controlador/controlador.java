package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import interfaz.frmMain;
import modelo.preguntas;

public class controlador implements ActionListener {
	static int cont=0;
	static preguntas p = new preguntas();
	public static  void mostrarPreguntas() {
		if (cont<p.listaPreguntas.size())
			frmMain.lblpreguntas.setText(p.listaPreguntas.get(cont));
		
		
		
	

	frmMain.btnSi.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			cont++;
			mostrarPreguntas();
		}
	});
	
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
