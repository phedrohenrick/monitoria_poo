package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Questao3.Empregado;
import Questao4.Administrador;
import Questao5.Operario;
import Questao6.Vendedor;

public class TelaEmpregado extends JFrame{

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
	
        public TelaEmpregado(Empregado funcionario){
        	

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
               form.add(panelBotoes, BorderLayout.SOUTH);
               setVisible(true);
               
               btnSair.addActionListener( e -> dispose());
               btnSalvar.addActionListener(e -> {
            	  
            	   
            	   String campoImpostotxt  = imposto.getText();
            	   String campoSalarioBasetxt =salarioBase.getText();
            	   String campoCodigoSetortxt = codigoSetor.getText();
            	   
            	   if (campoImpostotxt.isEmpty()|| campoSalarioBasetxt.isEmpty() || campoCodigoSetortxt.isEmpty())  {
      		            JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
      		        }else {
      		        	
      		        	 try {
      		        		 double campoImposto  = Double.parseDouble(imposto.getText());
      	                 	double campoSalarioBase = Integer.parseInt(salarioBase.getText());
      	                 	double campoCodigoSetor = Integer.parseInt(codigoSetor.getText());
      	      		        	
      	      		        	 if(administrador.isSelected()) {
      	      	            		   this.telaAdmin(campoImposto,campoSalarioBase, campoCodigoSetor, funcionario);
      	      	            		   
      	      	            	   }else if(operario.isSelected()) {
      	      	            		   this.telaOperario(campoImposto,campoSalarioBase, campoCodigoSetor, funcionario);
      	      	            	   }else if(vendedor.isSelected()) {
      	      	            		   this.telaVededor(campoImposto,campoSalarioBase, campoCodigoSetor, funcionario);
      	      	            	   }
                  	   }catch (Exception e1) {
       		            JOptionPane.showMessageDialog(this, "Represente o valor decimal do Imposto usando '.' ", "Erro", JOptionPane.ERROR_MESSAGE);
       		            
      				}
      		        	
      		        	
      		         }
  
               });
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