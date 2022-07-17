package com.curso.dao;

import com.curso.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteDAO extends JpaRepository<Cliente, Integer> {
}
