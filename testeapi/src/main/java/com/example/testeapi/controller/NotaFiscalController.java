package com.example.testeapi.controller;



import com.example.testeapi.model.NotaFiscalModel;
import com.example.testeapi.repository.NotaFiscalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class NotaFiscalController {

    @Autowired
    private NotaFiscalRepository repository;

    @GetMapping(path = "api/notafiscal/{codigo}")
    public ResponseEntity consultar(@PathVariable("codigo") Integer codigo){

        return repository.findById(codigo)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping(path = "/api/notafiscal/salvar")
    public NotaFiscalModel salvar(@RequestBody NotaFiscalModel notafiscal) {
        return repository.save(notafiscal);

    }
}
