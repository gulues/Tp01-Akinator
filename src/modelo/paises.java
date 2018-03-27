package modelo;

import java.util.ArrayList;

public class paises {
	String pais;
	boolean valores[];
	static ArrayList<paises> listaPaises;

	public paises(String pais, boolean[] valores) {
		this.pais = pais;
		this.valores = valores;
	}

	public static ArrayList<paises> crearListaPaises() {
		paises p;

		listaPaises = new ArrayList<paises>();

		// ¿El nombre de su pais termina con una vocal?
		// ¿La bandera de su pais, contiene escudos o estrellas?
		// ¿Su pais tiene costa en el oceano pácifico?
		// ¿Su pais fue campeón mundial de fútbol?
		// ¿La moneda oficial de su pais es el Sol?

		boolean[] arg = { true, false, false, true, false, false, true, false };
		p = new paises("Argentina", arg);
		listaPaises.add(p);

		boolean[] uru = { false, false, false, true, false, false, true, false };
		p = new paises("Uruguay", uru);
		listaPaises.add(p);

		boolean[] bra = { false, true, false, true, false, false, true, false };
		p = new paises("Brasil", bra);
		listaPaises.add(p);

		boolean[] chi = { true, true, true, false, false, false, true, false };
		p = new paises("Chile", chi);
		listaPaises.add(p);

		boolean[] per = { true, true, true, false, true, false, true, false };
		p = new paises("Peru", per);
		listaPaises.add(p);

		boolean[] bol = { true, true, false, false, false, false, true, false };
		p = new paises("Bolvia", bol);
		listaPaises.add(p);

		boolean[] par = { false, true, false, false, false, false, true, false };
		p = new paises("Paraguay", par);
		listaPaises.add(p);

		boolean[] col = { true, false, true, false, false, false, true, false };
		p = new paises("Colombia", col);
		listaPaises.add(p);

		boolean[] ecu = { false, true, true, false, false, false, true, false };
		p = new paises("Ecuador", ecu);
		listaPaises.add(p);
		return listaPaises;

	}


	public static void filtrarPaises(boolean valor, int val) {
		int i;
		for (i = 0; i < listaPaises.size(); i++) {
			if (listaPaises.get(i).valores[val] != valor) {
				listaPaises.remove(i);
//				if (i > 0)
					i--;
			}
		}

	}
	@Override
	public String toString() {
		return pais;
	}

}
