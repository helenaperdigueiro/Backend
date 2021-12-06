package com.example.aula38.service;

import com.example.aula38.model.UsuarioCliente;
import com.example.aula38.repository.UsuarioClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioClienteService {
    @Autowired
    private UsuarioClienteRepository usuarioClienteRepository;

    public UsuarioCliente insertUsuarioCliente(UsuarioCliente user) {
        UsuarioCliente usuarioCliente = new UsuarioCliente(user.getUsername(), user.getPassword(), user.getEmail());

        return usuarioClienteRepository.save(usuarioCliente);
    }

    public UsuarioCliente checkUsuarioCliente(UsuarioCliente user) {
        UsuarioCliente usuarioCliente = usuarioClienteRepository.findByUsername(user.getUsername());
        return usuarioCliente;
    }
}
