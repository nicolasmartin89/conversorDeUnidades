package conversordeunidades;

import javax.swing.JOptionPane;

public class MenuPrincipal {

    String[] opciones = {"Conversor de Monedas", "Conversor de Temperaturas"};
    String seleccion = (String) JOptionPane.showInputDialog(
            null,
            "Seleccione una opción:",
            "Conversor",
            JOptionPane.PLAIN_MESSAGE,
            null,
            opciones,
            opciones[0]
    );
}
