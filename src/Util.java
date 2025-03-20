import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Util {

    private BilheteUnico [] bilhete = new BilheteUnico[5];
    private int index;

    public void menuPrincipal() {
        int opcao = 0;
        String menu = "1. Administrador\n2. Usuário\n3. Cancelar";

        do {
            opcao = parseInt(showInputDialog(menu));
            if(opcao < 1|| opcao >3) {
                showMessageDialog(null, "Opção Inválida");
            } else {
                switch (opcao) {
                    case 1:
                        menuAdministrador();
                        break;
                }
            }
        } while(opcao != 3);
    }

    private void menuAdministrador() {
        int opcao = 0;
        String menuAdmin = "1. Emitir Bilhete\n2. Listar Bilhetes\n3. Remover Bilhete\n4. Sair";

        do {
            opcao = parseInt(showInputDialog(menuAdmin));
            if(opcao < 1|| opcao >3) {
                showMessageDialog(null, "Opção Inválida");
            } else {

        }while (opcao != 4);

    }
}














