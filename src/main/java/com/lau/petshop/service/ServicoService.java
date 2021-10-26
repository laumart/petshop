package com.lau.petshop.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lau.petshop.domain.Servico;
import com.lau.petshop.repository.ServicoRepository;
import com.lau.petshop.service.exceptions.ObjetoNaoEncontradoException;

@Service
public class ServicoService {

	@Autowired
	private ServicoRepository repo;

	public Servico find(Integer id) {
		Optional<Servico> obj = repo.findById(id);
		return obj.orElseThrow( () -> new ObjetoNaoEncontradoException( "Objeto não encontrado. ID: " + id + ", Tipo: " + Servico.class.getName()));
	}

}
