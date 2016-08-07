// Jo�o Carlos F. 114210795. UFCG 2016
package hotel;

public class Hotel {
	private Recepcao recepcao;
	
	// Iniciando a classe Recepcao feita por P1
	public Hotel() {
		recepcao = new Recepcao();
	}
	
	// Construtor que se utiliza dos metodos de Recepcao
	public void checkIn(String nome, String tipo,int idade, int dias, double valor) {
		this.recepcao.checkIn(nome, tipo, idade, dias, valor);
	}
	
	// Construtor que se utiliza dos metodos de Recepcao
	public void checkOut(String nome) {
		this.recepcao.checkOut(nome);
	}
	
	// Utiliza o metodo getNumDeHospedes de Recepcao
	public int getNumDeHospedes() {
		return this.recepcao.getNumDeHospedes();
	}
	
	// Utiliza o metodo getLucroTotal de Recepcao
	public double getLucroTotal() {
		return this.recepcao.getLucroTotal();
	}

	// Utiliza o toString de Recepcao
	@Override
	public String toString() {
		return this.recepcao.toString();
	}
}
