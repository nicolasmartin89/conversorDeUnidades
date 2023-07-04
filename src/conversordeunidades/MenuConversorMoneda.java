package conversordeunidades;

import javax.swing.JOptionPane;

public class MenuConversorMoneda {

    String[] opciones = {"Pesos a Dolar", "Pesos a Euros", "Pesos a Libras Esterlinas",
        "Pesos a Yen Japones", "Pesos a Won Sul-Coreano",
        "Dolar a Pesos", "Euros a Pesos", "Libras Esterlinas a Pesos",
        "Yen Japones a Pesos", "Won Sul-Coreano a Pesos"
    };
    String seleccion = (String) JOptionPane.showInputDialog(
            null,
            "Elije la moneda a la que deseas convertir tu dinero:",
            "Conversor",
            JOptionPane.PLAIN_MESSAGE,
            null,
            opciones,
            opciones[0]
    );

}
