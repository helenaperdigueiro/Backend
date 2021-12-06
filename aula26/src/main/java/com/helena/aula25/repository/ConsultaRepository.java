package com.helena.aula25.repository;

import com.helena.aula25.model.Consulta;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ConsultaRepository implements IRepository<Consulta>{
    public static Map<Integer, Consulta> mapConsulta = new HashMap<>();


    @Override
    public Map<Integer, Consulta> criar(Consulta object) {
        Integer id = mapConsulta.size() + 1;
        mapConsulta.put(id, object);
        Map<Integer, Consulta> mapCriar = new HashMap<>();
        mapCriar.put(id, mapConsulta.get(id));
        return mapCriar;
    }

    @Override
    public Map<Integer, Consulta> editar(Consulta object, Integer id) {
        Consulta editarConsulta = mapConsulta.get(id);
        editarConsulta.setDataConsulta(object.getDataConsulta());
        Map<Integer, Consulta> mapEditar = new HashMap<>();
        mapEditar.put(id, editarConsulta);
        return mapEditar;
    }

    @Override
    public Map<Integer, Consulta> buscarTodos() {
        return mapConsulta;
    }

    @Override
    public Map<Integer, Consulta> buscar(Integer id) {
        Map<Integer, Consulta> mapBuscar = new HashMap<>();
        mapBuscar.put(id, mapConsulta.get(id));
        return mapBuscar;
    }

    @Override
    public void deletar(Integer id) {
        mapConsulta.remove(id);
    }
}
