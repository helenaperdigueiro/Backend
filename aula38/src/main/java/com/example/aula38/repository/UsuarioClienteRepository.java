package com.example.aula38.repository;

import com.example.aula38.model.Usuario;
import com.example.aula38.model.UsuarioCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioClienteRepository extends JpaRepository<UsuarioCliente, Integer> {

    UsuarioCliente findByUsername(String username);
}
