package com.helena.aula25.service;

import com.helena.aula25.dao.ConsultaDao;
import com.helena.aula25.model.Consulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ConsultaService implements IService<Consulta, ConsultaDao>{
    private static Map<Integer, Consulta> mapConsulta = new HashMap<>();

    @Autowired
    public PacienteService pacienteService;
    @Autowired
    public DentistaService dentistaService;

    @Override
    public Map<Integer, Consulta> buscar() {
        return mapConsulta;
    }
    @Override
    public void deletar(Integer id) {
        mapConsulta.remove(id);
    }
    @Override
    public Consulta criar(ConsultaDao dao) {
        Integer id = mapConsulta.size() + 1;

        mapConsulta.put(id, new Consulta(dao.getPaciente(), dao.getDentista(), dao.getDataConsulta()));
        return mapConsulta.get(id);
    }
    @Override
    public Consulta editar(ConsultaDao dao) {
        Consulta consulta = mapConsulta.get(dao.getId());
        consulta.setDataConsulta(dao.getDataConsulta());
        return consulta;
    }
}
