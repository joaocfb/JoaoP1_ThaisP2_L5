// Joao Carlos F. 114210795. UFCG 2016
package hotel;
import java.util.ArrayList;

public class Recepcao {
	private ArrayList<Estadia> estadias;
	private Estadia estadia;
	
	// Iniciando o atributo da classe
	public Recepcao(){
		estadias = new ArrayList<Estadia>();
	}
	

	// Construtor
	public void checkIn(
			String nome, String tipo, int idade, int dias, double valor) {
		this.estadia = new Estadia(nome, tipo, idade, dias, valor);
		estadias.add(this.estadia);
	}
	

	// Construtor
	public void checkOut(String nome) {
		int indice = estadias.indexOf(nome);
		this.estadias.remove(indice);
	}
	
	// Metodo que retorna a quantidade de hospedes
	public int getNumDeHospedes() {
		return this.estadias.size();
	}
	
	// Metodo que retorna o lucro
	public double getLucroTotal() {
		double total = 0;
		for (Estadia estadia : estadias) {
			total += estadia.getValor();
		}
		return total;
	}
	
	// toString que mostra todos os dados dos hospedados
	@Override
	public String toString() {
		StringBuilder listaestadias = new StringBuilder();
		listaestadias.append("Estadias:/n");
		for (Estadia estadias2 : estadias) {
			listaestadias.append(estadias2.getNome());
			listaestadias.append(" (" + estadias2.getTipo() + "): ");
			listaestadias.append(estadias2.getDias()); 
			listaestadias.append(" dias com o preço de R$ "); 
			listaestadias.append(estadias2.getValor());
			listaestadias.append("/n");
		}
		return listaestadias.toString();
	}
}
