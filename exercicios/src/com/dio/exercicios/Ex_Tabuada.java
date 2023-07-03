package com.dio.exercicios;
import java.util.Scanner;

public class Ex_Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("De qual número você deseja ver a tabuada? ");
        numero = scanner.nextInt();

        System.out.println("===== TABUADA DO " + numero + " =====");
        for(int x = 1; x <= 10; x++) {
            System.out.println(numero + " " + "x " + x + " = " + (numero*x));
        }

        scanner.close();
    }
}
