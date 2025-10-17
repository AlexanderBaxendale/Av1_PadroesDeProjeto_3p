package Pessoa;

import Contas.Conta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cliente {

    private String nome;
    private int cpf;
    private List<Conta> contas = new ArrayList<>();


    public Cliente(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void adcionarContas(Conta conta){
        contas.add(conta);
    }
    public void mostra_contas(){
        System.out.println(Arrays.toString(getContas().toArray()));
    }

    public String getNome() {
        return nome;
    }


    public int getCpf() {
        return cpf;
    }


    public List<Conta> getContas() {
        return contas;
    }

}
