package br.com.dio;

import javax.swing.*;
import java.util.Scanner;

public class Empresimo {

    public static void realizarEmprestimo(){
        // Criando o objeto scanner para
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do emprestimo: Obs.: O valor tem que ser menor que 1MIL");
        double valorEmprestimo = entrada.nextDouble();

        System.out.println("Digite a quantidade de parcelas (12x, 24x, 48x ou 60x)");
        int numParcelas = entrada.nextInt();


        Calcula(valorEmprestimo, numParcelas);
    }
    public static void Calcula(double valor, int parcelas){
        double total = 0;
        double totalParcela = 0;

        if (parcelas > 60 || valor > 1000000.0){
            System.out.println("Quantidade de parcelas ou valor estão acima do permitido");
            System.out.println("Empréstimo Negado!!!");
        }else{
            switch (parcelas){
                case 12:
                    totalParcela = (valor / parcelas) * 1.10;
                    total = totalParcela*parcelas;
                    Imprime(valor,parcelas, total);
                    break;
                case 24:
                    totalParcela = (valor / parcelas) * 1.20;
                    total = totalParcela*parcelas;
                    Imprime(valor,parcelas, total);
                    break;
                case 48:
                    totalParcela = (valor / parcelas) * 1.50;
                    total = totalParcela*parcelas;
                    Imprime(valor,parcelas, total);
                    break;
                case 60:
                    totalParcela = (valor / parcelas) * 1.75;
                    total = totalParcela*parcelas;
                    Imprime(valor,parcelas, total);
                    break;
                default:
                    System.out.println("Você não digitou um valor de parcela válido");
                    System.out.println("Empréstimo Negado!!!");
            }

        }

    }

    public static void Imprime(double valor, int parcelas, double total){
        System.out.println("Valor solicitado: R$"+valor);
        System.out.println("Quantidade de Parcelas: "+parcelas+" X");
        System.out.println("Valor total que será pago ao final do periodo R$: "+total);
        System.out.println("Valor de cada parcela: R$"+(total/parcelas));
    }
}
