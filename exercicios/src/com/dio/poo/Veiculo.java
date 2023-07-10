package com.dio.poo;

class Veiculo {
    String cor;
    String modelo;
    double capacidadeTanque;

    Veiculo(String cor, String modelo, double capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    void calcularEncherTanque(double preco) {
        System.out.println("Valor para encher o tanque: R$ " + (preco * obterCapacidadeTanque()));
    }

    double obterCapacidadeTanque() {
        return this.capacidadeTanque;
    }

    void setarCapacidadeTanque(double valor) {
        this.capacidadeTanque = valor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String obterModelo() {
        return this.modelo;
    }

    void setCor(String cor) {
        this.cor = cor;
    }

    String obterCor() {
        return this.cor;
    }
}
