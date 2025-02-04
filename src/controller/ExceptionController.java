package controller;

import javax.swing.JOptionPane;

import view.TelaEmpregado;

public class ExceptionController extends Exception{
     public ExceptionController(String message) {
       super(message);
        JOptionPane.showMessageDialog(null, message, "Erro", JOptionPane.ERROR_MESSAGE);
          

     }

    public ExceptionController(String message, Throwable couse){
        super(message,couse);
        JOptionPane.showMessageDialog(null, message, "Erro", JOptionPane.ERROR_MESSAGE);
    }
}
