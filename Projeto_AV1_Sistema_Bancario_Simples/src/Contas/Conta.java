package Contas;

public class Conta {

    private String agencia;
    private String numero;
    private double saldo;
    private double adicionar;
    private double retirar;
    private double enviar;

    public Conta(String agencia, String numero, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public double getEnviar() {
        return enviar;
    }

    public double getRetirar() {
        return retirar;
    }

    public void sacar(double retirar){
        this.retirar = retirar;
        if(saldo > retirar ){

            saldo -= retirar;

        }
    }

    public void depositar(double adicionar){
        this.adicionar = adicionar;
        if(adicionar > 0){
            saldo += adicionar;
        }

    }

    public double getAdicionar() {
        return adicionar;
    }

    public void transferir(double enviar, Conta contadestino){
        this.enviar = enviar;
        if (enviar > 0 && enviar <= saldo) {

            contadestino.depositar(enviar);
            saldo -= enviar;
        }

    }
    public void mostraSaldo(){
        System.out.println(saldo);
    }


    public String getAgencia() {
        return agencia;
    }


    public double getSaldo() {

        return saldo;

    }

    public String getNumero() {
        return numero;
    }


    @Override
    public String toString() {
        return "Conta{" +
                "agencia='" + agencia + '\'' +
                ", numero='" + numero + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
