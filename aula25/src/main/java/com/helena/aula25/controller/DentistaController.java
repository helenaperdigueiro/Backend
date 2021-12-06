package com.helena.aula25.controller;

import com.helena.aula25.dao.DentistaDao;
import com.helena.aula25.model.Dentista;
import com.helena.aula25.service.DentistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("dentista")
public class DentistaController implements IController<Dentista, DentistaDao> {
    @Autowired
    private DentistaService dentistaService;

    @Override
    public ResponseEntity<Map<Integer, Dentista>> getMethod() {
        return ResponseEntity.status(200).body(dentistaService.buscar());
    }

    @Override
    public ResponseEntity<String> deleteMethod(Integer id) {
        dentistaService.deletar(id);
        return ResponseEntity.status(200).body("Deletado com sucesso");
    }

    @Override
    public ResponseEntity<Dentista> postMethod(DentistaDao dao) {
        Dentista dentista = dentistaService.criar(dao);
        if(dentista == null) {
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(dentista);
    }

    @Override
    public ResponseEntity<Dentista> putMethod(DentistaDao dao) {
        return ResponseEntity.status(200).body(dentistaService.editar(dao));
    }
}
