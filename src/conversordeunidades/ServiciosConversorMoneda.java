package conversordeunidades;

import javax.swing.JOptionPane;


public class ServiciosConversorMoneda {
    
    public void calcularMonto(double montoARS, MenuConversorMoneda menuConversor){
        double resultado;
        switch (menuConversor.seleccion) {
            case "Pesos a Dolar":
                resultado = montoARS*0.0039;
                JOptionPane.showMessageDialog(null, "El resultado de la conversion es: " + Math.round(resultado*100.0)/100.0 + " Dolares");
                break;
            case "Pesos a Euros":
                resultado = montoARS*0.0036;
                JOptionPane.showMessageDialog(null, "El resultado de la conversion es: " + Math.round(resultado*100.0)/100.0 + " Euros");
                break;
            case "Pesos a Libras Esterlinas":
                resultado = montoARS*0.0031;
                JOptionPane.showMessageDialog(null, "El resultado de la conversion es: " + Math.round(resultado*100.0)/100.0 + " Libras");
                break;
            case "Pesos a Yen Japones":
                resultado = montoARS*0.56;
                JOptionPane.showMessageDialog(null, "El resultado de la conversion es: " + Math.round(resultado*100.0)/100.0 + " Yenes");
                break;
            case "Pesos a Won Sul-Coreano":
                resultado = montoARS*5.06;
                JOptionPane.showMessageDialog(null, "El resultado de la conversion es: " + Math.round(resultado*100.0)/100.0 + " Wones");
                break;
                
            case "Dolar a Pesos":
                resultado = montoARS/0.0039;
                JOptionPane.showMessageDialog(null, "El resultado de la conversion es: " + Math.round(resultado*100.0)/100.0 + " Pesos");
                break;
            case "Euros a Pesos":
                resultado = montoARS/0.0036;
                JOptionPane.showMessageDialog(null, "El resultado de la conversion es: " + Math.round(resultado*100.0)/100.0 + " Pesos");
                break;
            case "Libras Esterlinas Pesos":
                resultado = montoARS/0.0031;
                JOptionPane.showMessageDialog(null, "El resultado de la conversion es: " + Math.round(resultado*100.0)/100.0 + " Pesos");
                break;
            case "Yen Japones a Pesos":
                resultado = montoARS/0.56;
                JOptionPane.showMessageDialog(null, "El resultado de la conversion es: " + Math.round(resultado*100.0)/100.0 + " Pesos");
                break;
            case "Won Sul-Coreano a Pesos":
                resultado = montoARS/5.06;
                JOptionPane.showMessageDialog(null, "El resultado de la conversion es: " + Math.round(resultado*100.0)/100.0 + " Pesos");
                break;
            default:
                throw new AssertionError();
        }
        
        
        
    }
    
}
