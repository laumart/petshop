package com.lau.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lau.petshop.domain.Servico;

@Repository
public interface ServicoRepository extends JpaRepository<Servico, Integer>{

}
