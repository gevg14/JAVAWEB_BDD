package com.puertogames.puertogames_api.controller;

import com.puertogames.puertogames_api.model.Videojuego;
import com.puertogames.puertogames_api.repository.VideojuegoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/videojuegos")
@CrossOrigin("*")//para que mi api reciba peticiones desde cualquier parte
public class VideojuegoController {
    private final VideojuegoRepository repo;
    public  VideojuegoController(VideojuegoRepository repo){
        this.repo=repo;
    }

    @GetMapping
    public List<Videojuego> listar(){
        return repo.findAll();
    }
    @PostMapping
    public Videojuego crear(@RequestBody Videojuego v){
        return repo.save(v);
    }
    @PutMapping("/{id}")
    public Videojuego actualizar(@PathVariable Long id, @RequestBody Videojuego v){
        v.setId(id);
        v.setNombre(v.getNombre());
        v.setCategoria(v.getCategoria());
        v.setVentas(v.getVentas());
        v.setPlataforma(v.getPlataforma());
        return repo.save(v);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
        repo.deleteById(id);
    }
}
