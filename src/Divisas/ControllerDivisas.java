package Divisas;

import javax.swing.*;

public class ControllerDivisas {
    Conversor monedas = new Conversor();

    public void ConvertirMonedas(double valor) {

        String opcion = (JOptionPane.showInputDialog(null,
                "Elije la moneda que deseas convertir tu dinero ", "Moneda",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]
                        {"Dolares a Euro", "Dolares a Libras Esterlinas", "Dolares a Yen Japonés", "Dolares a Won sub-coreano", "Dolares a Pesos"},
                "Seleccion")).toString();

        switch (opcion) {
            case "Dolares a Euro":
                monedas.DolaresToEuro(valor);
                break;

            case "Dolares a Libras Esterlinas":
                monedas.DolaresToLibra(valor);
                break;

            case "Dolares a Wones":
                monedas.DolaresToYen(valor);
                break;

            case "Dolares a Won-coreano":
                monedas.DolaresToWon(valor);
                break;

            case "Dólar a Pesos":
                monedas.DolaresToPesos(valor);
                break;


        }
    }
}
