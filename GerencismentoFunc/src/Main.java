
/*
 	trabalho feito por:
 	Luis Felipe Dos Santos
 	Aron Barbosa
 	João Torres
 	João Marcelo Lopes
 */
import view.FuncionarioView;
import controller.FuncionarioController;

public class Main {
	public static void main(String[] args) {
		FuncionarioController controller = new FuncionarioController();

		FuncionarioView view = new FuncionarioView(controller);
        
		view.exibirMenu();
	}
}