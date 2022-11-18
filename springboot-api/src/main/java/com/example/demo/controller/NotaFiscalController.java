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

import com.example.demo.model.NotaFiscal;
import com.example.demo.repository.NotaFiscalRepository;

@RestController
@RequestMapping("/notafiscal")
public class NotaFiscalController {

	@Autowired
	private NotaFiscalRepository notaFiscalRepository;
	
	@GetMapping
	public List<NotaFiscal> listarNotaFiscal() {
		return notaFiscalRepository.findAll();
	}
	
	@PostMapping(path = "/post")
	@ResponseStatus(HttpStatus.CREATED)
	public NotaFiscal addNotaFiscal(@RequestBody NotaFiscal notaFiscal) {
		return notaFiscalRepository.save(notaFiscal);
	}
}
