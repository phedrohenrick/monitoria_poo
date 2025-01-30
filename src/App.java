
import controller.RegistroController;
import model.Fornecedor;
import view.TelaRegistro;

public class App {
    public static void main(String[] args) throws Exception {

        	//SwingUtilities.invokeLater(TelaRegistro::new);

            TelaRegistro frame = new TelaRegistro();
            RegistroController registro = new RegistroController(frame);

       
    }
}
