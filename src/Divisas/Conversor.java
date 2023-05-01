package Divisas;

import javax.swing.*;

public class Conversor {


    public void DolaresToEuro(double valor) {
        double monedaEuro = valor * 0.91;
        monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros");
    }

    public void DolaresToLibra(double valor) {
        double monedaLibra = valor * 0.80;
        monedaLibra = (double) Math.round(monedaLibra * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Libras Esterlinas");
    }

    public void DolaresToYen(double valor) {
        double monedaYen = valor * 137.47;
        monedaYen = (double) Math.round(monedaYen * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Yen Japonés");
    }

    public void DolaresToWon(double valor) {
        double monedaWon = valor * 1342.12;
        monedaWon = (double) Math.round(monedaWon * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + " Won sub-coreano");
    }


    public void DolaresToPesos(double valor) {
        double monedaDolar = 222.72 * valor;
        monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes Dolares " + monedaDolar + " en pesos");
    }

}

