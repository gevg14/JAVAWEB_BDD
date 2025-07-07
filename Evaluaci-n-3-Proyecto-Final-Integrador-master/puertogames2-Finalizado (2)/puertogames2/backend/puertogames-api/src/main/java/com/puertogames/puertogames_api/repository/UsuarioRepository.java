package com.puertogames.puertogames_api.repository;

import com.puertogames.puertogames_api.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByCorreo(String correo);
    Optional<Usuario> findByCorreoAndPassword(String correo, String password);
}


