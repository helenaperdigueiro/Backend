package com.helena.aula25.service;

import java.util.Map;

public interface IService <T, U> {
    Map<Integer, T> criar(U object);
    Map<Integer, T> editar(U object);
    Map<Integer, T> buscarTodos();
    Map<Integer, T> buscar(Integer id);
    String deletar(Integer id);
}
