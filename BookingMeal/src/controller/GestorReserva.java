package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Cliente;
import model.Reserva;


public class GestorReserva {
	String pesquisa;
	ArrayList<Reserva> ARReserva;
	
	public GestorReserva() {
		this.ARReserva=new ArrayList<Reserva>();
	}
	
	public void addReserva(String nome, String restaurante, String hora, String pessoas, String mesa, String pratos) {
		Reserva e=new Reserva(nome, restaurante, hora, pessoas, mesa, pratos);
		
	}
	
	//(tentativa de) pesquisa dos pratos reservados por restaurante 
	
	public Reserva getReserva (String restaurante, String pratos) {
		Scanner sc = new Scanner(System.in);
		pesquisa=sc.nextLine();
		
		for (Reserva e: ARReserva) {
			if (pesquisa==restaurante)
				return e.pratos /*?????????*/;
	}
	}
	
	
}
