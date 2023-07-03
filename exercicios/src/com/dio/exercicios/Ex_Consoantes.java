package com.dio.exercicios;
import java.util.Scanner;

public class Ex_Consoantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] consoantes = new String[6];
        int numeroConsoantes = 0;

        for(int x = 0; x < consoantes.length; x++) {
            System.out.println("Letra: ");
            String letra = scanner.next();
            if(
                !letra.equalsIgnoreCase("a") 
                && !letra.equalsIgnoreCase("e") 
                && !letra.equalsIgnoreCase("i") 
                && !letra.equalsIgnoreCase("o") 
                && !letra.equalsIgnoreCase("u")
            ) {
                numeroConsoantes++;
                consoantes[x] = letra;
            }
        }

        System.out.println("Número de consoantes: " + numeroConsoantes);
        for(String consoante : consoantes) {
            if(consoante != null) System.out.println(consoante);
        }
        scanner.close();
    }
}
