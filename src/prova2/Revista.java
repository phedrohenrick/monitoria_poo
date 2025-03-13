package prova2;

public class Revista extends Item {

    private String editora;

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
    
    public Revista(String titulo) {
        super(titulo);
    }

    public Revista() {
        super();
    }

}
