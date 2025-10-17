package Contas;

import interfaces.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {


    public ContaCorrente(String agencia, String numero, double saldo) {
        super(agencia, numero, saldo);
    }

    @Override
    public void sacar(double retirar) {
       double taxa = 3.0;
        super.sacar(retirar+taxa);
    }

    @Override
    public double calcularImposto() {
       double imposto = getSaldo() * 0.01;
        return imposto;
    }


}


