package com.dio.exercicios1;

public class Ex_Ordem_Inversa {
    public static void main(String[] args) {
        int[] numeros = {7, 10, 15, 22, 27, 23};

        for(int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
