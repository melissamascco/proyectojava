package com.curso.service;

import java.util.List;

public interface ICRUD<T> {
	
	T registrar(T t);
	
	T actualizar(T t);
	
	int eliminar(T t);
	
	T listarId(int id);
	
	List<T> listar();
	
}
