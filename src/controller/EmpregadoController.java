package controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import model.Administrador;
import model.Empregado;
import model.Fornecedor;
import view.TelaEmpregado;
import view.TelaRegistro;
import view.ExibirTabela;

public class EmpregadoController {

    private ArrayList<Empregado> listaEmpregados = new ArrayList<>();
    private ArrayList<Fornecedor> listaFornecedores = new ArrayList<>();
    private Empregado funcionario = new Empregado();
    private TelaEmpregado telaEmpregado;

    public EmpregadoController(TelaEmpregado telaEmpregado){
        
        this.telaEmpregado = telaEmpregado;
        //this.listaFornecedores = listaFornecedores;
        //this.listaEmpregados = listaEmpregados;
       // this.funcionario = TelaEmpregado.getFuncionario();
        initController();
        
    }

    public void initController(){
        telaEmpregado.getBtnSair().addActionListener(e->System.exit(0));
        telaEmpregado.getBtnSalvar().addActionListener(e->
        {
            try {
                handleEmpregado();
            } catch (ExceptionController e1) {
                e1.printStackTrace();
            }
        });
    }

    public Empregado getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Empregado funcionario) {
        this.funcionario = funcionario;
    }
    
    public TelaEmpregado getTelaEmpregado() {
        return telaEmpregado;
    }

    public void setTelaEmpregado(TelaEmpregado telaEmpregado) {
        this.telaEmpregado = telaEmpregado;
    }

    public ArrayList<Empregado> getListaEmpregados() {
        return listaEmpregados;
    }

    public void setListaEmpregados(ArrayList<Empregado> listaEmpregados) {
        this.listaEmpregados = listaEmpregados;
    }

    public ArrayList<Fornecedor> getListaFornecedores() {
        return listaFornecedores;
    }

    public void setListaFornecedores(ArrayList<Fornecedor> listaFornecedores) {
        this.listaFornecedores = listaFornecedores;
    }


    public void handleEmpregado() throws ExceptionController{
        
            	  
            	   
            	   String campoImpostotxt  = telaEmpregado.getImposto().getText();
            	   String campoSalarioBasetxt = telaEmpregado.getSalarioBase().getText();
            	   String campoCodigoSetortxt = telaEmpregado.getCodigoSetor().getText();
            	   
            	   if (campoImpostotxt.isEmpty()|| campoSalarioBasetxt.isEmpty() || campoCodigoSetortxt.isEmpty())  {
      		            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
      		        }else {
      		        	
      		        	 try {
      		        		double campoImposto  = Double.parseDouble(telaEmpregado.getImposto().getText());
      	                 	double campoSalarioBase = Integer.parseInt(telaEmpregado.getSalarioBase().getText());
      	                 	double campoCodigoSetor = Integer.parseInt(telaEmpregado.getCodigoSetor().getText());
      	      		        	
      	      		        	 if(telaEmpregado.getAdministrador().isSelected()) {
      	      	            		   this.handletelaAdmin(campoImposto,campoSalarioBase, campoCodigoSetor, getFuncionario() ,listaFornecedores, listaEmpregados);
									 }else if(telaEmpregado.getOperario().isSelected()) {
                                        this.handletelaOperario(campoImposto, campoSalarioBase, campoCodigoSetor, funcionario, listaFornecedores, listaEmpregados);      	      	            	   
                                    }else if(telaEmpregado.getVendedor().isSelected()) {
                                        this.handletelaVendedor(campoImposto, campoSalarioBase, campoCodigoSetor, funcionario, listaFornecedores, listaEmpregados);
      	      	            	   }
                  	   }catch (Exception e1) {
       		            
                        throw new ExceptionController("represente o valor decimal usando ponto ");
                       }      		        	
      		        	
      		         }
  
    }
   
    public void handletelaAdmin(double imposto, double salarioBase, double codigoSetor, Empregado funcionario, ArrayList<Fornecedor> listaFornecedor, ArrayList<Empregado> listaEmpregados) {
       
        telaEmpregado.telaAdmin(imposto, salarioBase, codigoSetor, telaEmpregado.getFuncionario());
       
    }

    public void handletelaOperario(double imposto, double salarioBase, double codigoSetor, Empregado funcionario, ArrayList<Fornecedor> listaFornecedor, ArrayList<Empregado> listaEmpregados) {
         
        telaEmpregado.telaOperario(imposto, salarioBase, codigoSetor, funcionario);
    }

    public void handletelaVendedor(double imposto, double salarioBase, double codigoSetor, Empregado funcionario, ArrayList<Fornecedor> listaFornecedor, ArrayList<Empregado> listaEmpregados) {
        
        telaEmpregado.telaVededor(imposto, salarioBase, codigoSetor, funcionario);
    }
        
    

     public void exibirTabela(ArrayList<Fornecedor> listaFornecedores, ArrayList<Empregado> listaEmpregados){
			ExibirTabela a = new ExibirTabela(listaEmpregados, listaFornecedores);
	}

   
    
}
