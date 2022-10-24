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
/*Paleta de Cores do Sistema:
Background: "#3f3f46"
Font: "#fafaf9"
Menu: "#71717a"
Button-Background: "#38bdf8"
Button-Font: "#fafaf9"
Input-Background: "#f3f4f6"
Input-font-color: "#18181b"

*/

