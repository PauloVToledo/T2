package org.example;

import java.util.ArrayList;

public class CuadernoUniversitario {
	private ArrayList<Hoja> hojas = new ArrayList<Hoja>();

	public void escribir(Hoja hoja, String contenido) {
		if (hojas.contains(hoja)) {
			hoja.setContenido(contenido);
		}
	}

	public Hoja eliminarHoja(Hoja hoja) {
		Hoja hojaEliminada = null;

		if (hojas.contains(hoja)) {
			hojaEliminada = hoja;
			hojas.remove(hoja);
		}

		return hojaEliminada;
	}

	public ArrayList<Hoja> buscarHoja(String titulo) {
		ArrayList<Hoja> hojasEncontradas = new ArrayList<Hoja>();

		for (Hoja hoja : hojas) {
			if (hoja.getTitulo().equalsIgnoreCase(titulo)) {
				hojasEncontradas.add(hoja);
			}
		}

		return hojasEncontradas;
	}

	public void agregarHoja(Hoja hoja) {
		hojas.add(hoja);
	}
}
