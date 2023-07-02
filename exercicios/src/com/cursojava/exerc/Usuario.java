package com.cursojava.exerc;
import com.cursojava.banco.Banco;

public class Usuario {    
    public static void main(String[] args) {
        SmartTV smartTv = new SmartTV();
        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.trocarCanal(22);
        System.out.println(smartTv.ligado);

        Banco contaBancaria = new Banco();
        contaBancaria.depositar(250.50);
        contaBancaria.sacar(122.38);
        contaBancaria.verSaldo();
    }
}
