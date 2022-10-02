package com.example.demo;

import com.fasterxml.jackson.annotation.JsonAlias;

public class Dados {


    @JsonAlias("nm")
    private String nome;


    @JsonAlias("vap")
    private String totalDeVotos;

    @JsonAlias("pvap")
    private String porcentagem;

    public String getNome() {
        return nome;
    }

    public String getTotalDeVotos() {
        return totalDeVotos;
    }

    public String getPorcentagem() {
        return porcentagem;
    }
}
