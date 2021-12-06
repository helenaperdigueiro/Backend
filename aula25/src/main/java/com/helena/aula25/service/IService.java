package com.helena.aula25.service;

import com.helena.aula25.dao.ConsultaDao;
import com.helena.aula25.model.Consulta;

import java.util.Map;

public interface IService <T, U>{
    Map<Integer, T> buscar();
    void deletar(Integer id);
    T criar(U dao);
    T editar(U dao);
}
