package hotel;
/*
 * P2
 * Thaís Nicoly. 115111596. UFCG 2016
 * Classe Estadia
 */
public class Estadia {

	// atributos
	private Animal animal;
	private double valor;
	private int qntDias;
	
	// construtor 
	public Estadia(String nome, String tipo, int idade, int qntDias, double valor){
		
		animal.setNome(nome);
		animal.setTipo(tipo);
		animal.setIdade(idade);
		this.valor = valor;
		this.qntDias = qntDias;
	}
	
	// getters
	public String getNome(){
		return animal.getNome();
	}
	public String getTipo(){
		return animal.getTipo();
	}
	public int getIdade(){
		return animal.getIdade();
	}
	public double getValor(){
		return this.valor;
	}
	public int getDias(){
		return this.qntDias;
	}
	
	// toString
	@Override
	public String toString(){
		return getNome() + ", " + getTipo() + ", " + getDias() + " dias com o preco de R$ " + getValor();
	}
}
