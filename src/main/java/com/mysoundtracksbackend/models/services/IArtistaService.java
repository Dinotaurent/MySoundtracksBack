/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mysoundtracksbackend.models.services;

import com.mysoundtracksbackend.models.entity.Artista;
import java.util.List;

/**
 *
 * @author danie
 */
public interface IArtistaService {

    public List<Artista> findAll();

    public Artista findById(Long id);

    public Artista save(Artista artista);

    public void delete(Long id);
}
