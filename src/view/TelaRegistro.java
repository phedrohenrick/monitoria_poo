package view;

import javax.swing.*;


import model.Empregado;
import model.Fornecedor;


import java.awt.*;
import java.util.ArrayList;

public class TelaRegistro extends JFrame{
	

	private ArrayList<Fornecedor> listaFornecedores = new ArrayList<>();
    private ArrayList<Empregado> listaEmpregados = new ArrayList<>();

	private JPanel form = new JPanel();

	private JTextField campoNome = new JTextField();
	private JTextField campoTelefone = new JTextField();
	private JTextField campoEndereco = new JTextField();
	
	private JPanel contratoPanel = new JPanel();
	private JRadioButton empregado = new JRadioButton("Empregado");
	private JRadioButton fornecedor = new JRadioButton("Fornecedor");
	private ButtonGroup contratoGroup = new ButtonGroup();
	
	private JPanel panelBotoes = new JPanel();
	private JButton btnSalvar = new JButton("Salvar");
	private JButton btnSair = new JButton("Sair");

	public JTextField getCampoNome() {
		return campoNome;
	}

	public JTextField getCampoTelefone() {
		return campoTelefone;
	}

	public JTextField getCampoEndereco() {
		return campoEndereco;
	}

	public JRadioButton getEmpregado() {
		return empregado;
	}

	public JRadioButton getFornecedor() {
		return fornecedor;
	}

	public JButton getBtnSalvar() {
		return btnSalvar;
	}

	public JButton getBtnSair() {
		return btnSair;
	}

	public void setCampoNome(JTextField campoNome) {
		this.campoNome = campoNome;
	}

	public void setCampoTelefone(JTextField campoTelefone) {
		this.campoTelefone = campoTelefone;
	}

	public void setCampoEndereco(JTextField campoEndereco) {
		this.campoEndereco = campoEndereco;
	}

	public void setEmpregado(JRadioButton empregado) {
		this.empregado = empregado;
	}

	public void setFornecedor(JRadioButton fornecedor) {
		this.fornecedor = fornecedor;
	}

	public void setBtnSalvar(JButton btnSalvar) {
		this.btnSalvar = btnSalvar;
	}

	public void setBtnSair(JButton btnSair) {
		this.btnSair = btnSair;
	}

	  public TelaRegistro() {

	        setTitle("Tela de Registro");
	        setSize(700, 500);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);

	        // Painel
	       form.setLayout(new GridLayout(6,2,5,5));
	       
	       //campos
	        form.add(new JLabel("Nome: "));
	        form.add(campoNome);
	        
	        form.add(new JLabel("Telefone: "));
	        form.add(campoTelefone);
	        
	        form.add(new JLabel("endereço: "));
			form.add(campoEndereco);
			
			form.add(new JLabel("Contrato:"));
	        contratoGroup.add(empregado);
	        contratoGroup.add(fornecedor);
	        contratoPanel.add(empregado);
	        contratoPanel.add(fornecedor);
	        form.add(contratoPanel);
	        
	        add(form, BorderLayout.CENTER);
	        
	        // Botões
	        
	        panelBotoes.add(btnSalvar);
	        panelBotoes.add(btnSair);
	        form.add(panelBotoes, BorderLayout.SOUTH);

	        setVisible(true); 

			
	    }




		
}
