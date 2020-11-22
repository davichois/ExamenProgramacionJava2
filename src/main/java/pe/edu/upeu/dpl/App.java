package pe.edu.upeu.dpl;

import pe.edu.upeu.dpl.utils.LeerTeclado;
import pe.edu.upeu.dpl.utils.Menus;

public class App {

    public static void main(String[] args) {
        LeerTeclado teclado = new LeerTeclado();
        Menus menu = new Menus();

        menu.MenuOpt(teclado);
    }

}
