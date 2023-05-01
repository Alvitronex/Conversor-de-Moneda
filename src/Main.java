import Divisas.ControllerDivisas;
import Temperatura.ControllerTemperatura;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        ControllerDivisas conversion = new ControllerDivisas();
        ControllerTemperatura conversionT = new ControllerTemperatura();

        String opciones = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú", JOptionPane.PLAIN_MESSAGE, null,
                new Object[]{"Conversor de Monedas", "Conversor de Temperatura"}, "Elegir").toString();

        int respuestaT = 0;
        switch (opciones) {

            case "Conversor de Monedas":
                String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir", "Conversor de Moneda", JOptionPane.PLAIN_MESSAGE);
                double valorRecibido = Double.parseDouble(input);
                conversion.ConvertirMonedas(valorRecibido);

                int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
                if (JOptionPane.OK_OPTION == respuesta) {
                    return;
                } else {
                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                    break;
                }

            case "Conversor de Temperatura":
                String set = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir", "Conversor de Temperatura", JOptionPane.PLAIN_MESSAGE);
                double valorRecibidoT = Double.parseDouble(set);
                conversionT.ConvertirTemperaturas(valorRecibidoT);


                respuestaT = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
                if (JOptionPane.OK_OPTION == respuestaT) {
                    return;
                } else {
                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                    break;
                }

        }
    }
}


