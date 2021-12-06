package com.helena.aula23.dao;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.helena.aula23.model.Dentista;
import com.helena.aula23.model.Paciente;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ConsultaDao {
    private Integer id;
    private Paciente paciente;
    private Dentista dentista;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date dataConsulta;
}
