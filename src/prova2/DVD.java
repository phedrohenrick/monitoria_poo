package prova2;

public class DVD extends Item {

    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void reproduzir(){
        System.out.println("DVD reproduzindo");
    }

    
    public DVD(String titulo) {
        super(titulo);
    }

    public DVD() {
        super();
    }
}
