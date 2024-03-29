package com.example.aula38.service;

import com.example.aula38.model.Usuario;
import com.example.aula38.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findByUsername(username);
        Set<GrantedAuthority> grantList = new HashSet<GrantedAuthority>();
        grantList.add(new SimpleGrantedAuthority("USER"));

        UserDetails user = new User(usuario.getUsername(), ("{noop}" + usuario.getPassword()), grantList);
        return user;
    }
}
