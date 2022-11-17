package com.example.testeapi.repository;


import com.example.testeapi.model.DocumentoModel;
import org.springframework.data.repository.CrudRepository;

public interface DocumentoRepository extends CrudRepository<DocumentoModel, Integer> {
}
