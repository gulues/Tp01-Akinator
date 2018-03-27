package modelo;

import java.util.ArrayList;
import java.util.Arrays;

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

		boolean[] bol = { true, false, false, false, false, false, true, false };
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
		for (paises paises : listaPaises) {
			if (paises.valores[val]!=valor)
				listaPaises.remove(val);

		}

	}

	@Override
	public String toString() {
		return "paises [pais=" + pais + ", valores=" + Arrays.toString(valores) + "]";
	}

}
