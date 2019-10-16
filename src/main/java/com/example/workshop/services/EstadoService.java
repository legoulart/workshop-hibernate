package com.example.workshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.workshop.domain.Estado;
import com.example.workshop.repositories.EstadoRepository;

@Service
public class EstadoService {

	@Autowired
	private EstadoRepository repo;
	

	public List<Estado> findAll() {
		return repo.findAllByOrderByNome();
	}
}
