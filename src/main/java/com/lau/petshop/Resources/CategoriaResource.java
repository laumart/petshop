package com.lau.petshop.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lau.petshop.service.CategoriaService;
import com.lau.petshop.domain.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> mostrar() {
		
		List<Categoria> lista = new ArrayList();
		
		Categoria cat1 = new Categoria(1, "Alimentos");
		Categoria cat2 = new Categoria(2, "Cosméticos");
		Categoria cat3 = new Categoria(3, "Remédios");
		
		lista.add(cat1);
		lista.add(cat2);
		lista.add(cat3);
		return lista;
	};
		
		@Autowired
		CategoriaService service;

		@RequestMapping(value = "/{id}", method = RequestMethod.GET)
		public ResponseEntity<?> find(@PathVariable Integer id) {		
			Categoria obj = service.find(id);		
			return ResponseEntity.ok().body(obj);
	}
}
