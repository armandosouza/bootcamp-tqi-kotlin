package com.dio.exercicios1;
import java.util.Scanner;

public class Ex_Nome_e_Idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String nome;
            int idade;
            System.out.println("Nome: ");
            nome = scanner.next();
            if(nome.equals("0")) 
                break;
            System.out.println("Idade: ");
            scanner.nextInt();
        }
        scanner.close();
    }
}
