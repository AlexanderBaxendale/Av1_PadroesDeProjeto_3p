package Contas;

import interfaces.Tributavel;

public class CalculadorDeImpostos {
    public double calcularImposto(Tributavel t) {
        double imposto = t.calcularImposto();

        return imposto;
    }
}
