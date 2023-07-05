package com.dio.poo;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("azul", "Ford Focus", 180);
        carro.setarCapacidadeTanque(210);
        System.out.println(carro.obterCapacidadeTanque());
        System.out.println(carro.obterCor());
        System.out.println(carro.obterModelo());
        carro.calcularEncherTanque(7.45);

        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        Vendedor vendedor2 = (Vendedor) new Funcionario();
    }
}
