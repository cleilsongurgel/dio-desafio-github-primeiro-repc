package br.com.dio.banco;

public class Cliente {
    private String nome;
    private Double limiteCredito;




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(Double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
    public void imprimeCliente(){
        System.out.println("Nome cliente: "+getNome());
        System.out.println("Limite de crédito: R$ "+getLimiteCredito());
    }
}
