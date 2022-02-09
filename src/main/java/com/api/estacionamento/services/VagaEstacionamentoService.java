package com.api.estacionamento.services;


import org.springframework.stereotype.Service;

import com.api.estacionamento.repositories.VagaEstacionamentoRepository;

@Service
public class VagaEstacionamentoService {

	final VagaEstacionamentoRepository vagaEstacionamentoRepository;
	
	public VagaEstacionamentoService(VagaEstacionamentoRepository vagaEstacionamentoRepository) {
		this.vagaEstacionamentoRepository = vagaEstacionamentoRepository;
	}
	
	
}
