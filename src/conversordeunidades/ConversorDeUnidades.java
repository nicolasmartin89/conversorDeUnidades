package conversordeunidades;

import javax.swing.JOptionPane;

public class ConversorDeUnidades {

    public static void main(String[] args) {

        MenuPrincipal menu = new MenuPrincipal();
        if (menu.seleccion.equalsIgnoreCase("Conversor de Monedas")) {
            MenuConversorMoneda menuConversor = new MenuConversorMoneda();
            ServiciosConversorMoneda servConversor = new ServiciosConversorMoneda();
            boolean validado = false;

            while (!validado) {
                try {
                    String montoString = JOptionPane.showInputDialog("Ingrese el monto a convertir:");
                    double montoARS = Double.parseDouble(montoString);
                    servConversor.calcularMonto(montoARS, menuConversor);
                    int opcion = JOptionPane.showConfirmDialog(null, "Desea continuar?");
                    if (opcion == JOptionPane.YES_OPTION) {
                       
                    } else {
                        JOptionPane.showMessageDialog(null, "Programa Finalizado");
                        validado = true;
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Introduciste un numero invalido, introducelo nuevamente:");
                }
            }
        } else if (menu.seleccion.equalsIgnoreCase("Conversor de temperaturas")) {
            JOptionPane.showMessageDialog(null, "Funcionalidad no implementada...Saliendo del programa.");
        }

    }
}
