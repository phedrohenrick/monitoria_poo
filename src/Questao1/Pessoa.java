package Questao1;

public class Pessoa {
    
    public static final String getIdade = null;
    private String nome;
    private int idade;
    private long cpf;

    public Pessoa(String nome, int idade, int cpf){
        setNome(nome);
        setIdade(idade);
        setCpf(cpf);
    }

    public String getNome(){
       return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
     }
 
     public void setIdade(int idade){
         this.idade = idade;
     }
     
     public long getCpf(){
        return cpf;
     }
 
     public void setCpf(long cpf){
         this.cpf = cpf;
     }

}
