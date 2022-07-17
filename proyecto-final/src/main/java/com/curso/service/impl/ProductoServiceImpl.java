package com.curso.service.impl;

import com.curso.dao.IProductoDAO;
import com.curso.model.Producto;
import com.curso.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements IProductoService {

    @Autowired
    IProductoDAO daoProducto;

    @Override
    public Producto registrar(Producto producto) {
        return daoProducto.save(producto);
    }

    @Override
    public Producto actualizar(Producto producto) {
        return daoProducto.save(producto);
    }

    @Override
    public int eliminar(Producto producto) {
        int salida = 0;
        Optional<Producto> op = daoProducto.findById(producto.getIdProducto());
        Producto obj = op.get();
        if(obj != null){
            daoProducto.deleteById(producto.getIdProducto());
        }else{
            salida = 1;
        }
        return salida;
    }

    @Override
    public Producto listarId(int id) {
        Optional<Producto> op = daoProducto.findById(id);
        Producto obj = op.get();
        return obj;
    }

    @Override
    public List<Producto> listar() {
        return daoProducto.findAll();
    }
}
