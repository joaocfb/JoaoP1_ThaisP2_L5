package hotel;
/*
 * P2
 * Thaís Nicoly. 115111596. UFCG 2016
 * Classe Animal
 */
public class Animal {
   
   // atributos
   private String nomeAnimal;
   private String tipoAnimal;
   private int idadeAnimal;
   
   // construtor
   public Animal(String nomeAnimal, String tipoAnimal, int idadeAnimal) throws Exception {
       
       testandoNome(nomeAnimal);
       testandoTipo(tipoAnimal);
       testandoIdade(idadeAnimal);
       
       setNome(nomeAnimal);
       setTipo(tipoAnimal);
       setIdade(idadeAnimal);
   }
   
   // metodos do Exception
   public void testandoNome(String nomeAnimal) throws Exception{
       if (nomeAnimal == null || nomeAnimal.trim().equals("")) {
           throw new Exception("Nome de um animal nao pode ser nulo ou vazio");
       }
   }
   public void testandoTipo(String tipoAnimal) throws Exception{
       if (tipoAnimal == null || nomeAnimal.trim().equals(tipoAnimal)) {
           throw new Exception("Tipo de um animal nao pode ser nulo ou vazio");
       }
   }
   public void testandoIdade(int idadeAnimal) throws Exception{
       if (idadeAnimal <= 0) {
           throw new Exception("Idade de um animal nao pode ser abaixo de 0");
       }
   }

   //getters
   public String getNome() {
       return this.nomeAnimal;    
   }
   public String getTipo() {
       return this.tipoAnimal;    
   }
   public int getIdade() {
       return this.idadeAnimal;
       }
   
   // setters 
   public void setNome(String nomeAnimal){
       this.nomeAnimal = nomeAnimal;
   }
   public void setTipo(String tipoAnimal){
       this.tipoAnimal = tipoAnimal;
   }
   public void setIdade(int idadeAnimal){
       this.idadeAnimal = idadeAnimal;
   }
}