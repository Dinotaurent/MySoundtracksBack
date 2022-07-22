/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mysoundtracksbackend.controllers;

import com.mysoundtracksbackend.models.entity.Artista;
import com.mysoundtracksbackend.models.services.IArtistaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author danie
 */
@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
public class ArtistaRestController {
    
    @Autowired
    private IArtistaService artistaService;
    
    @GetMapping("/artistas")
    public List<Artista> listarTodos(){
        return artistaService.findAll();
    }
    
    @GetMapping("/artistas/{id}")
    public Artista buscarArtistaXId(@PathVariable Long id){
        return artistaService.findById(id);
    }
    
    @PostMapping("/artistas")
    @ResponseStatus(HttpStatus.CREATED)
    public Artista crearArtista(@RequestBody Artista artista){
        return artistaService.save(artista);
    }
    
    @PutMapping("artistas/{id}")
    public Artista actualizarArtista(@RequestBody Artista artista, @PathVariable Long id){
        Artista artistaActual = artistaService.findById(id);
        
        artistaActual.setNombre(artista.getNombre());
        artistaActual.setImagen(artista.getImagen());
        
        return artistaService.save(artistaActual);
    }
    
    @DeleteMapping("artistas/{id}")
    public void eliminarArtista(@PathVariable Long id){
        artistaService.delete(id);
    }
    
}
