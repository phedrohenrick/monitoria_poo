package Questao1;

public class Pessoa {
    
    public static final String getendereco = null;
    private String nome;
    private String endereco;
    private String telefone;

    public Pessoa(String nome, String endereco, String telefone){
        setNome(nome);
        setEndereco(endereco);
        setTelefone(telefone);
    }
    
    public Pessoa() {
    	
    }

    public String getNome(){
       return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEndereco(){
        return endereco;
     }
 
     public void setEndereco(String endereco){
         this.endereco = endereco;
     }
     
     public String getTelefone(){
        return telefone;
     }
 
     public void setTelefone(String telefone){
         this.telefone = telefone;
     }

   @Override
   public String toString() {
       return super.toString() + " Nome: "+ 
       getNome() + 
        " endereço: "+ 
       getEndereco() +
        " e telefone : "+ 
       getTelefone();
   }

}
