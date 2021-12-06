package com.helena.aula25.service;

import com.helena.aula25.dao.ConsultaDao;
import com.helena.aula25.model.Consulta;
import com.helena.aula25.repository.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ConsultaService implements IService<Consulta, ConsultaDao>{
    @Autowired
    private ConsultaRepository consultaRepository;

    @Override
    public Map<Integer, Consulta> buscarTodos() {
        return consultaRepository.buscarTodos();
    }
    @Override
    public Map<Integer, Consulta> buscar(Integer id) {
        return consultaRepository.buscar(id);
    }
    @Override
    public String deletar(Integer id) {
        consultaRepository.deletar(id);
        return "Deletado com sucesso!";
    }
    @Override
    public Map<Integer, Consulta> criar(ConsultaDao object) {
        Consulta consulta = new Consulta(object.getPaciente(), object.getDentista(), object.getDataConsulta());
        return consultaRepository.criar(consulta);
    }
    @Override
    public Map<Integer, Consulta> editar(ConsultaDao object) {
        Consulta consulta = new Consulta(object.getPaciente(), object.getDentista(), object.getDataConsulta());
        return consultaRepository.editar(consulta, object.getId());
    }
}
