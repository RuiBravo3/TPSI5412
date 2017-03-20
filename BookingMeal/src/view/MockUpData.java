package view;

import java.util.ArrayList;

import model.Cliente;
import model.Restaurante;


public class MockUpData {
	public static Cliente vac= new Cliente("Rui","Barreiro","ruibravo@gmail.com","123456789");
	public static Restaurante con = new Restaurante("nome","morada","contacto","especialidade");
	public static ArrayList<Cliente> ALClie = new ArrayList<Cliente>();
	public static ArrayList<Restaurante> ALRest = new ArrayList<Restaurante>();
	
	public static void fillData() {
		ALClie.add(vac);
		ALRest.add(con);
	}
}