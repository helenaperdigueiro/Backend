package com.helena.aula22.service;

import com.helena.aula22.dao.DentistaDao;
import com.helena.aula22.domain.Dentista;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DentistaService {
    private static Map<Integer, Dentista> flyweight = new HashMap<>();

    public Dentista registrarDentista(DentistaDao dentistaDao) {
        Integer id = flyweight.size()+1; //para nao comecar no 0
        Dentista dentista = new Dentista(dentistaDao.getNome(), dentistaDao.getSobrenome(), dentistaDao.getMatricula());
        flyweight.put(id, dentista);
        return flyweight.get(id);
    }

    public Dentista buscarDentista(Integer id) {
        return flyweight.get(id);
    }

    public Map<Integer, Dentista> listarDentistas() {
        return flyweight;
    }

    public Dentista atualizarDentista(DentistaDao dentistaDao) {
        Dentista dentista = flyweight.get(dentistaDao.getId());
        dentista.setNome(dentistaDao.getNome());
        dentista.setSobrenome(dentistaDao.getSobrenome());
        return dentista;
    }

    public String deletarDentista(Integer id) {
        flyweight.remove(id);
        return String.format("O dentista com id %s foi deletado", id);
    }
}
