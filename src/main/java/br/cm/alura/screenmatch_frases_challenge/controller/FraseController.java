package br.cm.alura.screenmatch_frases_challenge.controller;

import br.cm.alura.screenmatch_frases_challenge.dto.FraseDTO;
import br.cm.alura.screenmatch_frases_challenge.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {

    @Autowired
    private FraseService servico;

    @GetMapping("/series/frases")
    public FraseDTO obterFraseAleatoria() {
        return servico.obterFraseAleatoria();
    }}
