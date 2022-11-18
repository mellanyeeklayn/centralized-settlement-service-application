package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Documento;
import com.example.demo.repository.DocumentoRepository;

@RestController
@RequestMapping("/documento")
public class DocumentoController {

	@Autowired
	private DocumentoRepository documentoRepository;
	
	@GetMapping
	public List<Documento> listarDocumento() {
		return documentoRepository.findAll();
	}
	
	@PostMapping(path = "/post")
	@ResponseStatus(HttpStatus.CREATED)
	public Documento addDocumento(@RequestBody Documento documento) {
		return documentoRepository.save(documento);
	}
}
