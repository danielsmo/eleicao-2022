package com.example.demo;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Candidato {

    @JsonAlias("cand")
    private List<Dados> dados;

    public List<Dados> getDados() {
        return dados;
    }
}
