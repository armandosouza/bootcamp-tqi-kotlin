package com.dio.exercicios2;

public class Ex_Quadrilatero {
    public static double area(double lado1, double lado2) {
        return lado1 * lado2;
    }

    public static double area(double lado) {
        return lado * lado;
    }

    public static double area(double baseMenor, double baseMaior, double altura) {
        return (baseMenor + baseMaior) * altura;
    }
}
