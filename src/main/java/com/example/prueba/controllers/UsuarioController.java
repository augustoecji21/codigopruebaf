package com.example.prueba.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.prueba.models.UsuarioModel;
import com.example.prueba.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/t01_solicitud")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioS;

    @GetMapping()
    public ArrayList<UsuarioModel> obtenerU(){
        return usuarioS.obtenerUsuario();
    }

    @PostMapping()
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario){
        return this.usuarioS.guardarUsuario(usuario);
    }

    @GetMapping( path = "/{id}")
    public Optional<UsuarioModel> obtenerUsuarioPorId(@PathVariable("id") Long id) {
        return this.usuarioS.obtenerPorId(id);
    }

    @GetMapping("/query")
    public ArrayList<UsuarioModel> obtenerUsuarioPorId_cliente(@RequestParam("id_cliente") Long id_cliente){
        return this.usuarioS.obtenerPorId_cliente(id_cliente);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.usuarioS.eliminarUsuario(id);
        if (ok){
            return "Se eliminó el usuario con id " + id;
        }else{
            return "No pudo eliminar el usuario con id" + id;
        }
    }

}