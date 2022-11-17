package com.example.testeapi.controller;


import com.example.testeapi.model.ProdutoModel;
import com.example.testeapi.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;



    @GetMapping(path = "api/produto/{codigo}")
    public ResponseEntity consultar(@PathVariable("codigo") Integer codigo){

        return repository.findById(codigo)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping(path = "/api/produto/salvar")
    public ProdutoModel salvar(@RequestBody ProdutoModel produto){
        return repository.save(produto);

    }


}
