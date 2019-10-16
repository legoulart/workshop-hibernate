package com.example.workshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.workshop.domain.Cidade;
import com.example.workshop.repositories.CidadeRepository;

@Service
public class CidadeService {

	@Autowired
	private CidadeRepository repo;
	

	public List<Cidade> findbyEstado(Integer estadoId) {
		return repo.findCidades(estadoId);
	}
}
