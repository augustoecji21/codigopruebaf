package com.example.prueba.repositories;

import java.util.ArrayList;

import com.example.prueba.models.UsuarioModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {
    public abstract ArrayList<UsuarioModel> findById_cliente(Long id_cliente);

    
}
