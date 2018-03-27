package modelo;

import java.util.ArrayList;

public class paises {
	String pais;
	boolean valores[];

	public paises(String pais, boolean[] valores) {
		this.pais = pais;
		this.valores = valores;
	}
	
	public static ArrayList<paises> crearListaPaises(){
		paises p ;
		ArrayList<paises> listaPaises= new ArrayList<paises>();
		
		
		boolean[] arg= {true,false, false, true, false, false, true ,false};
		p = new paises("Argentina", arg);
		listaPaises.add(p) ;
		
		boolean[] uru= {false,false, false, true, false, false, true ,false};
		p = new paises("Uruguay", uru);
		listaPaises.add(p) ;
		
		boolean[] bra= {false,true, false, true, false, false, true ,false};
		p = new paises("Brasil", bra);
		listaPaises.add(p) ;

		boolean[] chi= {true,true, true, false, false, false, true ,false};
		p = new paises("Chile", chi);
		listaPaises.add(p) ;
		
		
		boolean[] per= {true,true, true, false, true, false, true ,false};
		p = new paises("Peru", per);
		listaPaises.add(p) ;
		
		
		boolean[] bol= {true,false, false, false, false, false, true ,false};
		p = new paises("Bolvia", bol);
		listaPaises.add(p) ;
		
		
		boolean[] par= {false,true, false, false, false, false, true ,false};
		p = new paises("Paraguay", par);
		listaPaises.add(p) ;
		
		boolean[] col= {true,false, true, false, false, false, true ,false};
		p = new paises("Colombia", col);
		listaPaises.add(p) ;
		
		boolean[] ecu= {false,true, true, false, false, false, true ,false};
		p = new paises("Ecuador", ecu);
		listaPaises.add(p) ;
		return listaPaises;
		
		
		
		
	}
	

}
