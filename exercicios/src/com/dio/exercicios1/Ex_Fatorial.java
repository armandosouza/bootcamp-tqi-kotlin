package com.dio.exercicios1;
import java.util.Scanner;

public class Ex_Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int fatorial = 1;

        System.out.println("Digite um número: ");
        numero = scanner.nextInt();

        for(int x = numero; x > 1; x--) {
            fatorial *= x;
        }

        System.out.println("O fatorial de " + numero + " é igual a: " + fatorial);
        scanner.close();
    }
}
