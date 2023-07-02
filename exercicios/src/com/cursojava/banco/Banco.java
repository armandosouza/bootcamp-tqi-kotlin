package com.cursojava.banco;

public class Banco {
    double saldo = 0;

    public void sacar(double valor) {
        if(saldo < valor) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= valor;
        }
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void verSaldo() {
        System.out.println("R$ " + saldo);
    }
}