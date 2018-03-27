package controlador;


import java.util.ArrayList;

import javax.swing.JFrame;



import interfaz.frmMain;
import modelo.paises;
import modelo.preguntas;

public class controlador {
	JFrame parent;
	static int cont=0;
	static preguntas preg = new preguntas();
	static paises pais;
	static ArrayList<paises> p = paises.crearListaPaises();
	
	public static  void mostrarPreguntas() {
		if (cont<preg.listaPreguntas.size())
			frmMain.lblpreguntas.setText(preg.listaPreguntas.get(cont));
		else
			frmMain.lblpreguntas.setText("Su pais es: "+ p.get(0));
	
}


	public static void actionPerformed(boolean SiNo) {
		cont++;
		mostrarPreguntas();
		paises.filtrarPaises(SiNo, cont-1);
		System.out.println(p.toString());// TODO Auto-generated method stub
		if(p.size()==1) {
			pais=p.get(0);
			frmMain.lblpreguntas.setText("Su pais es: "+ pais);
			frmMain.btnNo.setEnabled(false);	
			frmMain.btnSi.setEnabled(false);
		}
			
	}
}
