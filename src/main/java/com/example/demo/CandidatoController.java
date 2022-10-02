package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CandidatoController {
    @Autowired
    private CandidatoFeign candidatoFeign;

    @GetMapping
    public Candidato buscaCandidato() {


        Candidato candidato = candidatoFeign.buscaVotos();

        return candidato;


    }
}
