package com.dio.exercicios;
import java.util.Scanner;

public class Ex_Numeros_Aleatorios {
    public static void main(String[] args) {
        Integer[] numeros = new Integer[20];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < numeros.length; i++) {
            System.out.println("Novo número: ");
            int novoNumero = scanner.nextInt();
            numeros[i] = novoNumero;
        }

        for(int n : numeros) {
            System.out.println("NÚMERO: " + n + " | " + "SUCESSOR: " + (n+1));
        }
        scanner.close();
    }
}
