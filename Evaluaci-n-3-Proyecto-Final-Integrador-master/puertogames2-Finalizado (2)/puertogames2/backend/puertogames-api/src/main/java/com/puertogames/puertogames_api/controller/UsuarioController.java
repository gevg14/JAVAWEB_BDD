package com.puertogames.puertogames_api.controller;

import com.puertogames.puertogames_api.model.Usuario;
import com.puertogames.puertogames_api.repository.UsuarioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @PostMapping("/crear/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> datos) {
        String correo = datos.get("correo");
        String password = datos.get("password");

        Optional<Usuario> usuario = usuarioRepository.findByCorreoAndPassword(correo, password);

        if (usuario != null) {
            return ResponseEntity.ok(usuario);
        } else {
            // ⚠️ Aquí devolvemos 401 sin lanzar excepción
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciales no válidas");
        }
    }
}

