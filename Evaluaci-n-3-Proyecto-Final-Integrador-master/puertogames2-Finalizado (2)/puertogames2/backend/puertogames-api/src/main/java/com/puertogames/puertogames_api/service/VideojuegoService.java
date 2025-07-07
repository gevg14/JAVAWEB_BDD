package com.puertogames.puertogames_api.service;

import com.puertogames.puertogames_api.model.Videojuego;
import com.puertogames.puertogames_api.repository.VideojuegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideojuegoService {

    @Autowired
    private VideojuegoRepository videojuegoRepository;
    public List<Videojuego> obtenerTodos() {
        return videojuegoRepository.findAll();
    }

    public Videojuego guardar(Videojuego videojuego) {
        return videojuegoRepository.save(videojuego);
    }

    public void eliminar(Long id) {
        videojuegoRepository.deleteById(id);
    }
}
