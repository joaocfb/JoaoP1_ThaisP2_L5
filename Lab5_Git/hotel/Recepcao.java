// Jo�o Carlos F. 114210795. UFCG 2016
package hotel;
import java.util.ArrayList;

public class Recepcao {
	private ArrayList<Estadia> estadias;
	
	// Iniciando a classe Estadia feita por P2
	public Recepcao() {
		estadias = new ArrayList<>();
	}
	
	// Construtor
	public void checkIn(
			String nome, String tipo, int idade, int dias, double valor) {
		estadias.Estadia(nome, tipo, idade, dias, valor);
	}
	
	// Construtor
	public void checkOut(String nome) {
		int indice = estadias.indexOf(nome);
		estadias.remove(indice);	
	}
	
	// Metodo que retorna a quantidade de hospedes
	public int getNumDeHospedes() {
		return estadias.size();
	}
	
	// Metodo que retorna o lucro
	public double getLucroTotal() {
		double total;
		for (Estadias estadias2 : estadias) {
			total += estadias.getValor();
		}
		return total;
	}
	
	// toString que mostra todos os dados dos hospedados
	@Override
	public String toString() {
		System.out.println("Estadias:");
		for (Estadia estadias2 : estadias) {
			System.out.printf("%s (%s): %i dias com o pre�o de R$ %.2f",
					estadias2.getNome(), estadias2.getTipo(), estadias2.getDias(), estadias2.getValor());
		}
	}
}
