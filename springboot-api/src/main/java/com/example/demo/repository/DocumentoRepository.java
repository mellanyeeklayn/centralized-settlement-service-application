package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Documento;

@Repository
public interface DocumentoRepository extends JpaRepository<Documento, Long>{

}
