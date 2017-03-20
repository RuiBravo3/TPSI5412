package controller;

import java.util.ArrayList;



import model.Cliente;

public class GestorCliente {

	ArrayList<Cliente> ARCliente;
	
	public GestorCliente() {
		this.ARCliente=new ArrayList<Cliente>();
	}
	
	public void addCliente(String nome, String morada, String email, String telefone) {
		Cliente c=new Cliente(nome, morada, email, telefone);
		int novoID=ARCliente.size();
		
		c.setId(novoID);
		
		ARCliente.add(c);
	}
	

	public void addClient(Cliente c) {
		int novoId = ARCliente.size();
		
		c.setId(novoId);
		
		ARCliente.add(c);
	}
	
	
	//criar classe extra no controller para isto??
	public Cliente getCliente(int id) {
		
		for (Cliente c: ARCliente) {
			if (c.getId()==id)
				return c;
		}
		
		return null;
	}
	
}


