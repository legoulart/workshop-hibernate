package com.example.workshop.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.example.workshop.domain.Categoria;
import com.example.workshop.repositories.CategoriaRepository;
import com.example.workshop.services.exceptions.DataIntegrityException;
import com.example.workshop.services.exceptions.ObjectNotFoundException;



@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
	
	public Categoria insert(Categoria obj) {
		obj.setId(null);
		return repo.save(obj);
	}
	
	public Categoria update(Categoria obj) {
		find(obj.getId());
		return repo.save(obj);
	}

	public void deleteById(Integer id) {
		find(id);
		try{ 
			repo.deleteById(id);
		}
		catch(DataIntegrityViolationException  e) {
			throw new DataIntegrityException("Não é possível excluir uma categoria que possua vínculos com produtos.");
		}
	}
}
