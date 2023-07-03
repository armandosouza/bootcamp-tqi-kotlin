package com.dio.exercicios;
import java.util.Scanner;

public class Ex_Maior_Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double maiorValor = 0;
        double soma = 0;
        double numero;
        double media;

        for(int x = 0; x < 5; x++) {
            System.out.println("Digite um número: ");
            numero = scanner.nextDouble();
            if(numero > maiorValor) maiorValor = numero;
            soma += numero;
        }

        media = soma / 5;
        System.out.println("O maior valor é: " + maiorValor);
        System.out.println("A média dos valores é: " + media);
        scanner.close();
    }
}
