package com.helena.aula22.controller;

import com.helena.aula22.dao.DentistaDao;
import com.helena.aula22.domain.Dentista;
import com.helena.aula22.service.DentistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("dentista")
public class DentistaController {
    @Autowired
    private DentistaService dentistaService;

    @PostMapping
    public Dentista postDentista(@RequestBody DentistaDao dentistaDao) {
        return dentistaService.registrarDentista(dentistaDao);
    }

    @GetMapping("buscarDentista/{id}")
    public Dentista getDentista(@PathVariable("id") Integer id) {
        return dentistaService.buscarDentista(id);
    }

    @GetMapping("listarDentistas")
    public Map<Integer, Dentista> getDentistas() {
        return dentistaService.listarDentistas();
    }

    @PutMapping
    public Dentista putDentista(@RequestBody DentistaDao dentistaDao) {
        return dentistaService.atualizarDentista(dentistaDao);
    }

    @DeleteMapping("dentista/{id}")
    public String deleteDentista(@PathVariable("id") Integer id) {
        return dentistaService.deletarDentista(id);
    }
}
