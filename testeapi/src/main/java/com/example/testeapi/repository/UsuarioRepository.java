package com.example.testeapi.repository;


import com.example.testeapi.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {
}
