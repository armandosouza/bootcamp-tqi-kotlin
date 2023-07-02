package com.cursojava.exerc;
public class SmartTV {
        boolean ligado = true;
        int canal = 0;
        int volume = 50;

    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        ligado = false;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

    public void trocarCanal(int novoCanal) {
        canal = novoCanal;
    }
}