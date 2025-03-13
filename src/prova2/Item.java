package prova2;

public abstract class Item implements InformacaoItem,ItemBiblioteca{

    private String titulo;
    private Boolean emprestado = false;

   
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Boolean getEmprestado() {
        return emprestado;
    }

    public void setEmprestado(Boolean emprestado) {
        this.emprestado = emprestado;
    }

    public Item(String titulo, Boolean emprestado) {
        this.titulo = titulo;
        this.emprestado = emprestado;
    }

    public Item(String titulo) {
        this.titulo = titulo;
    }

    public Item() {

    }
    
    @Override
    public void emprestar() throws Exceptiont {
        
        if (this.emprestado) {
            throw new Exceptiont("Item já emprestado");
        }
        this.emprestado = true;
        Biblioteca b = new Biblioteca();
        b.emprestarItem();
    }

    public void devolver() throws Exceptiont {
        if (!this.emprestado) {
            throw new Exceptiont("Item não emprestado");
        }
        this.emprestado = false;
        Biblioteca b = new Biblioteca();
        b.devolverItem();
    }

    public void getInformacao() {
        System.out.println("Titulo: " + this.titulo + (this.emprestado ? " (Emprestado)" : " (Disponível)"));
    }
    
}
