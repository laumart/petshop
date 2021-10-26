package com.lau.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lau.petshop.domain.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Integer>{

}
