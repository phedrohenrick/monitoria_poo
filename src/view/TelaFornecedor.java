package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.FornecedorController;
import factory.FactoryFuncionario;
import model.Empregado;
import model.Fornecedor;
import model.Operario;
import model.Pessoa;

public class TelaFornecedor extends JFrame {
	
	private JPanel form = new JPanel();
	private JTextField valorCredito = new JTextField();
	private JTextField valorDivida = new JTextField();
	
	
	private JPanel panelBotoes = new JPanel();
	private JButton btnSalvar = new JButton("Salvar");
	private JButton btnSair = new JButton("Sair");
	
	public JTextField getValorCredito() {
		return valorCredito;
	}



	public void setValorCredito(JTextField valorCredito) {
		this.valorCredito = valorCredito;
	}



	public JTextField getValorDivida() {
		return valorDivida;
	}



	public void setValorDivida(JTextField valorDivida) {
		this.valorDivida = valorDivida;
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

	
	public TelaFornecedor( Pessoa pessoa, ArrayList<Fornecedor> listaFornecedores, ArrayList<Empregado> listaEmpregados) {
		
		setTitle("Tela Fornecedor");
		setSize(700, 500);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);//localização relativa na tela, quando null ela fica no meio]
		
		
		form.setLayout(new GridLayout(6,2,5,5));
		
		form.add(new Label("Valor de Crédito do Fornecedor:"));
		form.add(valorCredito);
		
		form.add(new Label("Qual o valor da dívida do Fornecedor "));
		form.add(valorDivida);
		
        add(form, BorderLayout.CENTER);
        
        // Botões
        
        panelBotoes.add(btnSalvar);
        panelBotoes.add(btnSair);
        form.add(panelBotoes, BorderLayout.SOUTH);
        setVisible(true);
        

		FornecedorController controllerFornecedor = new FornecedorController(this, pessoa, listaEmpregados, listaFornecedores);
		
	}



	
}
