package com.helena.aula25.service;

import com.helena.aula25.dao.PacienteDao;
import com.helena.aula25.model.Paciente;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PacienteService implements IService<Paciente, PacienteDao> {
    private static Map<Integer, Paciente> mapPaciente = new HashMap<>();

    @Override
    public Map<Integer, Paciente> buscar() {
        return mapPaciente;
    }
    @Override
    public void deletar(Integer id) {
        mapPaciente.remove(id);
    }
    @Override
    public Paciente criar(PacienteDao dao) {
        Integer id = mapPaciente.size() + 1;

        mapPaciente.put(id, new Paciente(dao.getNome(), dao.getSobrenome(), dao.getEmail()));
        return mapPaciente.get(id);
    }
    @Override
    public Paciente editar(PacienteDao dao) {
        Paciente paciente = mapPaciente.get(dao.getId());
        paciente.setEmail(dao.getEmail());
        return paciente;
    }
}
