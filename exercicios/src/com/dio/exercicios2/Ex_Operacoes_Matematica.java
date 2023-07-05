package com.dio.exercicios2;
import java.util.Scanner;

public class Ex_Operacoes_Matematica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("NÚMERO 1");
        double numero1 = scanner.nextDouble();
        System.out.println("NÚMERO 2");
        double numero2 = scanner.nextDouble();

        soma(numero1, numero2);
        multiplicar(numero1, numero2);
        dividir(numero1, numero2);
        subtrair(numero1, numero2);

        scanner.close();
    }

    public static void soma(double numero1, double numero2) {
        double resultado = numero1 + numero2;
        System.out.println("SOMA: " + numero1 + " + " + numero2 + " = " + resultado);
    }

    public static void multiplicar(double numero1, double numero2) {
        double resultado = numero1 * numero2;
        System.out.println("MULTIPLICAR: " + numero1 + " x " + numero2 + " = " + resultado);
    }

    public static void dividir(double numero1, double numero2) {
        double resultado = numero1 / numero2;
        System.out.println("DIVISÃO: " + numero1 + " / " + numero2 + " = " + resultado);
    }

    public static void subtrair(double numero1, double numero2) {
        double resultado = numero1 - numero2;
        System.out.println("SUBTRAÇÃO: " + numero1 + " - " + numero2 + " = " + resultado);
    }
}
