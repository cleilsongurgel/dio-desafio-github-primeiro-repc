package br.com.dio;

import java.util.Scanner;

public class Calculadora {

    public static void iniciarCalculadora(){
        // Criando o objeto scanner para
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        double num1 = entrada.nextDouble();

        System.out.println("Digite o segundo numero");
        double num2 = entrada.nextDouble();

        // Chamando os métodos
        soma(num1, num2);
        sub(num1, num2);
        mult(num1, num2);
        div(num1, num2);

        entrada.close();
    }
    public static void imprime(double num1, double num2, double result, String op){
        System.out.println("######### Método da "+op+" ##########");
        System.out.println("Primeiro numero: "+num1+"\nSegundo numero: "+num2);
        System.out.println("O resultado da operação de "+op+" é igual a: "+result);
        System.out.println();

    }

    public static void soma(double num1, double num2) {
        String operacao = "Soma";
        double resultado = num1 + num2;
        imprime(num1, num2, resultado, operacao);
    }

    public static void sub(double num1, double num2) {
        String operacao = "Subtração";
        double resultado = num1 - num2;
        imprime(num1, num2, resultado, operacao);
    }
    public static void mult(double num1, double num2) {
        String operacao = "Multiplicação";
        double resultado = num1 * num2;
        imprime(num1, num2, resultado, operacao);
    }

    public static void div(double num1, double num2) {
        String operacao = "Divisão";
        double resultado = num1 / num2;
        imprime(num1, num2, resultado, operacao);
    }
}
