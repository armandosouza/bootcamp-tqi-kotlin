package com.dio.exercicios2;

public class Ex_Multidimensional {
	public static void main(String[] args) {
		int[][] numeros = new int[2][2];
		numeros[0][0] = 1;
		numeros[0][1] = 2;
		numeros[1][0] = 3;
		numeros[1][1] = 4;

		for(int[] numArr : numeros) {
			for(int num : numArr) {
				System.out.println(num);
			}
		}
	}
}