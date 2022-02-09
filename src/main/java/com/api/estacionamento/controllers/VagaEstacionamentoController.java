package com.api.estacionamento.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.estacionamento.services.VagaEstacionamentoService;


@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/vaga-estacionamento")
public class VagaEstacionamentoController {

	
	final VagaEstacionamentoService vagaEstacionamentoService;

	public VagaEstacionamentoController(VagaEstacionamentoService vagaEstacionamentoService) {
		this.vagaEstacionamentoService = vagaEstacionamentoService;
	}
	
	
	
}
