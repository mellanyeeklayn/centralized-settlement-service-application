package com.example.testeapi.controller;


import com.example.testeapi.model.DocumentoModel;
import com.example.testeapi.repository.DocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DocumentoController {

    @Autowired
    private DocumentoRepository repository;


    @GetMapping(path = "api/documento/{codigo}")
    public ResponseEntity consultar(@PathVariable("codigo") Integer codigo){

        return repository.findById(codigo)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping(path = "/api/documento/salvar")
    public DocumentoModel salvar(@RequestBody DocumentoModel documento){
        return repository.save(documento);
    }
}
