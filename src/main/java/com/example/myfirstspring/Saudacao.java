package com.example.myfirstspring;

public class Saudacao {

    private final Long contador;
    private final String saudacao;

    public Saudacao(Long contador, String saudacao) {
        this.contador = contador;
        this.saudacao = saudacao;
    }

    public Long getContador() {
        return contador;
    }

    public String getSaudacao() {
        return saudacao;
    }
}
