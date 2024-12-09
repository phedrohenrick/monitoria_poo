package Questao3;

import Questao1.Pessoa;

public class Empregado extends Pessoa{
    
    private int imposto;
    private double salarioBase;
    private double codigoSetor;

    public Empregado(String nome, int idade, int cpf, int imposto, double salarioBase, double CodigoSetor){
        super(nome, idade, cpf);
        setCodigoSetor(CodigoSetor);
        setImposto(imposto);
        setSalarioBase(salarioBase);
    }

    public int getImposto() {
        return this.imposto;
    }

    public void setImposto(int imposto) {
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
