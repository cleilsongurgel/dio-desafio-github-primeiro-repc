package br.com.dio.banco;

public class Emprestimo {
    public Emprestimo() {
    }

    public void Emprestar(Conta conta, double valor){

        //Obtendo o limite de crédito do cliente
        Double limiteCred = conta.cliente.getLimiteCredito();

        //Testando se o cliente possui limite de crédito compativel com a tomada de emprestimo
        if (limiteCred >= 100.0) {
            //Verificando o saldo anterior
            Double saldoAnt = conta.saldo;

            //Realizando o deposito na conta informada
            conta.depositar(valor);

            //Verificando o saldo atual
            Double saldoAtual = conta.saldo;

            // Imprimindo informações
            System.out.println("Emprestimo realizado para: " + conta.cliente.getNome());
            System.out.println("Saldo anterior: R$"+saldoAnt+"\nNovo saldo: R$"+saldoAtual);

            // Atualizando o limite de crédito
            limiteCred -= valor;
            conta.cliente.setLimiteCredito(limiteCred);

        }
        else {
            System.out.println("O cliente não pode realizar o emprestimo. Limite de crédito insuficiente");
        }
    }

}
