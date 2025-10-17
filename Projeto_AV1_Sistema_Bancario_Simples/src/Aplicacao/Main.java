package Aplicacao;

import Contas.CalculadorDeImpostos;
import Contas.ContaCorrente;
import Contas.ContaPoupanca;
import Pessoa.Cliente;



public class Main {
    public static void main(String[] args) {

        ContaCorrente corrente = new ContaCorrente("1", "899", 1000);
        ContaPoupanca poupanca = new ContaPoupanca("2", "960", 300);
        Cliente cliente = new Cliente("alex", 7);


        cliente.adcionarContas(corrente);
        cliente.adcionarContas(poupanca);
        System.out.print("Contas Associadadas: "); cliente.mostra_contas();

        corrente.getSaldo();
        System.out.println("Saldo Disponivel: "+corrente.getSaldo());
        corrente.depositar(200);

        System.out.println("Foi Depositado R$ "+corrente.getAdicionar()+" para a sua conta! -  Salto atual Disponivel: R$ "+corrente.getSaldo());
        corrente.sacar(103);

        System.out.println("Foi Sacado R$ "+corrente.getRetirar()+" da sua conta! Lembrando que para cada saque é descontado uma taxa de R$ 3 -  Salto atual Disponivel: R$ "+corrente.getSaldo());
        corrente.transferir(50, poupanca);
        
        System.out.println("Foi Transferido R$ "+corrente.getEnviar()+" para a conta destinada! -  Salto atual Disponivel: R$ "+corrente.getSaldo());


        System.out.print("Saldo disponivel da poupança: ");  poupanca.mostraSaldo();

        CalculadorDeImpostos imposto = new CalculadorDeImpostos();

        System.out.println("Calculando o imposto!");
        imposto.calcularImposto(corrente);
        System.out.println("Total de imposto para ser pago: "+imposto.calcularImposto(corrente));


    }
}