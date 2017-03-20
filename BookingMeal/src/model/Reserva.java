package model;

/* Não consegui fazer o programa como queria, a minha intenção era que quando fosse criada cada
 * reserva conseguisse atribuir inicialmente um cliente e um restaurante, e depois inserir as restantes 
 * variáveis... 
 * 
 */


public class Reserva {
		private String nome,
					   restaurante,
					   hora,
					   pessoas,
					   mesa,
					   pratos;

		public Reserva(String nome, String restaurante, String hora, String pessoas, String mesa, String pratos) {
			super();
			this.nome = nome;
			this.restaurante = restaurante;
			this.hora = hora;
			this.pessoas = pessoas;
			this.mesa = mesa;
			this.pratos = pratos;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getRestaurante() {
			return restaurante;
		}

		public void setRestaurante(String restaurante) {
			this.restaurante = restaurante;
		}

		public String getHora() {
			return hora;
		}

		public void setHora(String hora) {
			this.hora = hora;
		}

		public String getPessoas() {
			return pessoas;
		}

		public void setPessoas(String pessoas) {
			this.pessoas = pessoas;
		}

		public String getMesa() {
			return mesa;
		}

		public void setMesa(String mesa) {
			this.mesa = mesa;
		}

		public String getPratos() {
			return pratos;
		}

		public void setPratos(String pratos) {
			this.pratos = pratos;
		}
		
}
		
