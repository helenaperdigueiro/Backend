package com.helena.aula23.service;

import com.helena.aula23.dao.ConsultaDao;
import com.helena.aula23.model.Consulta;
import com.helena.aula23.model.Dentista;
import com.helena.aula23.model.Paciente;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ConsultaService {
    private static Map<String, Dentista> mapDentista = new HashMap<>();
    private static Map<String, Paciente> mapPaciente = new HashMap<>();
    private static Map<Integer, Consulta> mapConsulta = new HashMap<>();

    public ConsultaService() {
        mapDentista.put("123456", new Dentista("Ana Beatriz", "anabeatriz@gmail.com", "123456"));
        mapDentista.put("234567", new Dentista("Jonas Silva", "jonassilva@gmail.com", "234567"));
        mapDentista.put("345678", new Dentista("Julio Alberto", "julioalberto@gmail.com", "345678"));

        mapPaciente.put("lucaspaglia@gmail.com", new Paciente("Lucas", "Paglia", "lucaspaglia@gmail.com"));
        mapPaciente.put("antoniosantos@gmail.com", new Paciente("Antonio", "Santos", "antoniosantos@gmail.com"));
        mapPaciente.put("samantarodrigues@gmail.com", new Paciente("Samanta", "Rodrigues", "samantarodrigues@gmail.com"));

    }

    public Map<Integer, Consulta> buscarConsulta() {
        return mapConsulta;
    }
    public void deletarConsulta(Integer id) {
        mapConsulta.remove(id);
    }
    public Consulta criarConsulta(ConsultaDao consultaDao) {
        if(!mapDentista.containsKey(consultaDao.getDentista().getCredencial()) || !mapPaciente.containsKey(consultaDao.getPaciente().getEmail())) {
            return null;
        }
        Integer id = mapConsulta.size() + 1;

        mapConsulta.put(id, new Consulta(consultaDao.getPaciente(), consultaDao.getDentista(), consultaDao.getDataConsulta()));
        return mapConsulta.get(id);
    }
    public Consulta editarConsulta(ConsultaDao consultaDao) {
        Consulta consulta = mapConsulta.get(consultaDao.getId());
        consulta.setDataConsulta(consultaDao.getDataConsulta());
        return consulta;
    }
}
