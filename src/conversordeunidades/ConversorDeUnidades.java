package conversordeunidades;

import javax.swing.JOptionPane;

public class ConversorDeUnidades {

    public static void main(String[] args) {

        MenuPrincipal menu = new MenuPrincipal();
        if (menu.seleccion.equalsIgnoreCase("Conversor de Monedas")) {
            MenuConversorMoneda menuConversor = new MenuConversorMoneda();
            ServiciosConversorMoneda servConversor = new ServiciosConversorMoneda();

            String montoString = JOptionPane.showInputDialog("Ingrese el monto a convertir:");
            double montoARS = Double.parseDouble(montoString);

            servConversor.calcularMonto(montoARS, menuConversor);

        } else if (menu.seleccion.equalsIgnoreCase("Conversor de temperaturas")) {
            JOptionPane.showMessageDialog(null, "Funcionalidad no implementada...");
        }
    }
}
