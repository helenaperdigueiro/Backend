package com.helena.aula25.controller;

import com.helena.aula25.dao.ConsultaDao;
import com.helena.aula25.model.Consulta;
import com.helena.aula25.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("consulta")
public class ConsultaController implements IController<Consulta, ConsultaDao>{
    @Autowired
    private ConsultaService consultaService;

    @Override

    public ResponseEntity<Map<Integer, Consulta>> getMethod() {
        return ResponseEntity.status(HttpStatus.OK).body(consultaService.buscar());
    }

    @Override
    public ResponseEntity<String> deleteMethod(@PathVariable Integer id) {
        consultaService.deletar(id);
        return ResponseEntity.ok("Deletado com sucesso");
    }

    @Override
    public ResponseEntity<Consulta> postMethod(@RequestBody ConsultaDao consultaDao) {
        Consulta consulta = consultaService.criar(consultaDao);
        if(consulta == null) {
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(consulta);
    }

    @Override
    public ResponseEntity<Consulta> putMethod(@RequestBody ConsultaDao consultaDao) {
        return ResponseEntity.status(200).body(consultaService.editar(consultaDao));
    }
}
