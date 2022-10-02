package com.example.demo;

public class CandidatoFeignImpl implements CandidatoFeign {


    @Override
    public Candidato buscaVotos() {
        return new Candidato();
    }
}
