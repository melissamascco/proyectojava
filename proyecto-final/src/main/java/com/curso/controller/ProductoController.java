package com.curso.controller;

import com.curso.model.Producto;
import com.curso.service.IProductoService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
@Api(value = "Servicio REST para los productos")
public class ProductoController {
    @Autowired
    private IProductoService service;

    @GetMapping(value = "/listar")
    public List<Producto> listar(){
        return service.listar();
    }

    @GetMapping(value = "/listar/{id}")
    public Producto listarId(@PathVariable("id") int id){
        return service.listarId(id);
    }

    @PostMapping(value = "/registrar", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Producto registrar(@RequestBody Producto pr) {
        return service.registrar(pr);
    }

    @PutMapping(value = "/modificar", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Producto modificar(@RequestBody Producto pr) {
        return service.actualizar(pr);
    }

    @DeleteMapping(value = "/eliminar")
    public int eliminar(@RequestBody Producto pr) {
        return service.eliminar(pr);
    }
}
