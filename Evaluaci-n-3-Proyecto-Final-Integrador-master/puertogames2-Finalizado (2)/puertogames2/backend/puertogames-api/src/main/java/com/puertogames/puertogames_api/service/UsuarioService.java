package com.puertogames.puertogames_api.service;

import com.puertogames.puertogames_api.model.Usuario;
import com.puertogames.puertogames_api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    //Registar
    public Usuario registrar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    //Login
    public Optional<Usuario> login(String correo, String password) {
        return usuarioRepository.findByCorreoAndPassword(correo, password);
    }

}

