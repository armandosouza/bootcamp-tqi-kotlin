package com.dio.poo;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("azul", "Ford Focus", 180);
        carro.setarCapacidadeTanque(210);
        System.out.println(carro.obterCapacidadeTanque());
        System.out.println(carro.obterCor());
        System.out.println(carro.obterModelo());
        carro.calcularEncherTanque(7.45);

        Empregado empregado = new Empregado();
        empregado.nome = "Armando";
        empregado.idade = 23;
        empregado.imprimirDados();
        empregado.mediaSalarial();
    }
}
