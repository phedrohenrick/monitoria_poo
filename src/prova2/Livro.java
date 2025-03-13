package prova2;

public class Livro extends Item {

    private String autor;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Livro(String titulo) {
        super(titulo);
    }
    public Livro() {
        super();
    }

    public void abrir(){
        System.out.println("Livro aberto");
    }

}
