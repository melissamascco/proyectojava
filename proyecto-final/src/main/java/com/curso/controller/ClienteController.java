package com.curso.controller;

import com.curso.model.Cliente;
import com.curso.service.IClienteService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
@Api(value = "Servicio REST para los clientes")
public class ClienteController {

    @Autowired
    private IClienteService service;

    @GetMapping(value = "/listar")
    public List<Cliente> listar(){
        return service.listar();
    }

    @GetMapping(value = "/listar/{id}")
    public Cliente listarId(@PathVariable("id") int id){
        return service.listarId(id);
    }

    @PostMapping(value = "/registrar", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Cliente registrar(@RequestBody Cliente cl) {
        return service.registrar(cl);
    }

    @PutMapping(value = "/modificar", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Cliente modificar(@RequestBody Cliente cl) {
        return service.actualizar(cl);
    }

    @DeleteMapping(value = "/eliminar")
    public int eliminar(@RequestBody Cliente cl) {
        return service.eliminar(cl);
    }
}
