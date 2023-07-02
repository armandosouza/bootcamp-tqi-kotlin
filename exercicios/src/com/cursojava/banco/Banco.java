package com.cursojava.banco;

/*
 * Representação simples de uma conta bancária 
 * @author Armando Souza
 * @version 1.0
 * @since 02/07/2023
 */
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