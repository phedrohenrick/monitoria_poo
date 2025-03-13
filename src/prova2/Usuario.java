package prova2;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nome;
    private Item item;
    private List<Emprestimo> emprestimos = new ArrayList<>();
    
    public Item getItem() {
        return item;
    }
    public void setItem(Item item) {
        this.item = item;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Usuario(String nome, Item item){
        this.item = item;
        this.nome = nome;
    }
    public Usuario(String nome){
        this.nome = nome;
    }

    public void addEmprestimo(Item item){
        this.emprestimos.add(new Emprestimo(this, item));
        System.out.println(this.nome + " pegou emprestado: " + this.emprestimos.get(0));
    }

}
