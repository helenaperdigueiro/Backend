package com.helena.aula25.repository;

import java.util.Map;

public interface IRepository <T>{
    Map<Integer, T> criar(T object);
    Map<Integer, T> editar(T object, Integer id);
    Map<Integer, T> buscarTodos();
    Map<Integer, T> buscar(Integer id);
    void deletar(Integer id);
}
