package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import interfaz.frmMain;
import modelo.paises;
import modelo.preguntas;

public class controlador implements ActionListener {
	static int cont=0;
	static preguntas preg = new preguntas();
	static ArrayList<paises> p = paises.crearListaPaises();
	
	public static  void mostrarPreguntas() {
		if (cont<preg.listaPreguntas.size())
			frmMain.lblpreguntas.setText(preg.listaPreguntas.get(cont));
		
		
		
	

	frmMain.btnSi.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			cont++;
			mostrarPreguntas();
			paises.filtrarPaises(true, cont-1);
			
			
		}

	});
	
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
