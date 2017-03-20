package controller;

import java.util.ArrayList;
import model.Restaurante;

public class GestorRestaurante {

	ArrayList<Restaurante> ARRestaurante;
	
	public GestorRestaurante() {
		this.ARRestaurante=new ArrayList<Restaurante>();
	}
	
	public void addRest(String nome, String morada, String contacto, String especialidade) {
		Restaurante d=new Restaurante(nome, morada, contacto, especialidade);
		int novoID=ARRestaurante.size();
		
		d.setId(novoID);
		
		ARRestaurante.add(d);
	}

}
