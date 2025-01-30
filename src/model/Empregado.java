package model;

public class Empregado extends Pessoa{
    
    private double imposto;
    private double salarioBase;
    private double codigoSetor;

    public Empregado(String nome, String telefone, String endereco, double imposto, double salarioBase, double CodigoSetor){
        super(nome, telefone, endereco);
        setCodigoSetor(CodigoSetor);
        setImposto(imposto);
        setSalarioBase(salarioBase);
    }
    
    public Empregado() {
    	
    }
    
    public Empregado(String nome, String telefone, String endereco) {
    	
    }

    public double getImposto() {
        return this.imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getCodigoSetor() {
        return this.codigoSetor;
    }

    public void setCodigoSetor(double codigoSetor) {
        this.codigoSetor = codigoSetor;
    }
    
    public double calcularSalario(){
        double salario = 0.0;
        salario = getSalarioBase() - ((getImposto()*getSalarioBase())/100) ;

        return salario;
    }

    @Override
    public String toString() {
        
        return super.toString() + 
        ". Tem um imposto de "+ 
        getImposto()+ "% sobre o salario base, e um salario base de " +
        getSalarioBase() + 
        " seu salario este mês foi de " +
        calcularSalario();
    }
}
