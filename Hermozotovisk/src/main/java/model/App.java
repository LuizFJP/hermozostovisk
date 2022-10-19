package model;

import view.AdminView;
import view.LoginView;
import repository.IFuncionarioDAO;


/**
 *
 * @author Gustavo
 */
public class App {
    public static void main(String[] args) {
//        CadastroProdutoView cadastro = new CadastroProdutoView();
//        cadastro.setVisible(true);
        LoginView login = new LoginView();
        login.setVisible(true);

    }
}
