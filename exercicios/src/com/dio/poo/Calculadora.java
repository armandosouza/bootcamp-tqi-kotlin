package com.dio.poo;

class Calculadora implements Operacoes_Matematica {
    @Override
    public void somar(double numero1, double numero2) {
        System.out.println("SOMA: " + numero1 + " + " + numero2 + " = " + (numero1 + numero2));
    }

    @Override
    public void multiplicar(double numero1, double numero2) {
        System.out.println("MULTIPLICAÇÃO: " + numero1 + " x " + numero2 + " = " + (numero1 * numero2));
    }

    @Override
    public void dividir(double numero1, double numero2) {
        System.out.println("DIVISÃO: " + numero1 + " / " + numero2 + " = " + (numero1 / numero2));
    }

    @Override
    public void subtrair(double numero1, double numero2) {
        System.out.println("SUBTRAÇÃO: " + numero1 + " - " + numero2 + " = " + (numero1 - numero2));
    }
}
