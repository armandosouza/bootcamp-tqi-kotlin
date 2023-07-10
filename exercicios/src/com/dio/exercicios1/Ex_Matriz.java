package com.dio.exercicios1;

import java.util.Random;

public class Ex_Matriz {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[4][4];

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(9);
            }
        }

        System.out.println("===== MATRIZ =====");
        for(int i = 0; i < matriz.length; i++) {
            for (int n : matriz[i]) {
                System.out.println("Matriz " + i + " valor: " + n);
            }
        }
    }
}
