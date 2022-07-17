package com.curso.dao;

import com.curso.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductoDAO extends JpaRepository<Producto, Integer> {
}
