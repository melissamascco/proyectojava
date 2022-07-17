package com.curso.service.impl;

import com.curso.dao.IClienteDAO;
import com.curso.model.Cliente;
import com.curso.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements IClienteService {

    @Autowired
    private IClienteDAO daoCliente;


    @Override
    public Cliente registrar(Cliente cliente) {
        return daoCliente.save(cliente);
    }

    @Override
    public Cliente actualizar(Cliente cliente) {
        return daoCliente.save(cliente);
    }

    @Override
    public int eliminar(Cliente cliente) {
        int salida = 0;
        Optional<Cliente> op = daoCliente.findById(cliente.getIdCliente());
        Cliente obj = op.get();
        if(obj != null){
            daoCliente.deleteById(cliente.getIdCliente());
        }else{
            salida = 1;
        }
        return salida;
    }

    @Override
    public Cliente listarId(int id) {
        Optional<Cliente> op = daoCliente.findById(id);
        Cliente obj = op.get();
        return obj;
    }

    @Override
    public List<Cliente> listar() {
        return daoCliente.findAll();
    }
}
