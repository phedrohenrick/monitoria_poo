package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import controller.EmpregadoController;
import controller.FornecedorController;
import model.Administrador;
import model.Empregado;
import model.Fornecedor;
import model.Operario;
import model.Vendedor;

public class TelaEmpregado extends JFrame{

	private ArrayList<Empregado> listaEmpregados = new ArrayList<>();
    private ArrayList<Fornecedor> listaFornecedores = new ArrayList<>();
	


	private JPanel form = new JPanel();
	private JPanel contratoPanel = new JPanel();
    
    private JTextField imposto = new JTextField();
    private JTextField salarioBase = new JTextField();
    private JTextField codigoSetor = new JTextField();
    

	private JRadioButton administrador = new JRadioButton("Administrador");
	private JRadioButton operario = new JRadioButton("Operario");
    private JRadioButton vendedor = new JRadioButton("Vendedor");
	private ButtonGroup contratoGroup = new ButtonGroup();

	private JPanel panelBotoes = new JPanel();
	private JButton btnSalvar = new JButton("Salvar");
	private JButton btnSair = new JButton("Sair");


	private JTextField ajudaDeCusto = new JTextField();

	private  Empregado funcionario = new Empregado();
		
	public  Empregado getFuncionario() {
			return funcionario;
	}

	public void setFuncionario(Empregado funcionario) {
		this.funcionario = funcionario;
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

	public JPanel getForm() {
		return form;
	}

	public void setForm(JPanel form) {
		this.form = form;
	}
	public JTextField getImposto() {
		return imposto;
	}

	public void setImposto(JTextField imposto) {
		this.imposto = imposto;
	}

	public JTextField getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(JTextField salarioBase) {
		this.salarioBase = salarioBase;
	}

	public JTextField getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(JTextField codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public JRadioButton getAdministrador() {
		return administrador;
	}

	public void setAdministrador(JRadioButton administrador) {
		this.administrador = administrador;
	}

	public JRadioButton getOperario() {
		return operario;
	}

	public void setOperario(JRadioButton operario) {
		this.operario = operario;
	}

	public JRadioButton getVendedor() {
		return vendedor;
	}

	public void setVendedor(JRadioButton vendedor) {
		this.vendedor = vendedor;
	}

	public JButton getBtnSalvar() {
		return btnSalvar;
	}

	public void setBtnSalvar(JButton btnSalvar) {
		this.btnSalvar = btnSalvar;
	}

	public JButton getBtnSair() {
		return btnSair;
	}

	public void setBtnSair(JButton btnSair) {
		this.btnSair = btnSair;
	}



        public TelaEmpregado(Empregado funcionario, ArrayList<Fornecedor> listaFornecedores, ArrayList<Empregado> listaEmpregados){
			
			this.funcionario = funcionario;
			this.listaFornecedores = listaFornecedores;
			this.listaEmpregados = listaEmpregados;

			setTitle("Registro de Empregado");
	        setSize(700, 500);
	        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        setLocationRelativeTo(null);
	        
	        
	       		form.setLayout(new GridLayout(8,6,5,5));
	        
	            form.add(new JLabel("Contrato:"));
		        contratoGroup.add(administrador);
		        contratoGroup.add(operario);
	            contratoGroup.add(vendedor);
		        contratoPanel.add(administrador);
		        contratoPanel.add(operario);
	            contratoPanel.add(vendedor);
		        form.add(contratoPanel);
   
               form.add(new JLabel("Imposto (em %) : "));
               form.add(imposto);
   
               form.add(new JLabel("Salário base: "));
               form.add(salarioBase);
               
               form.add(new JLabel("Código do setor: "));
               form.add(codigoSetor);

               add(form, BorderLayout.CENTER);

             // Botões
               panelBotoes.add(btnSalvar);
               panelBotoes.add(btnSair);
               form.add(panelBotoes);
			   setVisible(true);


			   EmpregadoController empregadoController = new EmpregadoController(this);
        }

		
		
		public void telaAdmin(double imposto, double salarioBase, double codigoSetor, Empregado funcionario) {
        	

        	JTextField ajudaDeCusto = new JTextField();
        	setTitle("Criar administrador");
 	        setSize(700, 500);
 	        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
 	        setLocationRelativeTo(null);
	        form.setLayout(new GridLayout(8,6,5,5));

 	       form.add(new JLabel("Ajuda de custo de:"));
 	       form.add(ajudaDeCusto);
           add(form, BorderLayout.CENTER);

           
 	       form.add(btnSalvar);
 	       form.add(panelBotoes, BorderLayout.SOUTH);
 	       setVisible(true);
 	       
 	      
           
 	       btnSalvar.addActionListener(e -> {
 	    	  int campoAjudaDeCusto  = Integer.parseInt(ajudaDeCusto.getText());
 	    	  Administrador funcionario1 = new Administrador();
 	    	  funcionario1.setNome(funcionario.getNome());
 	    	  funcionario1.setEndereco(funcionario.getEndereco());
 	    	  funcionario1.setTelefone(funcionario.getTelefone());
 	    	  funcionario1.setImposto(imposto);
 	    	  funcionario1.setSalarioBase(salarioBase);
 	    	  funcionario1.setCodigoSetor(codigoSetor);
 	    	  funcionario1.setAjudaDeCusto(campoAjudaDeCusto);
 	    	  
 	    	  JOptionPane.showMessageDialog(null, funcionario1.toString()); 
	    	  dispose();
	    	  System.exit(0);
 	       });
        }
        
        public void telaOperario(double imposto, double salarioBase, double codigoSetor, Empregado funcionario) {

        	JTextField comissao = new JTextField();
        	JTextField producao = new JTextField();
      	setTitle("Criar Operario");
 	        setSize(700, 500);
 	        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
 	        setLocationRelativeTo(null);
	        form.setLayout(new GridLayout(8,6,5,5));

 	       form.add(new JLabel("comissão:"));
 	       form.add(comissao);
 	       form.add(new JLabel("valor de produção:"));
	       form.add(producao);
           add(form, BorderLayout.CENTER);

 	       form.add(btnSalvar);
 	       form.add(panelBotoes, BorderLayout.SOUTH);
	       
 	       setVisible(true);
 	       
 	      
           
 	       btnSalvar.addActionListener(e -> {
 	    	  int campoComissao = Integer.parseInt(comissao.getText());
 	    	  int campoProducao = Integer.parseInt(producao.getText());
 	    	  
 	    	  Operario funcionario1 = new Operario();
	    	  funcionario1.setNome(funcionario.getNome());
 	    	  funcionario1.setEndereco(funcionario.getEndereco());
 	    	  funcionario1.setTelefone(funcionario.getTelefone());
 	    	  funcionario1.setImposto(imposto);
 	    	  funcionario1.setSalarioBase(salarioBase);
 	    	  funcionario1.setCodigoSetor(codigoSetor);
 	    	  funcionario1.setComissao(campoComissao);
 	    	  funcionario1.setValorProducao(campoProducao);
 	    	  
 	    	  JOptionPane.showMessageDialog(null, funcionario1.toString());  
 	    	  dispose();
 	       });

        }
        
        public void telaVededor(double imposto, double salarioBase, double codigoSetor, Empregado funcionario) {

        	JTextField comissao = new JTextField();
        	JTextField producao = new JTextField();
        	setTitle("Criar Operario");
 	        setSize(700, 500);
 	        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
 	        setLocationRelativeTo(null);
	        form.setLayout(new GridLayout(8,6,5,5));

 	       form.add(new JLabel("comissão:"));
 	       form.add(comissao);
 	       form.add(new JLabel("valor de Venda:"));
	       form.add(producao);
           add(form, BorderLayout.CENTER);

 	       form.add(btnSalvar);
 	       form.add(panelBotoes, BorderLayout.SOUTH);
 	       setVisible(true);
 	       
 	      
           
 	       btnSalvar.addActionListener(e -> {
 	    	  int campoComissao = Integer.parseInt(comissao.getText());
 	    	  int campoProducao = Integer.parseInt(producao.getText());
 	    	  
 	    	  Vendedor funcionario1 = new Vendedor();
 	    	  funcionario1.setNome(funcionario.getNome());
 	    	  funcionario1.setEndereco(funcionario.getEndereco());
 	    	  funcionario1.setTelefone(funcionario.getTelefone());
 	    	  funcionario1.setImposto(imposto);
 	    	  funcionario1.setSalarioBase(salarioBase);
 	    	  funcionario1.setCodigoSetor(codigoSetor);
 	    	  funcionario1.setComissao(campoComissao);
 	    	  funcionario1.setValorVenda(campoProducao);
 	    	  
 	    	  JOptionPane.showMessageDialog(null, funcionario1.toString());
	    	   dispose();
 	       });
        }


		
	}