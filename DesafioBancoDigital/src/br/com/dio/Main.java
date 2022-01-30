package br.com.dio;

import br.com.dio.banco.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	    //Criando dois objetos cliente
        Cliente cleilson = new Cliente();


        //Atribuindo valores aos atributos nome e limiteCredito1'
        cleilson.setNome("Cleilson");
        cleilson.setLimiteCredito(1000.0);



        cleilson.imprimeCliente();
        Conta contaCC = new ContaCorrente(cleilson);
        Conta poupanca = new ContaPoupanca(cleilson);
        Emprestimo emp = new Emprestimo();

        emp.Emprestar(contaCC,1000);
        poupanca.depositar(100);
        contaCC.imprimirInfosComuns();
    }
}
