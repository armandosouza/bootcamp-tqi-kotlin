package com.dio.exercicios1;
import java.util.Scanner;

public class Ex_Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Digite sua nota: ");
            double nota = scanner.nextDouble();
            if(nota >= 0 && nota <= 10) break;
            System.out.println("Nota inválida, somente entre 0 e 10");
        }
        scanner.close();
    }
}
