package com.dio.exercicios1;

import java.util.Scanner;

public class Ex_Pares_Impares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pares = 0;
        int impares = 0;

        while(true) {
            int numero;
            System.out.println("Digite um número: ");
            numero = scanner.nextInt();
            if(numero == 0) break;
            if(numero % 2 == 0) pares++;
            else impares++;
        }

        System.out.println("Números pares: " + pares);
        System.out.println("Números impares: " + impares);
        scanner.close();
    }
}
