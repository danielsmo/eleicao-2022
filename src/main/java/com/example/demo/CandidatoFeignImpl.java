package com.example.demo;

public class CandidatoFeignImpl implements CandidatoFeign {

    private Candidato candidato;

    @Override
    public Candidato buscaVotos() {
        return candidato;
    }
}
