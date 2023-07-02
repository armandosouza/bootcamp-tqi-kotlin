package com.cursojava.exerc;
public class Usuario {    
    public static void main(String[] args) {
        SmartTV smartTv = new SmartTV();
        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.trocarCanal(22);
        System.out.println(smartTv.ligado);
    }
}
